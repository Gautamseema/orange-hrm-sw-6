package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
    @Given("I am on User page")
    public void iAmOnUserPage() {

    }

    @When("Login to Application")
    public void loginToApplication() {
      new HomePage().enterUserName("Admin");
      new HomePage().enterPassWord("admin123");
      new LoginPage().setClickOnLogin();
    }

    @Then("click On {string} Tab")
    public void clickOnTab(String Admin) {
      new AdminPage().clickOnAdmin();
    }

    @Then("Verify {string} Text")
    public void verifyText(String SystemUser) {
     new ViewSystemUserPage().verifyTextSystemUser();
    }

    @And("click On {string} button")
    public void clickOnButton1(String AddButton){
        new ViewSystemUserPage().clickOnAddButton();
    }

    @And("Select User Role {string}")
    public void selectUserRole(String Admin) {
        new AdminPage().selectAdminFromDropDown();
    }

    @And("enter Employee Name {string}")
    public void enterEmployeeName(String arg0) {
        new AddUserPage().setEnterEmployeeName("Ananya Dash");
    }

    @And("enter Username")
    public void enterUsername1() {
        new AddUserPage().setEnterTheUserName("Ananya Dash");
    }

    @And("Select status {string}")
    public void selectStatus(String Disable ) {
        new AddUserPage().setSelectDisable();
    }

    @And("enter psaaword")
    public void enterPsaaword() {
        new HomePage().enterPassWord("admin123");
    }

    @And("enter Confirm Password")
    public void enterConfirmPassword() {
        new AddUserPage().setConfirmPassword("admin123");
    }

    @And("click On {string} Button")
    public void clickOnButton2(String SaveButton) {
        new AddUserPage().setClickOnSaveButton();
    }

    @Then("verify message {string}")
    public void verifyMessage(String Message) {
        new ViewSystemUserPage().verifyTextSystemUser() ;
    }

    @When("Enter Username")
    public void enterUsername() {
        new AddUserPage().setEnterTheUserName("Maya");
    }

    @And("Select User Role")
    public void selectUserRole() {
        new AddUserPage().setUserRoleSelect("Admin");
    }

    @And("Select Satatus")
    public void selectSatatus() {
        new AddUserPage().selectStatusEnable("Disable");
    }

    @And("Click on {string} Button")
    public void clickOnButton(String searchButton) {
        new AddUserPage().clickOnSearchButton();
    }

    @And("Verify the User should be in Result list.")
    public void verifyTheUserShouldBeInResultList() {
        new AddUserPage().setVerifyTheResult();
    }

    @And("Click on Check box")
    public void clickOnCheckBox() {
        new AddUserPage().setTickOnCheckbox();
    }

    @And("Click on Delete Button")
    public void clickOnDeleteButton() {
        new AddUserPage().setClickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {
        new AddUserPage().verifyThePopUpWindowIsDisplayed();
    }

    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new AddUserPage().clickOnYesButton();
    }

    @And("Enter Username <username>")
    public void enterUsernameUsername() {
        new AddUserPage().setEnterTheUserName("Maya");
    }

    @And("Select User Role <userRole>")
    public void selectUserRoleUserRole() {
        new AddUserPage().setUserRoleSelect("Admin");
    }

    @And("Enter EmployeeName <employeeName>")
    public void enterEmployeeNameEmployeeName() {
        new AddUserPage().setEnterEmployeeName("Ananya Dash");
    }

    @And("Select Satatus <status>")
    public void selectSatatusStatus() {
        new AddUserPage().selectStatusEnable("DISABLE");
    }

    @And("Click on {string} Button verify message {string}")
    public void clickOnButtonVerifyMessage(String arg0, String arg1) {
    }

    @And("Verify username <username>")
    public void verifyUsernameUsername() {
    }

    @And("Click on Reset Tab")
    public void clickOnResetTab() {
        new AddUserPage().clickOnReSetButton();
    }
}
