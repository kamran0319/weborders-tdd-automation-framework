package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
public class MortgageAplicationPage {
    public MortgageAplicationPage() {
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "(//span[@class='menu-item'])[1]")
    private WebElement mortgageApplicationClick;
    @FindBy(xpath = "//div[@class='breadcrumb-wrapper col-12']")
    private WebElement uniformResidentialLoan;



}
