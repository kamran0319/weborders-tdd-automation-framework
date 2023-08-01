package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Getter
public class PreapprovalDetailsPage {

    public PreapprovalDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//input[@id='realtorinfo']")
    private WebElement realtorinfo;

    @FindBy(xpath = "//a[@class='btn btn-light-primary']")
    private WebElement next;

    @FindBy(xpath = "//div[@class='borrower']//h6")
    private WebElement perInfoText;

    @FindBy(xpath = "//input[@id='estimatedprice']")
    private WebElement ESTIMATED_PURCHASE_PRICE;

    @FindBy(xpath = "//input[@id='downpaymentpercentage']")
    private WebElement DOWN_PAYMENT_PERCENTAGE;

    @FindBy(xpath = "//input[@id='downpayment']")
    private WebElement DOWN_PAYMENT_AMOUN;


}
