package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility  {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(name="username")
    WebElement userName;
    @CacheLookup
    @FindBy(name="password")
    WebElement passWard;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement logInLink;
    @CacheLookup
    @FindBy(xpath= "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement hrmLogo;
    @CacheLookup
    @FindBy(xpath= "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;
    @CacheLookup
    @FindBy(xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]" )
    WebElement displayLogo;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[1]")
    WebElement errorMessage;

    public void enterUserName(String value){
        log.info("UserName: " + userName.toString());
        sendTextToElement(userName,value);

    }
    public void enterPassWord(String  value){
        log.info("PassWord: " + passWard.toString());
        sendTextToElement(passWard, value);

    }
    public void clickOnLoginButton(){
        log.info("LoginButton: " + logInLink.toString());
        clickOnElement(logInLink);
    }
    public String verifyLogin(){
        String message = getTextFromElement(verifyLoginPanel);
        log.info("verifyLogine: " + verifyLoginPanel.toString());
        return message;

    }
    public void hrmLogo(){
        log.info("hrmLogo: " + hrmLogo.toString());
        driver.findElement((By) hrmLogo).isDisplayed();



    }
    public String displayLogoHome() {
        String message = getTextFromElement(displayLogo);
        log.info("displayLogoHome: " + displayLogo.toString());
        return message;
    }
    public String getErrorMessage() {
        String message= getTextFromElement(errorMessage);
        log.info("ErrorMessage: " + errorMessage.toString());
        return message;
    }
   // public void EnterDetails(){

    }

