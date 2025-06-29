package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    public FileUploadPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By chooseFileButton = By.cssSelector("#file-upload");
    private final By uploadButton = By.cssSelector("input[id='file-submit']");
    private final By errorInUploadMassage = By.xpath("//h1[contains(text(),'Internal Server Error')]");

    public void clickOnChooseFileButton(){
        driver.findElement(chooseFileButton).sendKeys("C:\\Users\\ASUS TUF\\OneDrive\\Desktop\\TestFile.txt");
    }

    public UploadedPage clickOnUploadButton(){
        driver.findElement(uploadButton).click();
        return new UploadedPage(driver);
    }
    public String getErrorInUploadMassage(){
        return driver.findElement(errorInUploadMassage).getText();
    }
    public void clickOnUploadButton2() {
        driver.findElement(uploadButton).click();
        return;
    }
}
