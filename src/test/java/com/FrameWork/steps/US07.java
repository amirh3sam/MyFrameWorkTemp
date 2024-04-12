package com.FrameWork.steps;

import com.google.protobuf.StringValue;
import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class US07 {

    @Given("read data from Excel file")
    public void read_data_from_excel_file() throws IOException {

        String path = "src/test/resources/excelFiles/Book1.xlsx";

        //to read from Excel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //<1> create a workbook
        XSSFWorkbook workBook = new XSSFWorkbook (fileInputStream);

        //<2> We need to get specific sheet from currently opened workbook

        XSSFSheet sheet = workBook.getSheet("Persons");

        //<3> select row and cell

        //Indexing start from 0
        // get amir row
        System.out.println(sheet.getRow(1).getCell(0));

        // Return the count of used cells only
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);


        //Returns the number from top cell to bottom cell
        // it does not care if the cell is empty or not
        //start counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);


        //TODO: Create a logic to print "sam" name from our data
        // if you know you have some empty space rows you can used lastUsedRow
        // we know the name is in first column = 0 ;
        for(int rowNum = 0 ; rowNum < usedRows; rowNum ++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("sam")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        //TODO: Creat logic to print out amir phone number
        // we are going to check amir -- > print out phone number
// Create a DecimalFormat object to format the phone number
        /*
        This code uses DecimalFormat to format the phone number without scientific notation. The # symbol in the pattern
        represents a digit, and getNumericCellValue() retrieves the numeric value from the cell. Then, the formatted phone number is printed out.
         */
        DecimalFormat decimalFormat = new DecimalFormat("#");

        for(int rowNum =0 ; rowNum < usedRows ; rowNum++ ){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("amir")){
                String phoneNumber = decimalFormat.format(sheet.getRow(rowNum).getCell(2).getNumericCellValue());

                System.out.println("amir phone number: " + phoneNumber);
                ;//get phone number cell
            }
        }

    }
}
