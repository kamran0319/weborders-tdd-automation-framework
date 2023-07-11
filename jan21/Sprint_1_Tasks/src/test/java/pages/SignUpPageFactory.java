package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SignUpPageFactory {


    public SignUpPageFactory(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='card-title']//h4")
    private WebElement SignUptext;

    public WebElement getSignUptext() {
        return SignUptext;


    }
    @FindBy(id = "emailerror")
    private WebElement emailAlreadyUsed;

    public WebElement getEmailAlreadyUsed() {
        return emailAlreadyUsed;
    }

    @FindBy(id = "exampleInputEmail1")
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }

    @FindBy(id = "exampleInputPassword1")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//div[@class='text-center']//small[1]")
    private WebElement dontHaveAccountText;

    public WebElement getDontHaveAccountText() {
        return dontHaveAccountText;
    }
    @FindBy(xpath = "//small[.='Sign up']")
    private WebElement signUpWord;

    public WebElement getSignUpWord() {
        return signUpWord;
    }
//
    @FindBy(xpath = "//h4[.='Welcome Back!']")
    private WebElement welcomeBack;

    public WebElement getWelcomeBack() {
        return welcomeBack;
    }

    @FindBy(xpath = "//button[.='Sign In']")
    private WebElement signInClick;

    public WebElement getSignInClick() {
        return signInClick;
    }
    @FindBy(xpath = "//span[.='sierra macdowell']")
    private WebElement firsLastnamefild;

    public WebElement getFirsLastnamefild() {
        return firsLastnamefild;
    }
}
