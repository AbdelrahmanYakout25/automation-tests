package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By emailField = By.xpath("//input[@id='email']");

    private final By retrievePasswordButton = By.id("form_submit");

    public void insertEmail (String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public ForgetPasswordPage2 clickOnRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new ForgetPasswordPage2(driver);
    }

}
