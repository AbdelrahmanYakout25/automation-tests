package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    WebDriver driver;
    public EntryAdPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By jsAlertButton = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");

    public void closeModel(){
        driver.findElement(jsAlertButton).click();
    }
}
