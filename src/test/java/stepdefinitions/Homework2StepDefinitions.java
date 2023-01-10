package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class Homework2StepDefinitions {
    /*
    Feature: Google Search Homework2

  Scenario:Google da Selenium kelimesini aratip basliginda goruntuleme
    Given Kullanici google a gider
    When Selenium i aratir
    Then Title da Selenium yazildigini dogrular
     */
    @Given("Kullanici google a gider.")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }

    @When("Selenium i aratir")
    public void seleniumIAratir() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
    }

    @Then("Title da Selenium yazildigini dogrular")
    public void titleDaSeleniumYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Selenium"));
        Driver.closeDriver();
    }
}
