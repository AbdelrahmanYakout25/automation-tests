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

    public void clickOnChooseFileButton(){
        driver.findElement(chooseFileButton).sendKeys("C:\\Users\\abdel\\OneDrive\\Desktop\\testfile25.docx");
    }

    public UploadedPage clickOnUploadButton(){
        driver.findElement(uploadButton).click();
        return new UploadedPage(driver);
    }

}
