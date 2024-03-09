package com.web_orders.pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    /*

    1. navigate to login page and login with:
    username:guest1@microworks.com
    password:Guest1!

    2. Click on Group Order radio button

    3. On Create Order page, choose myHouse option from
        the dropdown and validate the address

    4. Send keys to note to invitees text area

    5. Send keys to invitees list text area

    6. Click Create Group Order button.

    7. On Next page, validate main header and number of participants

    Repeat the same scenario for office location.

     */

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // another way of declaring locators
    @FindBy(how = How.CSS, using = "#Email")
    WebElement username;

    @FindBy(how = How.CSS, using = "#Password")
    WebElement password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    WebElement signInButton;

    public void signIn(String username, String password) throws Exception {

       try {
           this.username.clear();
           this.username.sendKeys(username);

           this.password.clear();
           this.password.sendKeys(password);

       }catch (Exception e){
           throw new Exception(
                   "Something happened when signing in " + e.getMessage());
       }

    }

    public void setSignInButton() throws Exception {
        try {
            this.signInButton.click();
        }catch (Exception e){
            throw new Exception(
                    "Exception occurred when clicking on sign in button " + e.getMessage()
            );
        }
    }


}
