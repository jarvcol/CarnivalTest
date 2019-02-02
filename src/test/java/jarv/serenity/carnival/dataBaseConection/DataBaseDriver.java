package jarv.serenity.carnival.dataBaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseDriver {

    private final String url = "jdbc:postgresql://127.0.0.2:5432/jorge";
    private final String user = "postgres";
    private final String password = "jarv";
    private Connection conn;

    /**
     * Connect to the PostgreSQL database
     *
     * @return a DataBaseDriver object
     */
    public Connection connect() {
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void disconect(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConn() {
        try{
            if (conn.isClosed())
                connect();
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /*public static void main(String[] args) {
        DataBaseDriver app = new DataBaseDriver();
        app.connect();
    }*/
}