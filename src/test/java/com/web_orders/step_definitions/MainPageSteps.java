package com.web_orders.step_definitions;

import com.web_orders.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {

    WebDriver driver = Hook.driver;

    MainPage mainPage = new MainPage(driver);

    @Given("user is on main page user clicks on group order radio button")
    public void user_is_on_main_page_user_clicks_on_group_order_radio_button() throws Exception {
       mainPage.clickOnRadio();
    }
    @Then("user selects {string} from the dropdown")
    public void user_selects_from_the_dropdown(String location) throws Exception {
        mainPage.chooseLocation(location);
    }
    @Then("use validates office address as {string}")
    public void use_validates_office_address_as(String address) {
        String actualAddress = mainPage.getAddressText();
        Assert.assertTrue("Failed to validate location address ",actualAddress.contains(address));
    }
    @Then("user leaves note for guests as {string}")
    public void user_leaves_note_for_guests_as(String note) throws Exception {

        mainPage.sendKeysToGuestNotes(note);

    }
    @Then("user enters info into invitee list as {string}")
    public void user_enters_info_into_invitee_list_as(String emails) throws Exception {
      mainPage.sendKeysToGuestList(emails);
    }
    @Then("user clicks on create group order button")
    public void user_clicks_on_create_group_order_button() throws Exception {
       mainPage.clickOnCreateGrOrdBtn();
    }
    @Then("user validates on main header {string} on the next page")
    public void user_validates_on_main_header_on_the_next_page(String header) {
        String actualHeader = mainPage.getHeaderText(driver, header);
        Assert.assertEquals("Failed to validate header ",header, actualHeader);
    }
    @Then("user validates total participant as {string}")
    public void user_validates_total_participant_as(String participantNumber) {
        String actualNumber = mainPage.getParticipantNumber();
        Assert.assertEquals("Failed to validate total participant number ",participantNumber, actualNumber);

    }
}
