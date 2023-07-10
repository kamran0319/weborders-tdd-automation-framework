import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
@Listeners(MyListener.class)
public class ListenerDemo {

WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException {

        if(testResult.getStatus() == ITestResult.FAILURE){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("target/screenshotFile"+System.currentTimeMillis()+"png"));
        }

        driver.quit();
    }
@Test
    public void testUsername(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "tests";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB,password,Keys.ENTER);

//    Assert.assertTrue("List of All Orders");
    }

}
