
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class DataProviderDemo {


@DataProvider (name = "customersFile")
public Object[][] getData(){
    return utility.readFromCSVFile("customers.csv");

}
//
//@DataProvider (name= "customer")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"John","Doe","123 Main st","Springfild","MO","64118","2416543216413621"}
//        };
//    }
    @Test (dataProvider = "customersFile")
    public void TestUsername(String fistname,
                             String lastname ,
                             String street ,
                             String city,
                             String state ,
                             String zip ,
                             String creditcard){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "test";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB,password,Keys.ENTER);

        driver.findElement(By.linkText("Order")).click();
        int quantity = new Random().nextInt(100);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys(Keys.CONTROL,"A");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys(""+quantity);
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(fistname+" "+lastname);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);


        List<WebElement> radioButtons =  driver.findElements(By.xpath("//input[@type='radio']"));
        radioButtons.get(new Random().nextInt(3)).click();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(creditcard);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("01/24");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

        Assert.assertTrue(driver.getPageSource().contains("New order has been successfully added."));





    }
}