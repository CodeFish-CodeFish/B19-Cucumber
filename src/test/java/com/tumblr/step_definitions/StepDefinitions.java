package com.tumblr.step_definitions;

import com.tumblr.pages.LoginPage;
import com.tumblr.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    WebDriver driver = Hook.driver;

    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on main page user clicks on login button")
    public void user_is_on_main_page_user_clicks_on_login_button() {
        mainPage.clickOnLogin();
    }

    @Then("user clicks on continue with email button")
    public void user_clicks_on_continue_with_email_button() {
        loginPage.clickOnContinueEmail();
    }

    @Then("user enters {string} and clicks on next button")
    public void user_enters_and_clicks_on_next_button(String email) {
        loginPage.enterEmail(email);
    }

    @Then("user enters {string} clicks on next button and validates {string}")
    public void user_enters_clicks_on_next_button_and_validates(String wrongPassword, String errorMessage) {
        loginPage.enterPasswordValidateError(wrongPassword, errorMessage);
    }

}
