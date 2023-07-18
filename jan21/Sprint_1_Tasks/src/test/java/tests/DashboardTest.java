package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardFildsPage;
import pages.SignInFildsPage;
import pages.SignInPage;

public class DashboardTest extends TestBase{



    @Test
    public void Dashboard() {

        SignInFildsPage signInFildsPage = new SignInFildsPage();
        signInFildsPage.getMovesigninpage().click();

        SignInPage signInPage = new SignInPage();
        signInPage.SignInCredentials();

        DashboardFildsPage dashboardFildsPage = new DashboardFildsPage();
        Assert.assertTrue(dashboardFildsPage.getBankLogo().isDisplayed());// BankLogo is displayed
        Assert.assertTrue(dashboardFildsPage.getMortgageApplication().isDisplayed());
        Assert.assertTrue(dashboardFildsPage.getApplicationList().isDisplayed());




    }

}
