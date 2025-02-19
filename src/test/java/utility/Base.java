package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
     protected WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }

}
