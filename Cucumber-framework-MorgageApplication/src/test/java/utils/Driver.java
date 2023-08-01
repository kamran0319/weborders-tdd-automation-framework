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

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    private Driver(){}


    public static synchronized WebDriver getDriver(){
        if(drivers.get() == null){  // if the driver object is not initialized, initialize it

            String browser = System.getProperty("browser");  // read the browser from command line and assign it to browser

            if(browser == null) {  // if nothing was passed from command line
                browser = ConfigReader.getProperty("browser").toLowerCase(); // use the browser from config.properties
            }

            switch (browser) {
                case "chrome" -> drivers.set(new ChromeDriver());
                case "edge" -> drivers.set(new EdgeDriver());
                case "firefox" -> drivers.set(new FirefoxDriver());
                case "chromeheadless" -> drivers.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
                case "edgeheadless" -> drivers.set(new EdgeDriver(new EdgeOptions().addArguments("--headless")));
                case "firefoxheadless" -> drivers.set(new FirefoxDriver(new FirefoxOptions().addArguments("--headless")));
                case "safari" -> drivers.set(new SafariDriver());
                default -> throw new IllegalArgumentException(browser + " -> this browser is not supported or invalid");
            }


        }

        return drivers.get(); // otherwise return the initialized driver object
    }

    public static synchronized void quitDriver(){
        if(drivers.get() != null){
            drivers.get().quit();
            drivers.remove();
        }

    }

}
