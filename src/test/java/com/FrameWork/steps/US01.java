package com.FrameWork.steps;

import com.FrameWork.pages.XpathPractice;
import com.FrameWork.utility.BrowserUtil;
import com.FrameWork.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US01 {

XpathPractice xpathPractice =new XpathPractice();
Actions actions = new Actions(Driver.getDriver());


    @Given("as user hover  {string} tab")
    public void as_user_hover_tab(String string) {

        BrowserUtil.waitFor(20);
    actions.moveToElement(xpathPractice.xpathTab).build().perform();

        Assert.assertEquals(string,xpathPractice.getXpathTabName.getText());

    }

    @Then("click on {string}")
    public void click_on(String string) {
        actions.moveToElement(xpathPractice.xpathPractice).click().perform();
    }


}
