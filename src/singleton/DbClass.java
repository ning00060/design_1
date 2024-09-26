package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbClass {


    private static final String DB_URL="jdbc:mysql://localhost:3306/mybank?serverTimezone=Asia/Seoul";


	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "asd123";

    private DbClass(){}
    public static synchronized Connection getConnection( ) throws SQLException{
        try {
            Class.forName("com.mysql.cj.Driver");
        } catch (Exception e) {
            System.out.println("DB 드라이버 로딩 실패");
            e.printStackTrace();
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }
}
