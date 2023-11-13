package JDBC;

import JDBC.kosa.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex03_Oracle_DML_update_Helper {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        conn = ConnectionHelper.getConnection("oracle");
        System.out.println(conn.toString());
        System.out.println(conn.getMetaData().getDatabaseProductName());
        System.out.println(conn.getMetaData().getDatabaseProductVersion());
        System.out.println(conn.isClosed());//false
        ConnectionHelper.close(conn);
        System.out.println(conn.isClosed());//true
    }
}
