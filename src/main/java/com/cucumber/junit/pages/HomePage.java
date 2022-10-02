package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.junit.driver.DriverManager;

public class HomePage extends BasePage {

    private static final String SPRING_URL = "https://spring.io/";

    private static final String MENU_SECTION = "//*[@id='learn-target']";

    private static final String CHILD_MENU_ITEM = "//*[@id=\"learn-items\"]/ul/li[1]/a";

    public void openSpringWebsite() {
        DriverManager.getDriver().get(SPRING_URL);
    }

    public WebElement menuSection() {
        return findElement(By.xpath(MENU_SECTION));
    }

    public WebElement menuItem() {
        return findElement(By.xpath(CHILD_MENU_ITEM));
    }

}
