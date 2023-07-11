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

public class SignUpTest extends TestBase {

    @Test
    public void positiveSignUpPageObjectModel() throws InterruptedException {

        new SignUpPage().signUpvalidCredentials();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Registration Successful"));
//    Driver.getDriver().findElement(By.xpath("//span[.='This email already used']")).isDisplayed();

        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");


        SignUpPageFactory signUpPageFactory = new SignUpPageFactory();
        Assert.assertTrue(signUpPageFactory.getSignUptext().isDisplayed());// Sign Up is displayed

        signUpPageFactory.getEmail().sendKeys(ConfigReader.getProperty("email"));//email fild


        signUpPageFactory.getPassword().sendKeys(ConfigReader.getProperty("password"));// password fild
//        Thread.sleep(2500);
//        Assert.assertTrue(signUpPageFactory.getEmailAlreadyUsed().isDisplayed());
//        Driver.getDriver().findElement(By.id("emailerror"));
//        SeleniumUtils.waitForVisibility(text,5 );
//        Assert.assertTrue(Driver.getDriver().getPageSource().contains("This email already used"));

        signUpPageFactory.getDontHaveAccountText().isDisplayed();// "don't have an account?" is displayed
        signUpPageFactory.getSignUpWord().isDisplayed();// "sign up " is displayed


        signUpPageFactory.getWelcomeBack().isDisplayed();// "Welcome Back " is displayed
        signUpPageFactory.getSignInClick().click();


        String actual = signUpPageFactory.getFirsLastnamefild().getText();
        Assert.assertEquals(actual, ConfigReader.getProperty("firstname") + " " + ConfigReader.getProperty("lastname"));


    }

    @Test
    public void negativeNameWithNumber() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp("1544296543", ConfigReader.getProperty("lastname"),
                ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test name fild with numbers is passing
    }

    @Test
    public void negativeNameMoreThan50Ch() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp("zxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklpoiu", ConfigReader.getProperty("lastname"),
                ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test firstname with 55 characters is passing
    }
    @Test
    public void negativeLastnameWithNumber() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp(ConfigReader.getProperty("firstname"), "4521545",
                ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test lastname fild with numbers is passing
    }
    @Test
    public void negativeLastnameMoreThan50Ch() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp(ConfigReader.getProperty("firstname"), "zxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklpoiu",
                ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test lastname with 55 characters is passing
    }
    @Test
    public void negativeEmail() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp(ConfigReader.getProperty("firstname"), ConfigReader.getProperty("lastname"),
                "example@example.com", ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test email invalid format is passing
    }
    @Test
    public void negativeEmailmoreThan255ch() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp(ConfigReader.getProperty("firstname"), ConfigReader.getProperty("lastname"),
                "zxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklpoiuzxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklp" +
                        "oiuzxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklpoiuzxcvbnmlkjhgfdsaqwertyuiopasdfghjkl" +
                        "mnbvcxzasdfghjklpoiuzxcvbnmlkjhgfdsaqwertyuiopasdfghjklmnbvcxzasdfghjklpoiu@example.com", ConfigReader.getProperty("password"));

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negative test email invalid format is passing
    }
    @Test
    public void negativePassword() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.signUp(ConfigReader.getProperty("firstname"), ConfigReader.getProperty("lastname"),
                ConfigReader.getProperty("email"), "fghjhgfcvffghjhgfcvffghjhgfcvffghjhgfcvffghjhgfcvffghjhgfcvf");

        Thread.sleep(5000);
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

        //negativetest password invalid format is passing
    }
//     Thread.sleep(5000);
//        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");
//    /     Thread.sleep(5000);
//        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-eas
//    /     Thread.sleep(5000);
//        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://qa-duobank.us-eas
}