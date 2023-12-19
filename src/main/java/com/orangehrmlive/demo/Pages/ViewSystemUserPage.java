package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUserPage extends Utility  {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement verifyTextSystemUser;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']" )
    WebElement clickingAddButton ;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]" )
    WebElement enterUsername;

    public String verifyTextSystemUser(){
      String message = getTextFromElement(verifyTextSystemUser);
        log.info("SystemUser: " + verifyTextSystemUser.toString());
        return message;
    }

    public void clickOnAddButton(){
        log.info("AddButton: " + clickingAddButton.toString());
        clickOnElement(clickingAddButton);
    }
    public void setEnterUsername(String user){
        log.info("Username: " + enterUsername.toString());
        sendTextToElement(enterUsername,user);
    }





    }


