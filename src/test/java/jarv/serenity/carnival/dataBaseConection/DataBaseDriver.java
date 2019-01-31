package jarv.serenity.carnival.dataBaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseDriver {

    private final String url = "jdbc:postgresql://127.0.0.2:5432/jorge";
    private final String user = "postgres";
    private final String password = "jarv";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a DataBaseDriver object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        DataBaseDriver app = new DataBaseDriver();
        app.connect();
    }
}