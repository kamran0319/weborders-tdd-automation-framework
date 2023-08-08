package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


@Data
public class SignUpPage {

    public SignUpPage() {PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath = "//div[@class='text-center']//a")
    private WebElement sign_up_button;

    @FindBy(id = "register")
    private WebElement register;

   @FindBy(id = "inputfirstname4")
    private WebElement Firstname;

    @FindBy(id = "inputlastname4")
    private WebElement Lastname;

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "exampleInputPassword1")
    private WebElement Password;


    @FindBy(xpath = "//h4[.='Welcome Back!']")
    private WebElement welcomeBack;

}
