package frame;

import base.BaseTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTests extends BaseTests {

    FramePage framepage;

    @BeforeMethod
    public void goHome() {
        driver.get("https://demo.automationtesting.in/Frames.html");
    }
    @BeforeClass
    public  void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        framepage = new FramePage(driver);
    }

    @Test
    public void testFrame(){
        framepage.insertText("hello");
        framepage.clickOnIframeWithInAnIframe();
    }
}
