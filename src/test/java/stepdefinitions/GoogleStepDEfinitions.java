package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDEfinitions {
    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }

    @When("Kullanici samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());

        sp.seaerchFor("samsung");
    }

    @Then("Kullanici sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }
}
