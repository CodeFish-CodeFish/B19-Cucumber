package com.smart_bear.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartHook {

    // NOTE: annotations are not from JUnit
    WebDriver driver;
    @Before // this annotation is from io.cucumber.java
    public void initializeDriver(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("smartBearURL"));
    }

    @After// this annotation is from io.cucumber.java
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
