package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import pages.JSAlertsPage;


import static org.testng.AssertJUnit.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlertByButton1() {
        JSAlertsPage jsAlertsPage = homepage.clickOnJavaScriptAlertsLink();
        jsAlertsPage.clickOnJsAlertButton();
        jsAlertsPage.acceptAlert();
        String actual = jsAlertsPage.getValidationMessage();
        String expect = "You successfully clicked an alert";
        assertEquals(actual,expect);
    }

    @Test
    public void testAcceptAlertByButton2(){
        JSAlertsPage jsAlertsPage = homepage.clickOnJavaScriptAlertsLink();
        jsAlertsPage.clickOnJsConfirmButton();
        jsAlertsPage.acceptAlert();
        String actual = jsAlertsPage.getValidationMessage();
        String expect = "You clicked: Ok";
        assertEquals(actual,expect);
    }

    @Test
    public void testDismissAlertByButton2(){
        JSAlertsPage jsAlertsPage = homepage.clickOnJavaScriptAlertsLink();
        jsAlertsPage.clickOnJsConfirmButton();
        jsAlertsPage.dismissAlert();
        String actual = jsAlertsPage.getValidationMessage();
        String expect = "You clicked: Cancel";
        assertEquals(actual,expect);
    }

    @Test
    public void testSendYesAlertByButton3(){
        JSAlertsPage jsAlertsPage = homepage.clickOnJavaScriptAlertsLink();
        jsAlertsPage.clickOnJsPromptButton();
        String message = "yes";
        jsAlertsPage.sendMessage(message);
        jsAlertsPage.acceptAlert();
        String actual = jsAlertsPage.getValidationMessage();
        String expect = "You entered: yes";
        assertEquals(actual,expect);
    }
}
