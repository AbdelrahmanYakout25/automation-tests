package dragAndDrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTests {

    @Test
    public void testDragAndDropAToB(){
        DragAndDropPage dragAndDropPage = homepage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDrop();
    }

    @Test
    public void testDragAndDropBToA(){
        DragAndDropPage dragAndDropPage = homepage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDrop2();
    }
}
