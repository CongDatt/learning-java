import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
        try {
            // B1: Tao Ket noi
            Connection connection = JDBCUtil.getConnection();

            // B2: Tao doi tuong statement
            Statement statement = connection.createStatement();

            // B3: Xu ly insert data
            String sql = "INSERT INTO persons(last_name, first_name, gendetn, dob, income)"
                    + "VALUES (\"Tran\", \"Thi\", \"C\", \"2000-09-10\", 10000000)";

            // B4: Show Kq
            int check = statement.executeUpdate(sql);
            System.out.println("So dong thay doi: "  + check);
            if(check > 0) {
                System.out.println("Updated !!!!");
            }

            // B5: Dong ket noi
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
