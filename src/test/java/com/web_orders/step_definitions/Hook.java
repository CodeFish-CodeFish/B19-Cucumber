package com.web_orders.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {

    public static WebDriver driver;
    @Before
    public void startUp(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("webOrderURL"));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
