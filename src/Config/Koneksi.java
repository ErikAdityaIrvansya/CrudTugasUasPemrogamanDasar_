package Config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnetion() {
        if (conn==null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_inventori";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url,user,pass);
            } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}
