package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EmploymentAndIncomePage;
import pages.ExpensesPage;
import utils.SeleniumUtils;

import java.security.Key;

public class EmploymentAndIncomeDefs {


    @Given("Click EMPLOYER NAME and fill all section")
    public void click_employer_name_and_fill_all_section() throws InterruptedException {

        Faker faker = new Faker();
//
//        ExpensesDefs expensesDefs = new ExpensesDefs();
//        expensesDefs.add_monthly_rental();
//
//        ExpensesPage expensesPage = new ExpensesPage();
//        expensesPage.getMONTHLY_RENTAL_PAYMENT_EX().sendKeys("2000");
//
//
        EmploymentAndIncomePage employmentAndIncomePage = new EmploymentAndIncomePage();
//        Thread.sleep(500);
//
//
//        SeleniumUtils.jsClick(expensesPage.getNext_EX());


        employmentAndIncomePage.getEMPLOYER_NAME_EaI().sendKeys(faker.name().firstName(), Keys.TAB
                , Keys.TAB, Keys.TAB, Keys.TAB,"07"+"31"+"2023", Keys.TAB, Keys.TAB,"8000"
                , Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB
                , Keys.TAB, Keys.TAB, Keys.TAB);
        employmentAndIncomePage.getNext_EaI().click();

    }
    @Then("I should be able to see PreApproval Inquiry")
    public void i_should_be_able_to_see_pre_approval_inquiry() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(new EmploymentAndIncomePage().getPreApproval_Inquiry_text_EaI().isDisplayed());
    }


    @When("Click Next EaI")
    public void clickNextEaI() {
        EmploymentAndIncomePage employmentAndIncomePage = new EmploymentAndIncomePage();
        employmentAndIncomePage.getNext_EaI().click();
    }
}
