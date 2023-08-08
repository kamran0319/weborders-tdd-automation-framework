package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestJDBC {

    public static void main(String[] args) throws SQLException {


        String url ="jdbc:mysql://apps-database.cb72canasobc.us-east-2.rds.amazonaws.com/employees";
        Connection connection = DriverManager.getConnection(url, ConfigReader.getProperty("db.username"), ConfigReader.getProperty("db.password"));

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

        String sqlQuery = "select * from departments";
         ResultSet resultSet = statement.executeQuery(sqlQuery);
        System.out.println(resultSet);

        resultSet.next();
        String second = resultSet.getString(2);

        System.out.println(second);
        System.out.println(resultSet.getString("dept_name"));

        resultSet.absolute(4);
        System.out.println(resultSet.getString("dept_name"));


        resultSet.beforeFirst();

        while (resultSet.next()){
            System.out.println(resultSet.getString("dept_no")+" "+resultSet.getString("dept_name"));
        }

        resultSet.beforeFirst();
        System.out.println(resultSet.getRow());

        resultSet.last();

        int numOfRow = resultSet.getRow();
        System.out.println("Rows: "+ numOfRow);

        ResultSetMetaData metaData = resultSet.getMetaData();
        int numOfColumns = metaData.getColumnCount();
        System.out.println("Columns: "+ numOfColumns);


        for (int i = 1; i <=numOfColumns ; i++) {
            System.out.println(metaData.getColumnName(i));
        }

        resultSet.beforeFirst();

        List<Object> listOfLists = new ArrayList<>();
        for (int i = 1; i <=numOfRow ; i++) {
            resultSet.absolute(i);
            List<Object> inner = new ArrayList<>();
            for (int j = 1; j <=numOfColumns ; j++) {
               inner.add(resultSet.getObject(j));

            }
            listOfLists.add(inner);

        }

        System.out.println(listOfLists);


        statement.executeUpdate("insert into departments (dept_no, dept_name) values ('d015','Mechanic');");
        resultSet=statement.executeQuery("select * from departments");
        while (resultSet.next()){
            System.out.println(resultSet.getString("dept_no")+" "+resultSet.getString("dept_name"));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
