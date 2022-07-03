package jdbctests;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) throws SQLException {

        //we need connection string to connect database and our project

        String dbUrl = "jdbc:oracle:thin:@3.83.68.127:1521:XE";
        String dbUsername="hr";
        String dbPassword="hr";

        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from regions");

        //next() --> move pointer to first row
        resultSet.next();

        //getting information with column name
        System.out.println(resultSet.getString("region_name"));

        //getting information with column index (index starts 1)
        System.out.println(resultSet.getString(2));
        

        //close connection

        resultSet.close();
        statement.close();
        connection.close();











    }
}
