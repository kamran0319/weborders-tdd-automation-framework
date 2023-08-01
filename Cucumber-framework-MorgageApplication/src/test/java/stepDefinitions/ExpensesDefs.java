package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ExpensesPage;
import pages.MortgageAplicationPage;
import pages.PersonalInformationPage;
import utils.SeleniumUtils;

public class ExpensesDefs {


    @Given("Add monthly rental")
    public void add_monthly_rental() throws InterruptedException {


        PreapprovalDetailsDefs preapprovalDetailsDefs = new PreapprovalDetailsDefs();
        preapprovalDetailsDefs.i_am_on_the_mortgage_application();
        preapprovalDetailsDefs.click_on_realtor_information();

        PersonalInformationDefs personalInformationDefs = new PersonalInformationDefs();
        personalInformationDefs.fill_personal_information();



    }
    @Then("Click Next")
    public void click_next() {
        ExpensesPage expensesPage = new ExpensesPage();
        SeleniumUtils.waitForVisibility(expensesPage.getMONTHLY_RENTAL_PAYMENT_EX(),5);
        expensesPage.getMONTHLY_RENTAL_PAYMENT_EX().sendKeys("2000");

        expensesPage.getNext_EX().click();
    }

    @Then("I should be able to see Borrower Employment Information")
    public void i_should_be_able_to_see_borrower_employment_information() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(new ExpensesPage().getBorrower_Employment_Information_EX().isDisplayed());
    }
}
