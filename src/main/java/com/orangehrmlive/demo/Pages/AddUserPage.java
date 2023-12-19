package com.orangehrmlive.demo.Pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility  {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" )
    WebElement verifyAddUserText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']" )
    WebElement enterEmployeeName;
    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']" )
    WebElement enterTheUserName;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRoleSelect;
    @CacheLookup
    @FindBy(xpath="//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]")
    WebElement selectEnable;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Cheeku123')]")
    WebElement  verifyTheResult;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement   tickOnCheckbox ;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement   clickOnDeleteButton;
    @CacheLookup
    @FindBy(xpath = ("(//div[@role='document'])[1]"))
    WebElement popUpWindow;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Yes, Delete']"))
    WebElement yesButton;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Reset']"))
    WebElement reSetButton;
    @CacheLookup
    @FindBy(xpath = ("//label[normalize-space()='Username']"))
    WebElement verifyUsername;
    @CacheLookup
    @FindBy(xpath = ("//span[normalize-space()='No Records Found']"))
    WebElement noRecordFound;




    public String getVerifyAddUserText() {
        String message = getTextFromElement(verifyAddUserText);
        log.info("AddUserText: " +verifyAddUserText.toString());
        return message ;
    }
    public void setEnterEmployeeName(String employeeName){
        log.info("EmployeeName : " + employeeName.toString());
        sendTextToElement(enterEmployeeName, employeeName);

    }
    public void setEnterTheUserName(String userName){
        log.info("UserName : " + userName.toString());
        sendTextToElement(enterTheUserName,userName);

    }
    public void setSelectDisable(){
        log.info("SelectDisable : " + selectDisable .toString());
        selectByIndexFromDropDown(selectDisable,0);

    }
    public void setConfirmPassword(String password){
        log.info("ConfirmPassword: " + confirmPassword.toString());
        sendTextToElement(confirmPassword,password);

    }
    public void setClickOnSaveButton(){
        log.info("ClickOnSaveButton: " + clickOnSaveButton.toString());
        clickOnElement(clickOnSaveButton);

    }
    public void setUserRoleSelect(String value){
        log.info("UserRoleSelect: " + userRoleSelect .toString());
        selectByVisibleTextFromDropDown(userRoleSelect ,value);

    }

    public void selectStatusEnable(String value){
        log.info("StatusEnable: " + selectEnable.toString());
        selectByVisibleTextFromDropDown(selectEnable,value);

    }

    public void clickOnSearchButton(){
        log.info("SearchButton: " + searchButton.toString());
        clickOnElement(searchButton);
    }
    public String setVerifyTheResult(){
        String message = getTextFromElement(verifyAddUserText);
        log.info("ResultText: " +verifyAddUserText.toString());
        return message ;
    }
    public void setTickOnCheckbox() {
        log.info("TickOnCheckbox: " + tickOnCheckbox.toString());
        clickOnElement(tickOnCheckbox);
    }
    public void setClickOnDeleteButton(){
        log.info("ClickOnDeleteButton: " + clickOnDeleteButton.toString());
        clickOnElement(clickOnDeleteButton);
    }
    public void verifyThePopUpWindowIsDisplayed() {
        log.info("PopUpWindow: " + popUpWindow.toString());
        verifyThatElementIsDisplayed(popUpWindow);
    }

    public void clickOnYesButton() {
        log.info("ClickOnYesButton: " + yesButton.toString());
        clickOnElement(yesButton);
    }

    public String verifyNoRecordFoundMessage( ) {
        String message = verifyNoRecordFoundMessage();
     log.info("NoRecordFound: " + noRecordFound.toString());
       return message;
   }

    public String  verifyUsernameLabel() {
        String message = verifyNoRecordFoundMessage();
        log.info("VerifyUsernameLabel: " + verifyUsername.toString());
        return message ;
    }

    public void clickOnReSetButton() {
        log.info("ClickOnResetButton: " + reSetButton.toString());
        clickOnElement(reSetButton);
    }

    public void addDetails(String username ,String userRole,String employeeName, String Status) {
        log.info("addDetails: " + username + employeeName + userRole + Status .toString());
        setEnterTheUserName(username);
        setEnterEmployeeName(employeeName);
        setUserRoleSelect(userRole);
        selectStatusEnable(Status);


    }
    }
