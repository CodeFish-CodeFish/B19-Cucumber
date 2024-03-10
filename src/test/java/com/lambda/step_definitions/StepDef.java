package com.lambda.step_definitions;

import com.lambda.pages.AjaxSubmitPage;
import com.lambda.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class StepDef {

    WebDriver driver = Hook.driver;

    MainPage mainPage = new MainPage(driver);
    AjaxSubmitPage submitPage = new AjaxSubmitPage(driver);

    @Given("user is on main page of lambda user clicks on ajax submit form")
    public void user_is_on_main_page_of_lambda_user_clicks_on_ajax_submit_form() {
        mainPage.clickOnAjax();
    }

    @Then("user enters name and message as follows")
    public void user_enters_name_and_message_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        submitPage.nameAndMessage(map.get("name"), map.get("message"));
    }

    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        submitPage.clickOnSubmit();
    }

    @Then("user validates ajax message as follows")
    public void user_validates_ajax_message_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        Assert.assertEquals(map.get("expectedMessage"), submitPage.getAjaxMessage());
    }


}
