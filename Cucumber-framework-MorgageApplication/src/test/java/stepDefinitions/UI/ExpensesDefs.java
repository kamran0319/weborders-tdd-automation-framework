package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.ExpensesPage;
import pages.MortgageAplicationPage;
import pages.PersonalInformationPage;
import utils.Driver;
import utils.SeleniumUtils;

public class ExpensesDefs {



    @Then("Click Next")
    public void click_next() throws InterruptedException {

//        Faker faker = new Faker();
        ExpensesPage expensesPage = new ExpensesPage();
////        SeleniumUtils.waitForVisibility(expensesPage.getMONTHLY_RENTAL_PAYMENT_EX(),10);
//         Thread.sleep(1000);
////        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",expensesPage.getMONTHLY_RENTAL_PAYMENT_EX());
//        expensesPage.getMONTHLY_RENTAL_PAYMENT_EX().click();
//        expensesPage.getMONTHLY_RENTAL_PAYMENT_EX().sendKeys(String.valueOf(faker.random().nextInt(1000, 3000)));
//        Thread.sleep(1000);
//        expensesPage.getNext_EX().click();



        Faker faker = new Faker();
        expensesPage.getMONTHLY_RENTAL_PAYMENT_EX().sendKeys(String.valueOf(faker.random().nextInt(1000, 3000)));
        Thread.sleep(1000);
        expensesPage.getNext_EX().click();
    }

    @Then("I should be able to see Borrower Employment Information")
    public void i_should_be_able_to_see_borrower_employment_information() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(new ExpensesPage().getBorrower_Employment_Information_EX().isDisplayed());
    }
}
