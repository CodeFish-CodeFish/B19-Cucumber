package com.smart_bear.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/SmartBear/WebOrders",// location of feature files
        glue = "com/smart_bear/step_definitions", // location of stepDefinitions
        dryRun = false, // triggers that will generate snippets if it is set to 'true'
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class SmartRunner {
}
