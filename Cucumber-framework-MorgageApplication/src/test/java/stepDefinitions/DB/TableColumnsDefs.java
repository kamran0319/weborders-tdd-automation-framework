package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import pages.SignUpPage;
import utils.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


//------------------The database should have "tbl_users" table which should contain the
//        following columns--------------------------

public class TableColumnsDefs {

    SharedData sharedData;

    public TableColumnsDefs(SharedData sharedData) {
        this.sharedData = sharedData;
    }

//    ArrayList<String> list2;
    @When("I retrieve the column names from the {string} table")
    public void i_retrieve_the_column_names_from_the_table(String tableName) {
     List<List<Object>> list = DBUtils.getQueryResultAsListOfLists("describe "+tableName);

        System.out.println(list);
        sharedData.setDbColumnNames(new ArrayList<>());

//        list2 = new ArrayList<>();
        for (List<Object> each : list) {
//           list2.add((String) each.get(0));
            sharedData.getDbColumnNames().add((String) each.get(0));
        }

    }
    @Then("it should have the following list")
    public void it_should_have_the_following_list(List<String> expected) {
        System.out.println(expected);
        Assert.assertEquals(expected,sharedData.getDbColumnNames());

    }

}
