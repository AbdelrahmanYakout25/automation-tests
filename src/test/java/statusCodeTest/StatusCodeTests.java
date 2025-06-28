package statusCodeTest;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ConfirmStatusCodesPage;
import pages.StatusCodesPage;

import static org.testng.AssertJUnit.assertTrue;

public class StatusCodeTests extends BaseTests {

    @Test
    public void testStatusCode200()
    {
        StatusCodesPage statusCodesPage = homepage.clickOnStatusCodesLink();
        ConfirmStatusCodesPage confirmStatusCodesPage= statusCodesPage.clickOnLink200();

        String actual = confirmStatusCodesPage.getValidationMassage200();
        String expect = "This page returned a 200 status code.";

        assertTrue(actual.contains(expect));
    }
    @Test
    public void testStatusCode301()
    {
        StatusCodesPage statusCodesPage = homepage.clickOnStatusCodesLink();
        ConfirmStatusCodesPage confirmStatusCodesPage= statusCodesPage.clickOnLink301();

        String actual = confirmStatusCodesPage.getValidationMassage301();
        String expect = "This page returned a 301 status code.";

        assertTrue(actual.contains(expect));
    }
    @Test
    public void testStatusCode404()
    {
        StatusCodesPage statusCodesPage = homepage.clickOnStatusCodesLink();
        ConfirmStatusCodesPage confirmStatusCodesPage= statusCodesPage.clickOnLink404();

        String actual = confirmStatusCodesPage.getValidationMassage404();
        String expect = "This page returned a 404 status code.";

        assertTrue(actual.contains(expect));
    }
    @Test
    public void testStatusCode500()
    {
        StatusCodesPage statusCodesPage = homepage.clickOnStatusCodesLink();
        ConfirmStatusCodesPage confirmStatusCodesPage= statusCodesPage.clickOnLink500();

        String actual = confirmStatusCodesPage.getValidationMassage500();
        String expect = "This page returned a 500 status code.";

        assertTrue(actual.contains(expect));
    }

}
