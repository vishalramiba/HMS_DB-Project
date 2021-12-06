

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {
    
    Connection conn=null;

    public Connection getConnection() {
      try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db","root", "");
            System.out.print("Database is connected !");
            conn.close();
        }
        catch(Exception e) {
            System.out.print("Do not connect to DB - Error:"+e);
        }
        return conn;
    }
    

    public static void main(String[] args) throws SQLException {
        database con = new database();
        con.getConnection();
    }
}
