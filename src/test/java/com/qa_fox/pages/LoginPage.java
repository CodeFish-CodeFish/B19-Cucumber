package com.qa_fox.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input-email")
    WebElement email;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement signInBtn;

    @FindBy(xpath = "//div[.='Warning: No match for E-Mail Address and/or Password.']")
    WebElement errorMsg;


    public void login(String email, String password, String errorMessage) throws Exception {
        try {
            this.email.sendKeys(email);
            this.password.sendKeys(password);
            this.signInBtn.click();
            Assert.assertEquals("Failed to validate error message ",errorMessage, this.errorMsg.getText());
        }catch (Exception e){
            throw new Exception(
                    "Exception occurred when signing in " + e.getMessage()
            );
        }
    }


}
