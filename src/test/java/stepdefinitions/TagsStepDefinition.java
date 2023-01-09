package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {

    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("smokeTestCalistiginda");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
        System.out.println("smokeTestBasariliOlmali");
    }

    @Given("Regression test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
        System.out.println("regressionTestIcinHazirliklarYapildi");
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("regressionTestIcinHazirliklarYapildi");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
        System.out.println("regressionTestBasariliOlmali");

    }
}
