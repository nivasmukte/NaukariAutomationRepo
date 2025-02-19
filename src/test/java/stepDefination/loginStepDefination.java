package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import utility.configReader;

import java.util.concurrent.TimeUnit;

public class loginStepDefination{
    WebDriver driver;

    LoginPage loginObj;
    HomePage homeObj;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get(configReader.getProperty("baseURL"));
        loginObj=new LoginPage(driver);
        loginObj.clickLogin();
        Thread.sleep(2000);
   }
    @When("User enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
        loginObj.login(configReader.getProperty("userName"),configReader.getProperty("password"));
        Thread.sleep(2000);
    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() throws InterruptedException {
        homeObj =new HomePage(driver);
        Thread.sleep(2000);
        homeObj.usernameValidation();
        homeObj.updateProfile();
    }
}
