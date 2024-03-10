package com.tumblr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[.='Continue with email']")
    WebElement continueWithEmail;


    @FindBy(css = "input[name='email']")
    WebElement emailInputField;

    @FindBy(xpath = "//span[.='Next']")
    WebElement nextBtn;

    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(xpath = "//p[@class='Ahpp8']//following-sibling::div//span[.='Log in']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement errorMessage;

    public void clickOnContinueEmail(){
        this.continueWithEmail.click();
    }

    public void enterEmail(String email){
        this.emailInputField.sendKeys(email);
        this.nextBtn.click();
    }

    public void enterPasswordValidateError(String password, String errorMessage){
        this.password.sendKeys(password);
        this.loginBtn.click();
        System.out.println(this.errorMessage.getText());
        Assert.assertEquals(errorMessage, this.errorMessage.getText());
    }


}
