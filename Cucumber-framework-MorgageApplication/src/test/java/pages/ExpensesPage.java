package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class ExpensesPage {
    public ExpensesPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='monthlyrentalpayment']")
    private WebElement MONTHLY_RENTAL_PAYMENT_EX;

    @FindBy(xpath = "(//a[@class='btn btn-light-primary'])[2]")
    private WebElement next_EX;

    @FindBy(xpath = "//h6[.='Borrower Employment Information']")
    private WebElement Borrower_Employment_Information_EX;
}
