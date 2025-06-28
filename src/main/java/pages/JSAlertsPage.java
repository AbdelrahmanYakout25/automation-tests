package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    WebDriver driver;
    public JSAlertsPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By jsAlertButton = By.xpath("//button[contains(text(),'JS Alert')]");

    private final By jsConfirmButton = By.xpath("//button[contains(text(),' JS Confirm')]");

    private final By jsPromptButton = By.xpath("//button[contains(text(),'JS Prompt')]");

    private final By validationMessage =By.id("result");

    public void clickOnJsAlertButton() {
        driver.findElement(jsAlertButton).click();
    }

    public void clickOnJsConfirmButton() {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickOnJsPromptButton() {
        driver.findElement(jsPromptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }

    public void sendMessage(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
