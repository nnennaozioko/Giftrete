package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utilities.Hooks;

public class LoginStepDef {

    WebDriver driver;

    LoginPage loginPage;

    public LoginStepDef(Hooks hooks) {
        this.driver = hooks.getDriver();

        loginPage = new LoginPage(hooks);
    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {

        loginPage.navigate(url);

    }


    @When("I click on sign in")
    public void iClickOnSignIn() {
    }

    @And("I enter my email address {string}")
    public void iEnterMyEmailAddress(String arg0) {
    }

    @And("I enter my password {string}")
    public void iEnterMyPassword(String arg0) {
    }

    @Then("I signed in")
    public void iSignedIn() {
    }
}
