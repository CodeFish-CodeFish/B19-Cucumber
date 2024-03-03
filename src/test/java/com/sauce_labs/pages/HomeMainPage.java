package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomeMainPage {

    public HomeMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header_label']")
    WebElement header;

    @FindBy(xpath = "//span[.='Products']")
    WebElement headerOnLeftBar;

    @FindBy(css = "select[class='product_sort_container']")
    WebElement dropdown;

    public String getHeader(){
        // using in 1st scenario
        return BrowserUtils.getText(header);
    }

    public String getHeaderOnLeftBar(){
        // using in 2nd scenario
        return BrowserUtils.getText(headerOnLeftBar);
    }

    public List<WebElement> validateOptionsSelect(){
        // using in 2nd scenario
       return BrowserUtils.getOptionsSelect(dropdown);
    }

    public void selectLowToHigh(){
        // using in 2nd scenario
        BrowserUtils.selectBy(dropdown, "Price (low to high)","visibleText");
    }
}
