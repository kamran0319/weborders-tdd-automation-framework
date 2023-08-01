package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.time.Duration;

public class loginStepDefs {

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("I enter the valid credentials")
    public void i_enter_the_valid_credentials() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.getEmail().sendKeys(ConfigReader.getProperty("email"));
        loginPage.getPassword().sendKeys(ConfigReader.getProperty("password"));
        Thread.sleep(1000);
        SeleniumUtils.jsClick(loginPage.getSignInButton());


    }
    @Then("I should be able to login")
    public void i_should_be_able_to_login() {
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php",Driver.getDriver().getCurrentUrl());
    }
}
