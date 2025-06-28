package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;
    public CheckBoxPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By checkBoxOne=By.xpath("(//input)[1]");
    private final By checkBoxTwo=By.xpath("(//input)[2]");

    public void clickOnCheckBoxOne(){
        driver.findElement(checkBoxOne).click();
    }
    public void clickOnCheckBoxTwo(){
        driver.findElement(checkBoxTwo).click();
    }
    public boolean checkBoxOneIsSelected(){
        return driver.findElement(checkBoxOne).isSelected();
    }
    public boolean checkBoxTowIsSelected(){
        return driver.findElement(checkBoxTwo).isSelected();
    }
}
