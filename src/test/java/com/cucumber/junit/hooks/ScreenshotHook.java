package com.cucumber.junit.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.junit.driver.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ScreenshotHook {

    public static final String PNG_FILE_EXTENSION = "image/png";

    @After
    public void takeScreenshot(Scenario scenario) {
        scenario.log(DriverManager.getDriver().getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, PNG_FILE_EXTENSION, scenario.getName());
    }

}
