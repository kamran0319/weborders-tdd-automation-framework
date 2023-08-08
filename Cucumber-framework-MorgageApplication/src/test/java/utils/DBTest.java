package utils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBTest {

    public static void main(String[] args) throws SQLException {
        DBUtils.createConnection();

        final List<List<Object>> resultSet = DBUtils.getQueryResultAsListOfLists("select * from departments;");
        for (List<Object> row : resultSet) {
            System.out.println(row);

        }
        final Object o = resultSet.get(0).get(1);
        System.out.println(o);

        final List<Map<String, Object>> resultSet2 = DBUtils.getQueryResultListOfMaps("select * from departments;");
        for (Map<String, Object> row : resultSet2) {
            System.out.println(row);

        }
        final Object deptName = resultSet2.get(0).get("dept_name");
        System.out.println(deptName);

        String name = "IT";
        String number = "d012";
        DBUtils.executeUpdate("update departments set dept_name='"+name+"' where dept_no='"+number+"'");

        final List<List<Object>> userUpdated = DBUtils.getQueryResultAsListOfLists("select * from departments where dept_no='"+number+"' ;");
        System.out.println(userUpdated);


        final List<String> columnNames = DBUtils.getColumnNames("select * from departments where dept_no='" + number + "' ;");

        System.out.println(columnNames);

        DBUtils.close();
    }
}
