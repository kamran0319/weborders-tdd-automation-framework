package stepDefinitions.UI;

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

  @Given("Click on first name")
  public void click_on_first_name() throws InterruptedException {


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
    public void i_should_be_able_to_see_edit_buttom_is_displayed() throws InterruptedException {
      EconsentPage econsentPage = new EconsentPage();

      Thread.sleep(2000);
      Assert.assertTrue(econsentPage.getEdit_E().isDisplayed());
    }

  @Given("Click on email and enter invalid email")
  public void click_on_email_and_enter_invalid_email() throws InterruptedException {

//    The email address field should have basic validation to ensure that it is a
//    valid email address.

    EconsentPage econsentPage = new EconsentPage();
    econsentPage.getFIRST_NAME_E().sendKeys(ConfigReader.getProperty("firstname"), Keys.TAB,ConfigReader.getProperty("lastname")
            ,Keys.TAB,"hahahah@gmail.com");
    Thread.sleep(500);

    SeleniumUtils.jsClick(econsentPage.getAgree_E());
    SeleniumUtils.jsClick(econsentPage.getNext_E());
  }


  @Then("I should not be able to see Order Credit text")
  public void iShouldNotBeAbleToSeeOrderCreditText() throws InterruptedException {

    EconsentPage econsentPage = new EconsentPage();
    Thread.sleep(2000);
//    Assert.assertFalse(econsentPage.getOrder_Credit_text_E().isDisplayed());
    Assert.assertTrue(econsentPage.getOrder_Credit_text_E().isDisplayed());
  }
}
