import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:sqlite:attendance.db";

    public static void main(String[] args) {
        connect();
        createTable();
        logAttendance("John Doe", "2024-11-11", "Present");
    }

    public static void connect() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("Connected to the database successfully.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS staff_attendance ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "staff_name TEXT NOT NULL,"
                + "date TEXT NOT NULL,"
                + "status TEXT NOT NULL"
                + ");";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void logAttendance(String staffName, String date, String status) {
        String sql = "INSERT INTO staff_attendance(staff_name, date, status) VALUES(?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, staffName);
            pstmt.setString(2, date);
            pstmt.setString(3, status);
            pstmt.executeUpdate();
            System.out.println("Attendance logged for " + staffName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
