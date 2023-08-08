package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import pages.PreapprovalDetailsPage;
import stepDefinitions.UI.MortgageAplicationDefs;
import utils.Driver;

public class PreapprovalDetailsDefs {


    @Given("I am on the Mortgage Application")
    public void i_am_on_the_mortgage_application() throws InterruptedException {
        MortgageAplicationDefs mortgageAplicationDefs = new MortgageAplicationDefs();
        mortgageAplicationDefs.i_click_on_mortgage_application();
    }

    @Then("Click on Realtor Information")
    public void click_on_realtor_information() throws InterruptedException {
        Faker faker = new Faker();
        PreapprovalDetailsPage preapprovalDetailsPage = new PreapprovalDetailsPage();
        preapprovalDetailsPage.getRealtorinfo().sendKeys(faker.name().firstName(), Keys.TAB, Keys.TAB);
        Thread.sleep(500);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        Thread.sleep(500);
        preapprovalDetailsPage.getESTIMATED_PURCHASE_PRICE().sendKeys("200000");
        preapprovalDetailsPage.getDOWN_PAYMENT_AMOUN().sendKeys("20000");

        preapprovalDetailsPage.getDOWN_PAYMENT_PERCENTAGE().sendKeys(Keys.TAB, Keys.TAB
                ,"2000", Keys.TAB,Keys.ENTER);

    }
    @Then("I should be able to see {string}")
    public void i_should_be_able_to_see(String string) throws InterruptedException {

        Thread.sleep(500);
        Assert.assertTrue(new PreapprovalDetailsPage().getPerInfoText().isDisplayed());
    }
}