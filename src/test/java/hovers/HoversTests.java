package hovers;

import Utils.FigureCaption;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

public class HoversTests extends BaseTests {
    @Test
    public void testUserData(){
        HoversPage hoversPage = homepage.clickOnHoversLink();
        FigureCaption figureCaption =  hoversPage.hoverOverFigure(2);
        System.out.println(figureCaption.getUsername());
        System.out.println(figureCaption.getProfile());
    }
}
