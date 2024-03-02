package com.formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormyMainPage {

    public FormyMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Autocomplete")
    WebElement autoCompleteLink;

    public void clickOnAutoComplete(){
        autoCompleteLink.click();
    }

}
