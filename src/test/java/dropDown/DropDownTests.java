package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOptionOneByIndex(){
        DropDownPage dropDownPage = homepage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownListByIndex(1);
    }

    @Test
    public void testSelectOptionOneByValue(){
        DropDownPage dropDownPage = homepage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownListByValue("1");
    }

    @Test
    public void testSelectOptionOneByVisibleText(){
        DropDownPage dropDownPage = homepage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownListByVisibleValue("Option 1");
    }
}
