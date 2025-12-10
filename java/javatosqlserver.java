import java.sql.*;


public class javatosqlserver {
    public static void main(String[] args) {

        String connectionString =
                "jdbc:sqlserver://localhost:1433;DatabaseName=earthquake;encrypt=true;trustServerCertificate=true;integratedSecurity=true;";

        try {
            try (Connection connection = DriverManager.getConnection(connectionString)) {

                System.out.println("Connection established...");

            }
        }
            catch (SQLException e) {
                System.out.println("Error on connection to database");
                e.printStackTrace();
            }
    }
}