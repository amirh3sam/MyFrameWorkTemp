package com.FrameWork.pages;

import com.FrameWork.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpathPractice {

    //1 - >
public XpathPractice() {
    PageFactory.initElements(Driver.getDriver(), this);

}
    //2-->
            @FindBy(xpath = "//div[@id=\"LinkList210\"]/ul/li[4]")
            public WebElement xpathTab;

            @FindBy(xpath ="//div[@id=\"LinkList210\"]/ul/li[4]/a[.=\"Selenium Practice\"]")
            public WebElement getXpathTabName;

            @FindBy(xpath = "//div[@id=\"LinkList210\"]/ul/li[4]/ul/li[3]/a")
             public WebElement xpathPractice;

}
