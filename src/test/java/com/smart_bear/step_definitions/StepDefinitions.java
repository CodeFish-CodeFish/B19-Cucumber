package com.smart_bear.step_definitions;

import com.smart_bear.pages.LoginPage;
import com.smart_bear.pages.MainPage;
import com.smart_bear.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class StepDefinitions {


    WebDriver driver = DriverHelper.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    OrderPage orderPage = new OrderPage(driver);

    MainPage mainPage = new MainPage(driver);

    @Given("user is on main page of login page and validates title as {string}")
    public void user_is_on_main_page_of_login_page_and_validates_title_as(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }
    @Then("user enters their username as {string} and password as {string}")
    public void user_enters_their_username_as_and_password_as(String username, String password) {
        loginPage.authenticate(username, password);
    }
    @Then("user clicks on login btn")
    public void user_clicks_on_login_btn() {
        loginPage.clickOnLoginBtn();
    }

    @When("user is on main page user clicks on order tab")
    public void user_is_on_main_page_user_clicks_on_order_tab() {
        mainPage.clickOnOrderTab();
    }
    @Then("user on order page selects {string} and enters quantity as {string}")
    public void user_on_order_page_selects_and_enters_quantity_as(String screenSaver, String quantity) {
        orderPage.selectSSAndQuantity(screenSaver, quantity, driver);
    }
    @Then("user enters price as {string} discount as {string} and total as {string}")
    public void user_enters_price_as_discount_as_and_total_as(String price, String discount, String total) {
        orderPage.priceDiscountAndTotal(price, discount, total, driver);
    }
    @Then("user enters their name as {string} and street address as {string}")
    public void user_enters_their_name_as_and_street_address_as(String name, String address) {
        orderPage.nameAddress(name, address, driver);
    }
    @When("user enters city as {string} and state as {string} and zipcode as {string}")
    public void user_enters_city_as_and_state_as_and_zipcode_as(String city, String state, String zipCode) {
        orderPage.cityStateAndZipCode(city, state, zipCode, driver);
    }
    @Then("user selects visa and provides cc as {string} and expiration date as {string}")
    public void user_selects_visa_and_provides_cc_as_and_expiration_date_as(String cc, String expirationDate) {
        orderPage.checkVisaClickCCAndExp(cc, expirationDate, driver);
    }
    @Then("user finally clicks on process button")
    public void user_finally_clicks_on_process_button() {
            orderPage.clickOnProcessBtn();
    }

}
