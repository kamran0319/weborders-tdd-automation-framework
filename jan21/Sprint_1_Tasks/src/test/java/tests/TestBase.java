package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;

public class TestBase {

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown(){
//        Driver.quitDriver();
//
//    }

}
