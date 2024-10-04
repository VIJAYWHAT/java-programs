package JDBC_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCInsert {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/gurukulams_notebook_db";
        String user = "tom";
        String password = "password";

        // SQL insert statement
        String sql = "INSERT INTO users (id, name) VALUES ('23USC044', 'Vijay R')";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            int rowsInserted = stmt.executeUpdate(sql);

            if (rowsInserted > 0) {
                System.out.println("A new record was inserted successfully!");
            }

        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }
    }
}
