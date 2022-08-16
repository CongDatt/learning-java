import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mySQL://localhost:3306/ontap";
            String user = "root";
            String password = "";

            // connect 
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }

        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if(c != null) {
                c.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
