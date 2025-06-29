package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {
//valid username and password by xpath
    @Test
    public void testvalidUsernameandPassword()
    {
        LoginPage loginPage =homepage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();

        String actual = secureAreaPage.getValidationMassage();
        String expect = "You logged into a secure area!";
        assertTrue(actual.contains(expect));
    }

//invalid username and valid password by cssSelector
    @Test
    public void testInvalidUsername()
    {
        LoginPage loginPage =homepage.clickOnFormAuthenticationLink();

        loginPage.insertUsername("tomsmix1th");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginPage.clickOnLoginButton();


        String actual = secureAreaPage.getValidationMassage();
        String expect = "Your username is invalid!";

        assertTrue(actual.contains(expect));
    }

//valid username and invalid password * find by text in contains
    @Test
    public void testInvalidPassword()
    {
        LoginPage loginPage =homepage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassworxd!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();

        String actual = secureAreaPage.getValidationMassage();
        String expect = "Your password is invalid!";
        assertTrue(actual.contains(expect));
    }
}
