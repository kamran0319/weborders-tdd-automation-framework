package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "exampleInputEmail1")
    private WebElement email;


    @FindBy(id = "exampleInputPassword1")
    private WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement signInButton;


}
