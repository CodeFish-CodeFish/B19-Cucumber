package com.tumblr.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Tumblr/login",
        glue = "com/tumblr/step_definitions",
        dryRun = false

)
public class Runner {
}
