package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {

    WebDriver driver;

    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    WebElement textUsername;

    @FindBy(name = "password")
    WebElement textPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(className = "oxd-text oxd-text--p oxd-alert-content-text")
    WebElement errMessage ;

    public void typeUsername(String text){
        textUsername.click();
    }
    public void typePassword(String text){
        textPassword.click();
    }

    public void clickLogin(){
        btnLogin.click();
    }
    public void loginAsAdmin(){
        typeUsername("Admin");
        typePassword("admin123");
        clickLogin();
    }

    public void verifyErrMessageContains(String message){
        Assert.assertTrue(errMessage.getText().contains(message));
    }


}
