package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import pages.SignUpPage;
import utils.DBUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
public class UsersTableDefs {

    SharedData sharedData;

    public UsersTableDefs(SharedData sharedData) {
        this.sharedData = sharedData;
    }

//    --------------------The database should ensure that each user has a unique username and email
//    address associated with their account.-----------------------
    @Given("I fill up the fields with the following info and click sign up")
    public void i_fill_up_the_fields_with_the_following_info_and_click_sign_up(List<Map<String,String>> dataTable) {
//        System.out.println(dataTable);
        SignUpPage signUpPage = new SignUpPage();

        Map<String, String> row = dataTable.get(0);
//        System.out.println("ROW => " + row);

//        username = row.get("username");
        expectedFirst = row.get("username");
        signUpPage.getFirstname().sendKeys(expectedFirst);
        signUpPage.getLastname().sendKeys(row.get("lastname"));
        signUpPage.getEmail().sendKeys(row.get("email"));
        signUpPage.getPassword().sendKeys(row.get("password"));

        signUpPage.getRegister().click();
    }
    @Then("I should be able to sign up")
    public void i_should_be_able_to_sign_up() {
     List<List<Object>> list = DBUtils.getQueryResultAsListOfLists("select last_name from tbl_user where first_name='" + expectedFirst + "';");
        Assert.assertTrue(!list.isEmpty());
    }

    String expectedFirst;
    @Then("the created user info in the database should be the following")
    public void the_created_user_info_in_the_database_should_be_the_following(List<Map<String, String>> expected) throws SQLException {
        Map<String, String> expectedData = expected.get(0);

        System.out.println("expectedData => "+expectedData);

//        String expectedId = expectedData.get("id");
        String expectedEmail = expectedData.get("email");
        String expectedPass = expectedData.get("password");
        expectedFirst = expectedData.get("username");
        String expectedLast = expectedData.get("lastname");

        String expectedPassMd5 = DigestUtils.md5Hex(expectedPass);


        List<Map<String, Object>> listOfMaps = DBUtils.getQueryResultListOfMaps("select first_name,last_name,email ,password from tbl_user where first_name='"+expectedFirst+"';");

        Map<String, Object> actualDbData = listOfMaps.get(0);
        System.out.println("Actual ->"+actualDbData);

        try {

            Assert.assertEquals(expectedEmail, actualDbData.get("email"));
            Assert.assertEquals(expectedPassMd5, actualDbData.get("password"));
            Assert.assertEquals(expectedFirst, actualDbData.get("first_name"));
            Assert.assertEquals(expectedLast, actualDbData.get("last_name"));

        }finally {
            DBUtils.executeUpdate("delete from tbl_user where first_name='"+expectedFirst+"';");
        }

    }

}
