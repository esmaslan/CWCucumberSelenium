package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class Homework1StepDefinitions {
    /*
    Feature: Google Search Homework1
  Scenario: Google da Cucumber kelimesini aratip basliginda goruntuleme
    Given Kullanici google a gider
    When Cucumber i aratir
    Then Title da cucumber yazildigini dogrular
     */
    @Given("Kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }

    @When("Cucumber i aratir")
    public void cucumberIAratir() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("Cucumber"+ Keys.ENTER);
    }

    @Then("Title da cucumber yazildigini dogrular")
    public void titleDaCucumberYazildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
        Driver.closeDriver();

    }
}
