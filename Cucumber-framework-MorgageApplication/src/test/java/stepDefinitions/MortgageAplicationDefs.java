package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.MortgageAplicationPage;

public class MortgageAplicationDefs  {


    @When("I click on Mortgage Application")
    public void i_click_on_mortgage_application() throws InterruptedException {
        MortgageAplicationPage mortgageAplicationPage = new MortgageAplicationPage();
        loginStepDefs loginStepDefs = new loginStepDefs();
        loginStepDefs.i_enter_the_valid_credentials();
        mortgageAplicationPage.getMortgageApplicationClick().click();

    }
    @Then("I should be able to see Preapproval Details")
    public void i_should_be_able_to_see_preapproval_details() {
        Assert.assertTrue(new MortgageAplicationPage().getUniformResidentialLoan().isDisplayed());
    }
}
