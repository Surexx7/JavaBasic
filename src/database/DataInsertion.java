package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInsertion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/csitthird", "root", "suresh");
            String insertionQuery= "INSERT INTO student( id, name, age) VALUE(2, 'Nishant',20)";
            PreparedStatement statement= connection.prepareStatement(insertionQuery);
            statement.execute();
            System.out.println("INSERTION SUCCESSFULLY");
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("INSERTION FAILED");
        }
    }
}


