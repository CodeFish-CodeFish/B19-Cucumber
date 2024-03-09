package com.qa_fox.step_definitions;

import com.qa_fox.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;

public class LoginSteps {
    WebDriver driver = Hook.driver;

    LoginPage loginPage = new LoginPage(driver);

    @When("user is login page user validates title as {string}")
    public void user_is_login_page_user_validates_title_as(String expectedTitle) {
        Assert.assertEquals(expectedTitle, BrowserUtils.getTitleWithJS(driver));
    }
    @Then("user enters email as {string} and password as {string} and validates error msg as {string}")
    public void user_enters_email_as_and_password_as_and_validates_error_msg_as(String email, String password, String errorMessage) throws Exception {

        loginPage.login(email, password, errorMessage);

    }

}
