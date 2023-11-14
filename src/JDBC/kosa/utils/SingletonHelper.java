package JDBC.kosa.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonHelper {
    private SingletonHelper singletonHelper;
    private SingletonHelper() {};
    private static  Connection conn = null;

    public static Connection getConnection(String dsn) {
        if(conn != null){
            return conn;
        }
        try{
            if (dsn.equals("oracle")) {
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KOSA", "1004");
            } else if (dsn.equals("mariadb")) {
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KOSA", "1004");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
