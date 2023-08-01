package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class EconsentPage {
public EconsentPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@id='PreApprovalEdit']")
    private WebElement Edit_E;

    @FindBy(xpath = "//input[@id='eConsentdeclarerFirstName']")
    private WebElement FIRST_NAME_E;


    @FindBy(xpath = "//label[@class='custom-control-label']")
    private WebElement Agree_E;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[2]")
    private WebElement next_E;

    @FindBy(xpath = "//a[.='WITHDRAWAL OF CONSENT']")
    private WebElement WITHDRAWAL_OF_CONSENT_text_E;

    @FindBy(xpath = "//h6[.='Order Credit']")
    private WebElement Order_Credit_text_E;

}
