package com.Medibank.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = {"com.Medibank.StepDefinitions","com.Medibank.Hooks"},
        tags = "@Search-Cars"
)


public class Runner extends AbstractTestNGCucumberTests {

}
