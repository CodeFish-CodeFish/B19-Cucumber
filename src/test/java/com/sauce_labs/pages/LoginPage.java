package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    WebElement username;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#login-button")
    WebElement loginBtn;

    public void setLoginBtn(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickOnLoginBtn(){
        loginBtn.click();
    }

}
