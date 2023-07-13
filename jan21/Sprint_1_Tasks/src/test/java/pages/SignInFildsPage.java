package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SignInFildsPage {
    public SignInFildsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//small[.='Sign in']" )
    private WebElement movesigninpage;
    public WebElement getMovesigninpage() {return movesigninpage;}

    @FindBy(id = "exampleInputEmail1" )
    private WebElement signinfild;
    public WebElement getSigninfild() {return signinfild;}


    @FindBy(xpath = "//h4[.='Welcome Back!']")
    private WebElement WellcomeText;
    public WebElement getWellcomeText() {return WellcomeText;}


    @FindBy(xpath = "//button[@class='btn btn-primary glow w-100 position-relative']")
    private WebElement signinbutton;

    public WebElement getSigninbutton() {
        return signinbutton;
    }
    @FindBy(xpath = "//*[@id=\"auth-login\"]/div/div/div/div[1]/div/div[1]/text()")
    private WebElement LoginFaild;

    public WebElement getLoginFaild() {
        return LoginFaild;
    }

}
