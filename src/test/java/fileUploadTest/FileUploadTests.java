package fileUploadTest;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.UploadedPage;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FileUploadTests extends BaseTests {
    @Test
    public void testUploadFile()
    {
        FileUploadPage fileUploadPage = homepage.clickOnFileUploadLink();
        fileUploadPage.clickOnChooseFileButton();
        UploadedPage uploadedPage =  fileUploadPage.clickOnUploadButton();
        String actual = uploadedPage.getFileUploadMassage();
        String expect = "File Uploaded!";
        assertEquals(actual,expect);
    }

    @Test
    public void testUploadFileFail()
    {
        FileUploadPage fileUploadPage = homepage.clickOnFileUploadLink();
        fileUploadPage.clickOnUploadButton2();
        String actual = fileUploadPage.getErrorInUploadMassage();
        String expect = "Internal Server Error";
        assertTrue(actual.contains("Internal Server Error"));
    }
}
