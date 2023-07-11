package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.SignUpPage;
import utils.ConfigReader;
import utils.Driver;

public class SignInTest  {


    @Test
    public void SignInPageObjectModel(){


        SignInPage signInPage = new SignInPage();
        signInPage.SignInCredentials();
        Driver.getDriver().quit();

    }
    @Test
    public void negativeSignInPageObjectModel() throws InterruptedException {

        SignInPage signInPage = new SignInPage();
        Driver.getDriver().navigate().to("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        signInPage.signIn(ConfigReader.getProperty("email"),"invalid");
//        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php");

//        Driver.getDriver().findElement(By.xpath("//*[@id='auth-login']/div/div/div/div[1]/div/div[1]/text()[2]")).isDisplayed();

    }


}
