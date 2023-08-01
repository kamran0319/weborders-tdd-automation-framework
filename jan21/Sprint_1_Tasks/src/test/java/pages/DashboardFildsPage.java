package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Getter
@AllArgsConstructor
public class DashboardFildsPage {

    public DashboardFildsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div//h2[.='DuoBank']")
    private WebElement BankLogo;


    @FindBy(linkText = "Mortgage Application")
    private WebElement MortgageApplication;

    @FindBy(linkText = "Application List")
    private WebElement ApplicationList;
}
