package com.FrameWork.steps;

import io.cucumber.java.en.Given;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class US08 {
    @Given("write data from Excel file")
    public void write_data_from_excel_file() throws IOException {

        String path = "src/test/resources/excelFiles/Book1.xlsx";

        //to read from Excel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //<1> create a workbook
        XSSFWorkbook workBook = new XSSFWorkbook (fileInputStream);

        XSSFSheet sheet = workBook.getSheet(("Persons"));
            //<2> create new cell as salary and add value for each row

        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");
        XSSFCell salary_1 = sheet.getRow(1).createCell(3);
        salary_1.setCellValue(200000);
        XSSFCell salary_2 = sheet.getRow(2).createCell(3);
        salary_2.setCellValue(150000);
        XSSFCell salary_3 = sheet.getRow(3).createCell(3);
        salary_3.setCellValue(250000);
        //TODO: NOTE
        // open to write file :FileInputStream -->reading
        // save change file : FileOutPutStream-->writhing

        FileOutputStream outputStream =new FileOutputStream(path);
        //save / write changes to workbook

        workBook.write(outputStream);

    }

}
