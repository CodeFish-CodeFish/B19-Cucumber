package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.HomeMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.List;

public class StepDefinitions {

    WebDriver driver = DriverHelper.getDriver();
    HomeMainPage homeMainPage = new HomeMainPage(driver);

    // Scenario 1
    @Given("user is main page user validates title")
    public void user_is_main_page_user_validates_title() {
        String expectedTitle = "Swag Labs";
        String actualTitle = BrowserUtils.getTitleWithJS(driver);
        Assert.assertEquals("Failed to validate title in main page", expectedTitle, actualTitle);
    }

    @Then("user validates url")
    public void user_validates_url() {
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("Failed to validate url in main page", expectedURL, actualURL);
    }

    @Then("user validate main header")
    public void user_validate_main_header() {
        String expectedHeader = "Swag Labs";
        String actualHeader = homeMainPage.getHeader();
        Assert.assertEquals("Failed to validate main page header", expectedHeader, actualHeader);
    }


    // Scenario 2
    @When("user is on main page user validates header on the left nav bar")
    public void user_is_on_main_page_user_validates_header_on_the_left_nav_bar() {
        String expectedHeader = "Products";
        String actualHeader = homeMainPage.getHeaderOnLeftBar();
        Assert.assertEquals("Failed to validate header on left nav bar", expectedHeader, actualHeader);
    }

    @Then("user validates all the list of options from the dropdown")
    public void user_validates_all_the_list_of_options_from_the_dropdown() {
        List<WebElement> option = homeMainPage.validateOptionsSelect();
        for (int i = 0; i < option.size(); i++) {
            System.out.println(BrowserUtils.getText(option.get(i)));
            Assert.assertTrue(option.get(i).isDisplayed());
        }
    }

    @Then("user selects price low to high option")
    public void user_selects_price_low_to_high_option() {
        homeMainPage.selectLowToHigh();
    }

}
