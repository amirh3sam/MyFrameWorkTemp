package com.FrameWork.steps;
import com.FrameWork.utility.BrowserUtil;
import com.FrameWork.utility.Driver;
import io.cucumber.java.en.Given;


import org.openqa.selenium.Cookie;

import java.util.Set;

public class US11{

     @Given("user retrived all the cookies name")
public void user_retrived_all_the_cookies_name() {
         BrowserUtil.waitFor(20);
         Set<Cookie> cookies = Driver.getDriver().manage().getCookies();


         // Print all cookies
         for (Cookie cookie : cookies) {
             System.out.println("Cookie Name: " + cookie.getName());
             System.out.println("Cookie Value: " + cookie.getValue());
             System.out.println("Domain: " + cookie.getDomain());
             System.out.println("Path: " + cookie.getPath());
             System.out.println("Expiry: " + cookie.getExpiry());
             System.out.println("Secure: " + cookie.isSecure());
             System.out.println("HttpOnly: " + cookie.isHttpOnly());
             System.out.println("----------");
         }



         }

     }