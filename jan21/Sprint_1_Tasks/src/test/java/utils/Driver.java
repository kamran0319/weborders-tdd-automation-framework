package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private Driver(){}


    public static  WebDriver getDriver(){
        if(driver.get() == null){  // if the driver object is not initialized, initialize it

            String browser = System.getProperty("browser");
            if(browser == null){
                browser = ConfigReader.getProperty("browser").toLowerCase();
            }


            switch (browser) {
                case "chrome" -> driver.set( new ChromeDriver());
                case "edge" -> driver.set( new EdgeDriver());
                case "firefox" -> driver.set( new FirefoxDriver());

                case "chromeheadless" -> driver.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
                case "edgeheadless" -> driver.set( new EdgeDriver(new EdgeOptions().addArguments("--headless")));
                case "firefoxheadless" -> driver.set( new FirefoxDriver(new FirefoxOptions().addArguments("--headless")));

                case "safari" -> driver.set( new SafariDriver());
                default -> throw new IllegalArgumentException(browser + " -> this browser is not supported or invalid");
            }

        }

        return driver.get(); // otherwise return the initialized driver object
    }

    public static void quitDriver(){
        if(driver.get() != null){
            driver.get().quit();
            driver.remove();
        }

    }

}
