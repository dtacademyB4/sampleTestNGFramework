package DBTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class EmployeesDBtest {


   @Test
    public void testUsersTable() throws SQLException {

       String url = "jdbc:mysql://duotech-db.cc652zs7kmja.us-east-2.rds.amazonaws.com/duotify";
       String username = "duotech";
       String password = "duotech2021";
       Connection connection = DriverManager.getConnection(url, username, password);

       Statement statement = connection.createStatement();

       String query = "select * from users where username=\"duotech\"";
       ResultSet resultSet = statement.executeQuery(query);

       resultSet.next();

       System.out.println(resultSet.getObject(2));

       Assert.assertTrue(resultSet.getObject(2).equals("duotech"));


   }
}
