package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {
    WebDriver driver;
    public StatusCodesPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By link200 =By.linkText("200");
    private final By link301 =By.linkText("301");
    private final By link404 =By.linkText("404");
    private final By link500 =By.linkText("500");

    public ConfirmStatusCodesPage clickOnLink200(){
        driver.findElement(link200).click();
        return  new ConfirmStatusCodesPage(driver);
    }
    public ConfirmStatusCodesPage clickOnLink301(){
        driver.findElement(link301).click();
        return  new ConfirmStatusCodesPage(driver);
    }
    public ConfirmStatusCodesPage clickOnLink404(){
        driver.findElement(link404).click();
        return  new ConfirmStatusCodesPage(driver);
    }
    public ConfirmStatusCodesPage clickOnLink500(){
        driver.findElement(link500).click();
        return  new ConfirmStatusCodesPage(driver);
    }

}
