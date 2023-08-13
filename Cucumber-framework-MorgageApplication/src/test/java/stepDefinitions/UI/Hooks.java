package stepDefinitions.UI;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.SignUpPage;
import utils.ConfigReader;
import utils.DBUtils;
import utils.Driver;

import java.time.Duration;

public class Hooks {



    @Before(order = 1)  // before each scenario
    public void setupScenario(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Before("@DB")
    public void setupScenarioForDB(){
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.getSign_up_button().click();
        DBUtils.createConnection();
    }


    @After () // after each scenario
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshotFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotFile, "image/png", "screenshot");
        }

        Driver.quitDriver();
    }
    @After("@DB")
    public void tearDownScenario2(){
        DBUtils.close();
    }


}
