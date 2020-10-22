package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoCreate {

    // CRUD
    // Create  - X
    // Read    - V
    // Update  - X
    // Delete  - X

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String coString = "jdbc:mysql://localhost:3308/dbslide?serverTimezone=UTC";
        String username = "root";
        String password = "";

        try (Connection co = DriverManager.getConnection(coString, username, password)){

            Statement stmt = co.createStatement();

            String requeteInsert = "INSERT INTO student " +
                    " VALUES (" +
                    " 100, 'Kim', 'Bassinger', '1950/10/10', 'kbassinger', 1010, 10, '' " +
                    " )";

            String requeteDelete = "DELETE FROM student WHERE student_id = 100";
            String requeteUpdate = "UPDATE student SET first_name = 'kimmy' WHERE student_id = 100";

            int impacted = stmt.executeUpdate(requeteUpdate);
            System.out.println("Lignes impactées : " + impacted);

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}
