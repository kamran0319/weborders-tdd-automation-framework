package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){}


    public static WebDriver getDriver(){
        if(driver == null){  // if the driver object is not initialized, initialize it

            // read the browser from config file
            String browser = ConfigReader.getProperty("browser").toLowerCase();

            switch (browser) {
                case "chrome" -> driver = new ChromeDriver();
                case "edge" -> driver = new EdgeDriver();
                case "firefox" -> driver = new FirefoxDriver();
                case "safari" -> driver = new SafariDriver();
                default -> throw new IllegalArgumentException(browser + " -> this browser is not supported or invalid");
            }


        }

        return driver; // otherwise return the initialized driver object
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }

    }

}
