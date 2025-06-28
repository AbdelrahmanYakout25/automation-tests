package forGetPassword;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.ForgetPasswordPage2;
import pages.LoginPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ForgetPasswordTest extends BaseTests {

    @Test
    public void testForgetPasswordWithData() {
        ForgetPasswordPage forgetPasswordPage =homepage.clickOnForgetPasswordLink();
        forgetPasswordPage.insertEmail("abdo_1588");
        ForgetPasswordPage2 forgetPasswordPage2 = forgetPasswordPage.clickOnRetrievePasswordButton();

        String actual = forgetPasswordPage2.getMessage();
        String expect = "Internal Server Error";

        assertEquals(actual,expect);
    }
    @Test
    public void testForgetPasswordWithoutData()
    {
        driver.findElement(By.linkText("Forgot Password")).click();

        driver.findElement(By.xpath("//*[contains(@class,'icon-2x')]")).click();

        String actual = driver.findElement(By.xpath("//*[contains(text(),'Internal Server Error')]")).getText();
        String expect = "Internal Server Error";

        assertEquals(actual,expect);
    }
}
