package utilities;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Hooks {
    public WebDriver driver;

 @Before
    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
            //System.setProperty("webdriver.gecko.driver","src/test/resources/geckoDriver/geckodriver.exe");
            //driver = new FirefoxDriver();
        }
        return driver;

 }

 @After
    public void tearDown(){
     driver.close();
     driver.quit();
 }

}
