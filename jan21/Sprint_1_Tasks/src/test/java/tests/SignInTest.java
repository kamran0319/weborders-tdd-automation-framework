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

public class SignInTest extends TestBase {


    @Test
    public void SignInPageObjectModel(){


        SignInPage signInPage = new SignInPage();
        signInPage.SignInCredentials();



    }
    @Test
    public void negativeSignInPageObjectModel(){

        SignInPage signInPage = new SignInPage();
        signInPage.negativeSignInCredentials();

//        Driver.getDriver().findElement(By.xpath("//*[@id='auth-login']/div/div/div/div[1]/div/div[1]/text()[2]")).isDisplayed();

    }


}
