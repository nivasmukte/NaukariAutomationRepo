package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;
    @FindBy(id="login_Layer")
    WebElement loginLink;
    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")
    WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickLogin(){
        loginLink.click();
    }

    public void login(String userName,String password){
        userNameField.clear();
        userNameField.sendKeys(userName);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.submit();
    }


}
