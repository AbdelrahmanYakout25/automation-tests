package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmStatusCodesPage {
    WebDriver driver;
    public ConfirmStatusCodesPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By checkMassage200 =By.xpath("//*[contains(text(),'This page returned a 200 status code.')]");
    private final By checkMassage301 =By.xpath("//*[contains(text(),'This page returned a 301 status code.')]");
    private final By checkMassage404 =By.xpath("//*[contains(text(),'This page returned a 404 status code.')]");
    private final By checkMassage500 =By.xpath("//*[contains(text(),'This page returned a 500 status code.')]");

    public String getValidationMassage200(){
        return driver.findElement(checkMassage200).getText();
    }
    public String getValidationMassage301(){
        return driver.findElement(checkMassage301).getText();
    }
    public String getValidationMassage404(){
        return driver.findElement(checkMassage404).getText();
    }
    public String getValidationMassage500(){
        return driver.findElement(checkMassage500).getText();
    }
}
