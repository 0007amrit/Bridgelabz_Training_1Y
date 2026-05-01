import java.sql.*;

public class SalaryManager {

    static final String DB_URL = "jdbc:mysql://localhost:3306/company_db";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            // 1. Create Table
            String sqlCreate = "CREATE TABLE IF NOT EXISTS employee " +
                    "(id INT PRIMARY KEY, name VARCHAR(50), salary DOUBLE)";
            stmt.executeUpdate(sqlCreate);
            System.out.println("Table created successfully.");


            String sqlInsert = "INSERT INTO employee VALUES (1, 'Amrit', 35000)";
            stmt.executeUpdate(sqlInsert);


            String sqlSelect = "SELECT * FROM employee WHERE salary > 30000";
            ResultSet rs = stmt.executeQuery(sqlSelect);
            System.out.println("Employees with salary > 30000:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Salary: " + rs.getDouble("salary"));
            }


            String sqlUpdate = "UPDATE employee SET salary = salary * 1.10 WHERE id = 1";
            stmt.executeUpdate(sqlUpdate);


            String sqlDelete = "DELETE FROM employee WHERE salary < 15000";
            int deletedRows = stmt.executeUpdate(sqlDelete);
            System.out.println("Deleted " + deletedRows + " employees with low salary.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}