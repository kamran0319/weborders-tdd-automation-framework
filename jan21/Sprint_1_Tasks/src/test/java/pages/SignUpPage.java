package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;

public class SignUpPage {



    private WebElement usernameField = Driver.getDriver().findElement(By.id("inputfirstname4"));

    public WebElement getUsernameField() {return usernameField;}



    public void signUpvalidCredentials(){

       signUp(ConfigReader.getProperty("firstname"),ConfigReader.getProperty("lastname"),ConfigReader.getProperty("email"),
               ConfigReader.getProperty("password"));

    }
    public void signUp(String firstname , String lastname , String email , String password){
        usernameField.sendKeys(firstname,Keys.TAB,lastname,Keys.TAB,email,Keys.TAB,password,Keys.ENTER);
    }

}
