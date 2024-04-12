package com.FrameWork.pages;

import com.FrameWork.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTestPage {

    public SeleniumTestPage() {  PageFactory.initElements(Driver.getDriver(), this); // this is for WebElement Initialization:


    }
    //2-->
    @FindBy(xpath = "//a[.='Blog']")
    public WebElement blogTab;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement input_firstname;

}
