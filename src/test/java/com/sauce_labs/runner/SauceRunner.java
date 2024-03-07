package com.sauce_labs.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/SauceLabs/Validations",
        glue = "com/sauce_labs/step_definitions",
        dryRun = false,
        tags = "@smoke",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class SauceRunner {
}
