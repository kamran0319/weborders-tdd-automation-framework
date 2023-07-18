package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import javax.lang.model.element.Element;
@Getter
@AllArgsConstructor

public class MortgageAplicationFildsPage {

    public MortgageAplicationFildsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Mortgage Application']")
    private WebElement MortgageApplication;


    @FindBy(xpath = "//input[@id='realtorinfo']")
    private WebElement email;


    @FindBy(xpath = "//input[@id='estimatedprice']")
    private WebElement PURCHASEPRICE;


    @FindBy(xpath = "//input[@id='downpayment']")
    private WebElement DOWNPAYMENTAMOUNT;

    @FindBy(xpath = "//a[.='Next']")
    private WebElement nextbuttom;


    @FindBy(xpath = "//input[@id='b_firstName']")
    private WebElement FIRSTNAME;



    @FindBy(xpath = "//input[@id='b_lastName']")
    private WebElement LASTNAME;

    @FindBy(xpath = "//span[@id='select2-b_suffix-container']")
    private WebElement SurffixSelect;

    @FindBy(xpath = "//select[@id='b_marital']")
    private WebElement MARITALSTATUS;



    @FindBy(xpath = "//input[@id='b_cell']")
    private WebElement CELLPHONE;


    @FindBy(linkText = "Next")
    private WebElement Next;

    @FindBy(xpath = "//input[@id='monthlyrentalpayment']")
    private WebElement MONTHLYRENTALPAYMENT;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[3]")
    private WebElement Save;



}
