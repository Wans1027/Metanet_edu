package JDBC;

import JDBC.kosa.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

        //개인별 JDBC 문제
        //String sql = "update dmlemp set ename=? , sal=?, job=?, deptno=? where empno=?";
        //ename = 홍길동, sal = 1000, job=It, deptno = 10, empno=100
        //으로 변경하는 DML을 수행하세요
        //단 parameter 처리는 prepareStatement 사용

        Connection conn1 = ConnectionHelper.getConnection("oracle");;
        PreparedStatement pstmt = null;
        try {
            String sql = "update dmlemp set ename = ? , sal=?, job=?, deptno=? where empno=?";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setString(1,"홍길동");
            pstmt.setInt(2,1000);
            pstmt.setString(3, "IT");
            pstmt.setInt(4, 10);
            pstmt.setInt(5, 100);

            int row = pstmt.executeUpdate();
            if (row > 0) {
                System.out.println("row : " + row);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn1);
        }
    }
}
