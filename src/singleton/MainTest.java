package singleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {
    public static void main(String[] args) throws SQLException {

        Connection conn = DbClass.getConnection();
        Statement stmt = (Statement) conn.createStatement();
        String sql = "SELECT * FROM user_tb";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String username = rs.getString("username");

            System.out.println(username);
        }

    }
}