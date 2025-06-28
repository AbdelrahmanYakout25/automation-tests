package pages;

import Utils.FigureCaption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {

    WebDriver driver;

    Actions actions;

    public HoversPage (WebDriver driver){
        this.driver = driver;

    }

    private final By figure = By.cssSelector(".figure");

    private final By figureCaption = By.cssSelector(".figcaption");

    public FigureCaption hoverOverFigure(int index){
        WebElement element =  driver.findElements(figure).get(index -1);
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        return new FigureCaption(element.findElement(figureCaption));
    }


}
