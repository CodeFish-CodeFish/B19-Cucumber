package com.web_orders.step_definitions;

import com.web_orders.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Authentication {

    // This class is used when logging into web order app
    WebDriver driver = Hook.driver;

    LoginPage loginPage = new LoginPage(driver);

    @Given("user is login page of web order")
    public void user_is_login_page_of_web_order() {
        Assert.assertTrue(driver.getTitle().contains("Weborder"));
    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) throws Exception {
        loginPage.signIn(username, password);
    }

    @Then("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() throws Exception {
        loginPage.setSignInButton();
    }
}
