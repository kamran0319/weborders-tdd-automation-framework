package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import pages.SignUpPageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class SignUpTest extends TestBase{

  @Test
  public void positiveSignUpPageObjectModel() {

    new SignUpPage().signUpvalidCredentials();

//    Driver.getDriver().findElement(By.xpath("//span[.='This email already used']")).isDisplayed();
//    Driver.getDriver().findElement(By.linkText("Registration Successful")).isDisplayed();
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"http://qa-duobank.us-east-2.elasticbeanstalk.com/register.php");

       SignUpPageFactory signUpPageFactory = new SignUpPageFactory();
       Assert.assertTrue(signUpPageFactory.getSignUptext().isDisplayed());// Sign Up is displayed

       signUpPageFactory.getEmail().sendKeys(ConfigReader.getProperty("email"));//email fild
    signUpPageFactory.getPassword().sendKeys(ConfigReader.getProperty("password"));// password fild

    signUpPageFactory.getDontHaveAccountText().isDisplayed();// "don't have an account?" is displayed
    signUpPageFactory.getSignUpWord().isDisplayed();// "sign up " is displayed


    signUpPageFactory.getWelcomeBack().isDisplayed();// "Welcome Back " is displayed
    signUpPageFactory.getSignInClick().click();


     String actual = signUpPageFactory.getFirsLastnamefild().getText();
     Assert.assertEquals(actual,ConfigReader.getProperty("firstname")+" "+ConfigReader.getProperty("lastname"));


  }



}
