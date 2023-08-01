package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class CreditReportPage {

    public CreditReportPage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//label[@for='creditreport2']")
    private WebElement ORDER_CREDIT_REPORT_CR;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[2]")
    private WebElement next_CR;

    @FindBy(xpath = "//h4[.='eConsent']")
    private WebElement eConsent_CR;

}
