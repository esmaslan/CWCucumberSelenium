package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParameterizedStepsExampleStepDefinitions {
    private int int1,int2;
    private int sonuc;

    @Given("Ilk sayi {int}")
    public void ilkSayi(int sayi){
        int1=sayi;
    }

    @Given("Ikinci sayi {int}")
    public void ikinciSayi(int sayi){
        int2=sayi;
    }

    @When("Bu sayilari {word} operatorune sokarsam")
    public void buSayilariOperatoruneSokarsam(String operator){
        switch (operator){
            case "+":
                sonuc= int1+int2;
                break;
            case "-":
                sonuc= int1-int2;
                break;
            case "*":
                sonuc= int1*int2;
                break;
            case "/":
                sonuc= int1/int2;
                break;
        }

    }

    @Then("Sonuc {int} olmalidir")
    public void sonucOlmalidir(int sayi){
        Assert.assertEquals(sayi, sonuc);
    }
    // RegEx Edition

    @Given("^Ismim \"(\\w+)\"$")
    public void ismim(String isim){
        System.out.println(isim);
    }

}
