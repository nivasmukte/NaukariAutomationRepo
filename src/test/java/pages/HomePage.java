package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div[2]/div")
    WebElement userValidationXpath;
    @FindBy(xpath = "/html/body/main/div/div/div[3]/div/div[3]/div[2]/a")
    WebElement viewProfileButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div[1]/em")
    WebElement editIcon;
    @FindBy(xpath = "//*[@id=\"editBasicDetailsForm\"]/div[6]/div/div[2]/span[3]")
    WebElement noticePeriod2;
    @FindBy(xpath = "//*[@id=\"editBasicDetailsForm\"]/div[6]/div/div[2]/span[2]")
    WebElement noticePeriod1;
    @FindBy(id = "saveBasicDetailsBtn")
    WebElement saveButton;
    @FindBy(xpath = "//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[4]")
    WebElement drawerButton;
    @FindBy(xpath = "//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[4]/div[2]/div[2]/div/div[3]/div/div[1]/div[4]/a")
    WebElement logoutLink;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void usernameValidation(){
        Assert.assertEquals(userValidationXpath.getText(),"Nivas Pralhad Mukte");
    }
    public void updateProfile() throws InterruptedException {
//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(viewProfileButton));
        viewProfileButton.click();
        editIcon.click();

        noticePeriod2.click();
        noticePeriod1.click();

        saveButton.click();
        drawerButton.click();
        logoutLink.click();
    }

}
