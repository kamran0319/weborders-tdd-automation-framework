package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.PersonalInformationPage;
import pages.PreapprovalDetailsPage;

public class PersonalInformationDefs {
//    @Then("Fill Preapproval Details")
//    public void fill_preapproval_details() throws InterruptedException {
//        PreapprovalDetailsDefs preapprovalDetailsDefs = new PreapprovalDetailsDefs();
//        preapprovalDetailsDefs.click_on_realtor_information();
//
//    }

//    @Given("Click on No Co-borrower")
//    public void click_on_no_co_borrower() {
//        PersonalInformationPage personalInformationPage = new PersonalInformationPage();
//        personalInformationPage.getNO_CO_BORROWER().click();
//    }
    @Then("Fill Personal Information")
    public void fill_personal_information() {
        Faker faker = new Faker();
        PersonalInformationPage personalInformationPage = new PersonalInformationPage();
        personalInformationPage.getFirstnamePI().sendKeys(faker.name().firstName(),Keys.TAB,Keys.TAB,faker.name().lastName()
                ,Keys.TAB,Keys.TAB,faker.name().firstName()+faker.name().lastName()+"@gmail.com"
                ,Keys.TAB,"07"+"31"+"2023",Keys.TAB,faker.idNumber().ssnValid(),Keys.TAB,Keys.ENTER
                ,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,faker.phoneNumber().cellPhone()
                ,Keys.TAB,faker.phoneNumber().phoneNumber());
        personalInformationPage.getNextPI().click();


    }

    @Then("I should be able to see Current Monthly Housing Expenses")
    public void i_should_be_able_to_see_current_monthly_housing_expenses() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(new PersonalInformationPage().getCurrent_Monthly_Housing_Expenses_Text().isDisplayed());
    }

}
