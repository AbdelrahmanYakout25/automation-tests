package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage2 {
    WebDriver driver;
    public ForgetPasswordPage2(WebDriver driver) {
        this.driver=driver;
    }

    private final By checkMessage = By.tagName("h1");

    public String getMessage (){
        return driver.findElement(checkMessage).getText();
    }
}
