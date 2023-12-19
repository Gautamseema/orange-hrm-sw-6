package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility  {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]" )
    WebElement clickOnAdmin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input'][normalize-space()='Admin']")
    WebElement selectAdmin;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-layout-context'])[1]" )
    WebElement verifyMessageSucecessFully;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;


    public void clickOnAdmin(){
        log.info("ClickOnAdminButton: " + clickOnAdmin.toString());
        clickOnElement(clickOnAdmin);

    }
    public void selectAdminFromDropDown(){
        log.info("Admin: " + selectAdmin.toString());
        selectByVisibleTextFromDropDown(selectAdmin,"Admin");

    }
    public String verifySuccessfulyMessage(){
        String message = getTextFromElement(verifyMessageSucecessFully) ;
        log.info("VerifySuccessMessage: " + verifyMessageSucecessFully.toString());

        return message ;

    }
    public void clickOnSearchButton(){
        log.info("SearchButton: " + searchButton .toString());
        clickOnElement(searchButton);
    }
}
