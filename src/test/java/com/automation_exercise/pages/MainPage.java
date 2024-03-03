package com.automation_exercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/contact_us']")
    WebElement contactUsLink;

    public void clickOnContactUs(){
        contactUsLink.click();
    }


}
