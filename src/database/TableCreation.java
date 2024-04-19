package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TableCreation    {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/csitthird", "root", "suresh");
        String tableCreationQuery= "CREATE TABLE student( id int NOT NULL PRIMARY KEY, name varchar(255) NOT NULL, age int NOT NULL)";
        PreparedStatement statement= connection.prepareStatement(tableCreationQuery);
        statement.execute();
        System.out.println("TABLE CREATED SUCCESSFULLY");
        statement.close();
        connection.close();
    } catch (Exception e){
        e.printStackTrace();
        System.out.println("TABLE CREATION FAILED");
    }
}
}
