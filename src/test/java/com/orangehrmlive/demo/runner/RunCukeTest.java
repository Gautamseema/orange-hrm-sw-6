package com.orangehrmlive.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature",
         glue = "com/orangehrmlive/demo/steps",
         plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
         tags = "@regression"
                )
public class RunCukeTest extends AbstractTestNGCucumberTests {

}
