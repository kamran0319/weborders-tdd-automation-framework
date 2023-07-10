package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class BasicDemo {




//    @Test
    public void userName(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        String username ="Tester";
        String password ="test";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB,password,Keys.ENTER);

    }
}
