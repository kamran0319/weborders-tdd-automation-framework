package zmisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;

public class test {

@Test
    public void login(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("http://qa-duobank.us-east-2.elasticbeanstalk.com/index.php");

         driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("");




    }

}
