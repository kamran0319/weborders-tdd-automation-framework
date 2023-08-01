package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class EmploymentAndIncomePage {
    public EmploymentAndIncomePage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='employername1']")
    private WebElement EMPLOYER_NAME_EaI;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[2]")
    private WebElement next_EaI;

    @FindBy(xpath = " (//h6[@class='pb-50'])[2]")
    private WebElement PreApproval_Inquiry_text_EaI;
    @FindBy(xpath = "//input[@id='monthlyrentalpayment']")
    private WebElement MONTHLY_RENTAL_PAYMENT_EaI;



}
