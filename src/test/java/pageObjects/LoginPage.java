package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Hooks;

public class LoginPage {
    WebDriver driver;

    public LoginPage(Hooks hooks) {
        this.driver = hooks.getDriver();

            }

      By signIn = By.cssSelector("dn-l df tr  w2 pointer white flex flex-column justify-center items-end o-toggle z-999");
      By emailAddress = By.cssSelector("#user_email");
      By password = By.cssSelector("");
      By clickSignIn = By.cssSelector("");

      public void navigate (String url){

          driver.navigate().to(url);
      }

      public void EmailAddress(String txt){

          driver.findElement(emailAddress).sendKeys(txt);
      }

      public void Password(String txt){

          driver.findElement(password).sendKeys(txt);
      }

      public void ClickSignIn(){

          driver.findElement(clickSignIn).click();
      }
}




