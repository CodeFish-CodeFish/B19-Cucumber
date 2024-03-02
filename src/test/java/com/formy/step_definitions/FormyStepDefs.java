package com.formy.step_definitions;

import com.formy.pages.AutoCompletePage;
import com.formy.pages.FormyMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyStepDefs {

    // This framework will be called BDD framework -->Behavior Driven Development
    WebDriver driver = new ChromeDriver();

    FormyMainPage mainPage = new FormyMainPage(driver);
    AutoCompletePage autoCompletePage = new AutoCompletePage(driver);

    @Given("user is navigated to formy webpage")
    public void user_is_navigated_to_formy_webpage() {
        driver.get("https://formy-project.herokuapp.com/");
    }
    @When("user clicks on auto complete link")
    public void user_clicks_on_auto_complete_link() {
        mainPage.clickOnAutoComplete();
    }
    @Then("user fills out all the input fields")
    public void user_fills_out_all_the_input_fields() {
        autoCompletePage.fillInputFields("1 N Dearborn st","Street name");
        System.out.println("optional text");
    }
    @Then("user quits the driver")
    public void user_quits_the_driver() throws InterruptedException {
        Thread.sleep(2000);
       driver.quit();
    }

}
