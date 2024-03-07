package com.automation_exercise.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class AutoHook {

    public static WebDriver driver;
    @Before
    public void initializeDriver(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("autoURL"));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
