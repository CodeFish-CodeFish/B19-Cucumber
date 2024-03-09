package com.web_orders.pages;

import com.sauce_labs.pages.HomeMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;

import java.time.Duration;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "label[class='custom-control-label']")
    WebElement groupOrderRadioBtn;

    @FindBy(how = How.CSS, using = "#getAddressNextButton")
    WebElement nextBtn;

    @FindBy(how = How.CSS, using = "#ConfirmAddressID")
    WebElement dropdownLocation;

    @FindBy(how = How.CSS, using = "#addressPreview")
    WebElement address;

    @FindBy(how = How.CSS, using = "#InviteNote")
    WebElement inviteNote;

    @FindBy(how = How.CSS, using = "#InviteList")
    WebElement inviteList;

    @FindBy(how = How.CSS, using = "#createGroupOrder")
    WebElement createGrOrdBtn;

    @FindBy(how = How.TAG_NAME, using = "h1")
    WebElement header;

    @FindBy(how = How.XPATH, using = "//label[.='Total Participants:']//following-sibling::div[contains(text(),'1')]")
    WebElement totalParticipantNbr;

    public void clickOnRadio() throws Exception {

        try {
            groupOrderRadioBtn.click();
            this.nextBtn.click();
        } catch (Exception e) {
            throw new Exception(
                    "Exception occurred when checking radio button " + e.getMessage()
            );
        }
    }

    public void chooseLocation(String location) throws Exception {

        try {
            BrowserUtils.selectBy(dropdownLocation, location, "visibleText");
        } catch (Exception e) {
            throw new Exception(
                    "Exception occurred when choosing option from dropdown " + e.getMessage()
            );
        }
    }

    public String getAddressText() {
        return BrowserUtils.getText(address);
    }

    public void sendKeysToGuestNotes(String keys) throws Exception {

        try {
            inviteNote.sendKeys(keys);
        } catch (Exception e) {
            throw new Exception(
                    "Exception occurred when sending keys to invite note box " + e.getMessage()
            );
        }

    }

    public void sendKeysToGuestList(String key) throws Exception {
        try {
            inviteList.sendKeys(key);
        } catch (Exception e) {
            throw new Exception(
                    "Exception occurred when sending keys to invite list box " + e.getMessage()
            );
        }
    }

    public void clickOnCreateGrOrdBtn() throws Exception {
        try {
            this.createGrOrdBtn.click();
        } catch (Exception e) {
            throw new Exception(
                    "Exception occurred when clicking on the button " + e.getMessage()
            );
        }
    }

    public String getHeaderText(WebDriver driver, String text) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(header, text));


        return BrowserUtils.getText(header);
    }

    public String getParticipantNumber() {
        return BrowserUtils.getText(totalParticipantNbr);
    }


}
