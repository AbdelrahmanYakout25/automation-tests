package pages;

import net.bytebuddy.asm.MemberSubstitution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;

    Select select;

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    private final By dropDownList = By.id("dropdown");

    public void selectFromDropDownListByIndex(int index){
        select = new Select(driver.findElement(dropDownList));
        select.selectByIndex(index);
    }

    public void selectFromDropDownListByValue(String value){
        select = new Select(driver.findElement(dropDownList));
        select.selectByValue(value);
    }

    public void selectFromDropDownListByVisibleValue(String text){
        select = new Select(driver.findElement(dropDownList));
        select.selectByVisibleText(text);
    }

}
