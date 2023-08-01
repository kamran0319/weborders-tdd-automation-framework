package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class PersonalInformationPage {
    public PersonalInformationPage() {PageFactory.initElements(Driver.getDriver(),this);}
@FindBy(xpath = "//input[@id='b_firstName']")
    private WebElement firstnamePI;

    @FindBy(xpath = "//label[@for='coborrower2']")
    private WebElement NO_CO_BORROWER;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[2]")
    private WebElement nextPI;

    @FindBy(xpath = "//h3[@id='steps-uid-0-h-2']//following::fieldset[@class='pt-0 body current']//h6[.='Current Monthly Housing Expenses']")
    private WebElement Current_Monthly_Housing_Expenses_Text;


}
