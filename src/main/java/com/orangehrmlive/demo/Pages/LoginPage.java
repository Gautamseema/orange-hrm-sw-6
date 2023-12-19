package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnLogin;



    public void setClickOnLogin() {
        log.info("LoginButton: " +clickOnLogin.toString());
        clickOnElement(clickOnLogin);
}
}