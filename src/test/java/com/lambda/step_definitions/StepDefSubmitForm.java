package com.lambda.step_definitions;

import com.lambda.pages.FormDemoPage;
import com.lambda.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class StepDefSubmitForm {

    WebDriver driver = Hook.driver;

    MainPage mainPage = new MainPage(driver);

    FormDemoPage demoPage = new FormDemoPage(driver);

    @Given("user is on main page of lambda user clicks on input form")
    public void user_is_on_main_page_of_lambda_user_clicks_on_input_form() {
        mainPage.clickOnSubmitForm();
    }
    @Then("user enters name email and password as follows")
    public void user_enters_name_email_and_password_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        demoPage.personalInfo(map.get("name"), map.get("email"), map.get("password"));
    }
    @When("user enters company website and selects country as follows")
    public void user_enters_company_website_and_selects_country_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        demoPage.compWebCountry(map.get("company"), map.get("website"), map.get("country"));
    }
    @Then("user provides city address1 and address2")
    public void user_provides_city_address1_and_address2(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        demoPage.cityAddress1and2(map.get("city"), map.get("address1"), map.get("address2"));
    }
    @When("user enters state and zipcode and clicks on submit button")
    public void user_enters_state_and_zipcode_and_clicks_on_submit_button(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        demoPage.stateZip(map.get("state"), map.get("zipcode"));
    }
    @Then("user validates success message as follows")
    public void user_validates_success_message_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        String expectedMessage = demoPage.getSuccessMessage();
        Assert.assertEquals(expectedMessage, map.get("successMessage"));
    }
}
