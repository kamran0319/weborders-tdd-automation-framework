package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CreditReportPage;
import pages.EconsentPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class EconsentDefs {

  /**  Acceptance Criteria:
            The user should be required to enter their first and last name and email
    address in order to proceed. All fields are required.



The user should be presented with the necessary disclosures related to the
    loan application, which should be displayed clearly and prominently on the
    page.

The user should be able to read and review the disclosures before agreeing
    or disagreeing to them.

            The page should include two radio buttons, one for "Agree" and one for
            "Don't Agree".

            The "Agree" button should be selected by default, and the user should be
    required to explicitly select the "Don't Agree" button if they do not agree to
    the terms and conditions.

            If the user selects the "Don't Agree" button, they should be redirected back to
    the main application flow and should not be able to proceed with the
    application.

If the user selects the "Agree" button, they should be able to proceed with
    the application.

            The user should not be able to submit the eConsent agreement without
    selecting one of the radio buttons. An error message should be displayed if
    the user procceds without selecting any option.**/


  @Given("Click on first name")
  public void click_on_first_name() throws InterruptedException {

    CreditReportDefs creditReportDefs = new CreditReportDefs();
    creditReportDefs.click_no_order_credit_report();
    creditReportDefs.click_next_buttom();

    EconsentPage econsentPage = new EconsentPage();
    econsentPage.getFIRST_NAME_E().sendKeys(ConfigReader.getProperty("firstname"), Keys.TAB,ConfigReader.getProperty("lastname")
            ,Keys.TAB,ConfigReader.getProperty("email"));
  }
    @When("Click Agree buttom")
    public void click_agree_buttom() {
      EconsentPage econsentPage = new EconsentPage();
      SeleniumUtils.jsClick(econsentPage.getAgree_E());
      SeleniumUtils.jsClick(econsentPage.getNext_E());

    }
    @Then("I should be able to see Edit buttom is Displayed")
    public void i_should_be_able_to_see_edit_buttom_is_displayed() {
      EconsentPage econsentPage = new EconsentPage();
      Assert.assertTrue(econsentPage.getEdit_E().isDisplayed());
    }

  @Given("Click on email and enter invalid email")
  public void click_on_email_and_enter_invalid_email() throws InterruptedException {

//    The email address field should have basic validation to ensure that it is a
//    valid email address.

    CreditReportDefs creditReportDefs = new CreditReportDefs();
    creditReportDefs.click_no_order_credit_report();
    creditReportDefs.click_next_buttom();

    EconsentPage econsentPage = new EconsentPage();
    econsentPage.getFIRST_NAME_E().sendKeys(ConfigReader.getProperty("firstname"), Keys.TAB,ConfigReader.getProperty("lastname")
            ,Keys.TAB,"hahahah@gmail.com");
    Thread.sleep(500);

    SeleniumUtils.jsClick(econsentPage.getAgree_E());
    SeleniumUtils.jsClick(econsentPage.getNext_E());
  }


  @Then("I should not be able to see Order Credit text")
  public void iShouldNotBeAbleToSeeOrderCreditText() {

    EconsentPage econsentPage = new EconsentPage();
    Assert.assertFalse(econsentPage.getOrder_Credit_text_E().isDisplayed());
//    Assert.assertTrue(econsentPage.getOrder_Credit_text_E().isDisplayed());
  }
}
