package com.cucumber.junit.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = "pretty",
    monochrome = true,
    tags = "@smoke",
    glue = "com.cucumber.junit",
    features = "classpath:com/cucumber/junit/features")
public class CucumberTestRunner {

}
