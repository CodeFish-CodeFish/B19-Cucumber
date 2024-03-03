package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LoginStepDefs {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    // Login functionality
    @Given("user is navigated to login page")
    public void user_is_navigated_to_login_page() {
        driver.get("https://www.saucedemo.com/");
    }
    @When("user is on login page user enters username and password")
    public void user_is_on_login_page_user_enters_username_and_password() {
        loginPage.setLoginBtn("standard_user","secret_sauce");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginBtn();
    }
}
