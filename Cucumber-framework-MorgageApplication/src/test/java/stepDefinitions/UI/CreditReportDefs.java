package stepDefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreditReportPage;
import pages.EmploymentAndIncomePage;
import utils.Driver;
import utils.SeleniumUtils;

import java.time.Duration;

public class CreditReportDefs {


    @Given("Click NO order credit report")
    public void click_no_order_credit_report() throws InterruptedException {
//            WebDriver driver = Driver.getDriver();
//            CreditReportPage creditReportPage = new CreditReportPage();
//            // Wait for the "No Report" element to be clickable
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
////        WebElement checkbox = driver.findElement(By.id("creditreport2")); // Replace 'checkbox_id' with the actual ID of your checkbox element
////        checkbox.click();
//
//            WebElement noReportElement = wait.until(ExpectedConditions.elementToBeClickable(creditReportPage.getORDER_CREDIT_REPORT_CR()));
//            // Click on the "No Report" element using JavaScriptExecutor
//            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//            jsExecutor.executeScript("arguments[0].click();", noReportElement);
////             Click on the "Next" button
//            creditReportPage.getNext_CR().click();
//        }
////


//        Thread.sleep(1000);
//        Alert alert = Driver.getDriver().switchTo().alert();
//        alert.sendKeys("ok");
//        alert.accept();
//        CreditReportPage creditReportPage = new CreditReportPage();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
//        WebElement noReportElement = wait.until(ExpectedConditions.elementToBeClickable(creditReportPage.getORDER_CREDIT_REPORT_CR()));
//

        CreditReportPage creditReportPage = new CreditReportPage();
        SeleniumUtils.jsClick(creditReportPage.getORDER_CREDIT_REPORT_CR());
        Thread.sleep(2000);
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",creditReportPage.getORDER_CREDIT_REPORT_CR());
////
    }
        @When("Click Next buttom")
        public void click_next_buttom () {
            CreditReportPage creditReportPage = new CreditReportPage();
            SeleniumUtils.jsClick(creditReportPage.getNext_CR());

        }
        @Then("I should be able to see eConsent text")
        public void i_should_be_able_to_see_e_consent_text () {
            CreditReportPage creditReportPage = new CreditReportPage();
            Assert.assertTrue(creditReportPage.getEConsent_CR().isDisplayed());

        }
    }
