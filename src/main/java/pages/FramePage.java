package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    WebDriver driver;

    public FramePage (WebDriver driver){
        this.driver=driver;
    }

    private final String frame = "singleframe";

    private final By textField = By.xpath("//input[@type='text']");

    private final By iframeWithInAnIframe = By.linkText("Iframe with in an Iframe");

    public void switchToFrame(){
        driver.switchTo().frame(frame);
    }

    public void switchToParent(){
        driver.switchTo().parentFrame();
    }

    public void insertText(String text){
        switchToFrame();
        driver.findElement(textField).sendKeys(text);
        switchToParent();
    }

    public void clickOnIframeWithInAnIframe(){
        driver.findElement(iframeWithInAnIframe).click();
    }


}
