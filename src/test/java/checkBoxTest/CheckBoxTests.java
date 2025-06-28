package checkBoxTest;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckBoxTests extends BaseTests {

    @Test
    public void testCheckBoxOne()
    {
        CheckBoxPage checkBoxPage =homepage.clickOnCheckBoxLink();
        checkBoxPage.clickOnCheckBoxOne();
        checkBoxPage.clickOnCheckBoxTwo();

        assertTrue(checkBoxPage.checkBoxOneIsSelected());
        assertFalse(checkBoxPage.checkBoxTowIsSelected());
    }

    @Test
    public void testCheckBoxTow()
    {
        CheckBoxPage checkBoxPage =homepage.clickOnCheckBoxLink();

        assertFalse(checkBoxPage.checkBoxOneIsSelected());
        assertTrue(checkBoxPage.checkBoxTowIsSelected());
    }


}
