package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Assert;
import pages.SignUpPage;
import utils.DBUtils;
import utils.SeleniumUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;



//  ------  The database should be able to handle a large number of user signups
//    without slowing down the system.------
@NoArgsConstructor
public class SignUpDefs {


    SharedData sharedData;
    String username;
    public SignUpDefs(SharedData sharedData) {this.sharedData = sharedData;}


    @Given("I enter valid credentials on the ui")
    public void i_enter_valid_credentials_on_the_ui(List<Map<String,String>> dataTable) throws InterruptedException {

        System.out.println(dataTable);
        SignUpPage signUpPage = new SignUpPage();

        Map<String, String> row = dataTable.get(0);
        System.out.println("ROW => " + row);

//        sharedData.setUsername(row.get("username"));
        username = row.get("username");
        signUpPage.getFirstname().sendKeys(username);
        signUpPage.getLastname().sendKeys(row.get("lastname"));
        signUpPage.getEmail().sendKeys(row.get("email"));
        signUpPage.getPassword().sendKeys(row.get("password"));

        signUpPage.getRegister().click();
    }

    @Then("I should be able to see {string} text")
    public void i_should_be_able_to_see_text(String string) {
        SeleniumUtils.waitForVisibility(new SignUpPage().getWelcomeBack(),20);
        Assert.assertTrue(new SignUpPage().getWelcomeBack().isDisplayed());
    }
    @Then("The user is deleted in the database")
    public void the_user_is_deleted_in_the_database() throws SQLException {
        String query = "DELETE from tbl_user where first_name='"+username+"'";
        DBUtils.executeUpdate(query);
    }


}
