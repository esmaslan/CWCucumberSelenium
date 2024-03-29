package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePages;
import utilities.Driver;
import pages.AmazonSearchPage;


public class AmazonStepDefinitions {
    @Given("Kullanici Amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
    }

    @When("Kullanici amazonda {string} aratir")
    public void kullaniciAmazondaAratir(String arg0) {
        AmazonHomePages hp = new AmazonHomePages(Driver.getDriver());
        hp.searchKeyHitEnter(arg0);
    }

    @Then("Kullanici arama sonuclarinda {string} gormelidir")
    public void kullaniciAramaSonuclarindaGormelidir(String arg0) {
        AmazonSearchPage sp = new AmazonSearchPage(Driver.getDriver());
        sp.validateResultTextHasKey(arg0);
    }

    @And("Kullanici ekran goruntusu alir")
    public void kullaniciEkranGoruntusuAlir() {
        System.out.println("Ekran goruntusu alinir");
    }

    @And("Kullanici browser i kapatir")
    public void kullaniciBrowserIKapatir() {
        Driver.closeDriver();
    }
}
