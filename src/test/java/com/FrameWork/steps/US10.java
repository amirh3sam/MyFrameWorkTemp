package com.FrameWork.steps;

import com.FrameWork.pages.SeleniumTestPage;
import com.FrameWork.utility.ConfigurationReader;
import com.FrameWork.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;

public class US10 {
    SeleniumTestPage seleniumTestPage =new SeleniumTestPage();

    @Given("user open web page")
    public void user_open_web_page() {

        //browser open in hooks class

    }

    @When("user click on gmail button")
    public void user_click_on_gmail_button() {

Actions actions =new Actions(Driver.getDriver());
actions.moveToElement(seleniumTestPage.input_firstname).click().sendKeys("amir").perform();


    }
}
