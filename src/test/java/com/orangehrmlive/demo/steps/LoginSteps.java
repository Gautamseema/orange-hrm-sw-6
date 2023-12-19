package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.Pages.DashboardPage;
import com.orangehrmlive.demo.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on login page")
    public void iAmOnLoginPage() {

    }

    @When("Enter username")
    public void enterUsername() {
        new HomePage().enterUserName("Admin");
    }

    @And("Enter password")
    public void enterPassword() {
        new HomePage().enterPassWord("admin123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @Then("Verify {string} Message")
    public void verifyMessage(String Welcome) {
    }

    @Then("Verify Logo is Displayed")
    public void verifyLogoIsDisplayed() {
        new HomePage().hrmLogo();
    }

    @And("Click on User Profile logo")
    public void clickOnUserProfileLogo() {
        new DashboardPage().clickOnProfilePhoto();
    }

    @And("Mouse hover on Logout and click")
    public void mouseHoverOnLogoutAndClick() {
        new DashboardPage().clickOnLogOut();
    }

    @And("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String loginPanel) {
        String String;
        Assert.assertEquals(new DashboardPage().getLoginPanel(),"error message not displayed");
    }
}
