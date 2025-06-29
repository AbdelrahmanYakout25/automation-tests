package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadedPage {
    WebDriver driver;
    public UploadedPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By fileUploadMassage = By.xpath("//*[contains(text(),'File Uploaded!')]");



    public String getFileUploadMassage(){

        return driver.findElement(fileUploadMassage).getText();
    }


}
