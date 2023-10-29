package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db"; // Your database URL
        String user = "user"; // Your database username
        String password = "password"; // Your database password

        // Try-with-resources statement to manage database resources
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            while (rs.next()) {
                // Retrieve data by column name
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Username: " + username);
                System.out.println(", Email: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
