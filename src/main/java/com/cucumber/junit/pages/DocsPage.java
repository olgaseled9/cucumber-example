package com.cucumber.junit.pages;

import org.openqa.selenium.By;

public class DocsPage extends BasePage {

    public static final String PAGE_TITLE = "/html/head/title";

    public boolean isPageWithTitleDisplayed(String title) {
        return isElementDisplayed(By.xpath(PAGE_TITLE));
    }

}
