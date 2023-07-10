package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;


public class SignInPage {




    private WebElement usernameField ;


    public void SignInCredentials(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");
        usernameField = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));

        signIn(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        String actual = driver.findElement(By.xpath("//span[.='sierra macdowell']")).getText();
        Assert.assertEquals(actual,ConfigReader.getProperty("firstname")+" "+ConfigReader.getProperty("lastname"));


    }
    public void signIn(String email , String password){
        usernameField.sendKeys(email,Keys.TAB,password,Keys.ENTER);
    }

    public void negativeSignInCredentials(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");
        usernameField = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));

        negativesignIn(ConfigReader.getProperty("email"),"password");
//        driver.findElement(By.xpath("//*[@id='auth-login']/div/div/div/div[1]/div/div[1]/text()[2]")).isDisplayed();


    }
    public void negativesignIn(String email , String password){
        usernameField.sendKeys(email,Keys.TAB,password,Keys.ENTER);
    }
}
