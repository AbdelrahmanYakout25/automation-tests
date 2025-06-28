package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {
    
    WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver  =driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By checkBoxLink = By.linkText("Checkboxes");

    private final By fileUploadLink = By.linkText("File Upload");

    private final By forgetPasswordLink = By.linkText("Forgot Password");

    private final By statusCodesLink = By.linkText("Status Codes");

    private final By JavaScriptAlertsLink = By.linkText("JavaScript Alerts");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropDownLink = By.linkText("Dropdown");

    private final By modelsTestLink = By.linkText("Entry Ad");

    private final By hoversLink = By.linkText("Hovers");

    private final By dragAndDrop = By.linkText("Drag and Drop");


    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CheckBoxPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver) ;
    }

    public FileUploadPage clickOnFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver) ;
    }

    public ForgetPasswordPage clickOnForgetPasswordLink(){
        driver.findElement(forgetPasswordLink).click();
        return new ForgetPasswordPage(driver) ;
    }

    public StatusCodesPage clickOnStatusCodesLink(){
        driver.findElement(statusCodesLink).click();
        return new StatusCodesPage(driver) ;
    }

    public JSAlertsPage clickOnJavaScriptAlertsLink(){
        driver.findElement(JavaScriptAlertsLink).click();
        return new JSAlertsPage(driver) ;
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver) ;
    }

    public DropDownPage clickOnDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new  DropDownPage(driver) ;
    }

    public EntryAdPage clickOnEntryAdLink(){
        driver.findElement(modelsTestLink).click();
        return new  EntryAdPage(driver) ;
    }

    public HoversPage clickOnHoversLink(){
        driver.findElement(hoversLink).click();
        return new  HoversPage (driver) ;
    }

    public DragAndDropPage clickOnDragAndDropLink() {
        driver.findElement(dragAndDrop).click();
        return new DragAndDropPage(driver);
    }

}
