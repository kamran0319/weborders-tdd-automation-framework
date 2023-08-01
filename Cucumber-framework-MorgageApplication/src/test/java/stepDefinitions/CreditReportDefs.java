package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreditReportPage;
import pages.EmploymentAndIncomePage;
import utils.SeleniumUtils;

public class CreditReportDefs {


    @Given("Click NO order credit report")
    public void click_no_order_credit_report() throws InterruptedException {

        EmploymentAndIncomeDefs employmentAndIncomeDefs = new EmploymentAndIncomeDefs();
        employmentAndIncomeDefs.click_employer_name_and_fill_all_section();

        CreditReportPage creditReportPage = new CreditReportPage();
        SeleniumUtils.jsClick(creditReportPage.getORDER_CREDIT_REPORT_CR());

    }
    @When("Click Next buttom")
    public void click_next_buttom() {
        CreditReportPage creditReportPage = new CreditReportPage();
        SeleniumUtils.jsClick(creditReportPage.getNext_CR());
    }
    @Then("I should be able to see eConsent text")
    public void i_should_be_able_to_see_e_consent_text() {
        CreditReportPage creditReportPage = new CreditReportPage();
        Assert.assertTrue(creditReportPage.getEConsent_CR().isDisplayed());

    }
}
