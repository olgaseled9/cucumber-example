package com.cucumber.junit.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {

    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();

    @When("the user opens Spring website")
    public void openSpringWebsite() {
        homePage.openSpringWebsite();
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
        homePage.menuSection().click();
    }

    @And("the user clicks on the {string} item")
    public void clicksOnItem(String item) {
        homePage.menuItem().click();
    }

    @Then("page with title {string} is displayed")
    public void verifyPageTitlePresence(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
            .overridingErrorMessage("Page with title '%s' is not displayed", pageTitle)
            .isTrue();
    }
}
