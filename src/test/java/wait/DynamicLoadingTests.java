package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;
import pages.TwoPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testExampleOne() throws InterruptedException {
       DynamicLoadingPage dynamicLoadingPage = homepage.clickOnDynamicLoadingLink();
       OnePage onePage= dynamicLoadingPage.clickOnExampleOneLink();
       onePage.clickOnStartButton();
       String expectedResult = "Hello World!";
       String actualResult = onePage.getValidationMessage();
       assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testExampleTwo() throws InterruptedException {
        DynamicLoadingPage dynamicLoadingPage = homepage.clickOnDynamicLoadingLink();
        TwoPage twoPage= dynamicLoadingPage.clickOnExampleTwoLink();
        twoPage.clickOnStartButton();
        String expectedResult = "Hello World!";
        String actualResult = twoPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }

}
