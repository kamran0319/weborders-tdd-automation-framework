package stepDefinitions.DB;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DataBase_schemaTable {


    SharedData sharedData;

    public DataBase_schemaTable(SharedData sharedData) {
        this.sharedData = sharedData;
    }



    @When("I retrieve the columns names from the {string} table")
    public void i_retrieve_the_columns_names_from_the_table(String tableName) {
    sharedData.setColumnNames( DBUtils.getColumnNames("select rent_own_status,monthly_rental_payment,first_mortagage_total_payment from "+tableName+""));
        System.out.println(sharedData.getColumnNames());
    }
    @Then("The database schema should have following list")
    public void the_database_schema_should_have_following_list(List<String> expected) {
        System.out.println(expected);
        Assert.assertEquals(expected,sharedData.getColumnNames());
    }



    @When("I retrieve the field values from the {string} field")
    public void i_retrieve_the_field_values_from_the_field(String fieldName) {
     sharedData.setValue( DBUtils.getQueryResultAsListOfLists("select rent_own_status, count(*) from tbl_mortagage group by "+fieldName+" having count(*)>1"));

        System.out.println(sharedData.getValue());
    }
    @Then("The database schema should have following two values")
    public void the_database_schema_should_have_following_two_values(List<Object> expected) {

        System.out.println(expected);
        Assert.assertEquals(expected,sharedData.getValue());

    }





    @When("I fill the {string} with {string} value field on idNum {int}")
    public void i_fill_the_with_value_field_on_id_num(String fieldName, String negValue, Integer idNum) throws SQLException {
        sharedData.setFieldName(fieldName);
        sharedData.setIdNum(idNum);
        sharedData.setNegValue(negValue);
        String query ="update tbl_mortagage set "+sharedData.getFieldName()+"='"+negValue+"' where id='"+ sharedData.getIdNum() +"';";
       DBUtils.executeUpdate(query);



    }
    @Then("The database schema should not show negative values")
    public void the_database_schema_should_not_show_negativ_values() {
    List<List<Object>> actual = DBUtils.getQueryResultAsListOfLists("select  " + sharedData.getFieldName() + " from tbl_mortagage where id='" + sharedData.getIdNum() + "' ;");

    Object o = actual.get(0).get(0);
        Assert.assertNotEquals(o,sharedData.getNegValue());

    }
}
