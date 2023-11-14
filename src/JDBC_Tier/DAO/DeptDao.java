package JDBC_Tier.DAO;

import JDBC.kosa.utils.ConnectionHelper;
import JDBC_Tier.DTO.Dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//CRUD 함수
//추가사항 (Like 사용해서 부서이름 검색 하는 함수 추가)
//1. 전체조회
//2. 조건조회
//3. 데이터 삽입
//4. 데이터 수정
//5. 삭제
//6. 문자열 like 검색
public class DeptDao {

    public List<Dept> searchAll(){
        Connection conn = null;
        conn = ConnectionHelper.getConnection("oracle");
        List<Dept> result = new ArrayList<>();
        PreparedStatement pstmt = null;
        try {
            //stmt = conn.createStatement();
            //CRUD 구현

            String sql = "select deptno, dname, loc from dept";
            pstmt = conn.prepareStatement(sql);
            //ResultSet rs = stmt.executeQuery(sql); //명령실행
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()){
                int empno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                result.add(new Dept(empno, dname, loc));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn);
        }
        for (Dept dept : result) {
            dept.toString();
            System.out.println(dept.getLoc());
        }
        return result;
    }

    public Dept searchByDeptno(int deptno){
        Connection conn = null;
        conn = ConnectionHelper.getConnection("oracle");
        Dept dept = null;
        PreparedStatement pstmt = null;
        try {
            String sql = "select deptno, dname, loc from dept";
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()){
                int empno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                dept = new Dept(empno, dname, loc);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn);
        }
        System.out.println(dept.getLoc());
        return dept;
    }

    public void insertDataInDept(int deptno, String dname, String loc) {
        Connection conn1 = ConnectionHelper.getConnection("oracle");;
        PreparedStatement pstmt = null;
        try {
            String sql = "insert into dept(deptno,dname,loc) values (?,?,?)";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setInt(1,deptno);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn1);
        }
    }

    public void updateDataInDept(int deptno, String dname, String loc) {
        Connection conn1 = ConnectionHelper.getConnection("oracle");;
        PreparedStatement pstmt = null;
        try {
            String sql = "update dept set dname=?, loc=? where deptno=?";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setString(1, dname);
            pstmt.setString(2, loc);
            pstmt.setInt(3,deptno);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn1);
        }
    }

    public void searchByCharInDept(String c) {
        Connection conn1 = ConnectionHelper.getConnection("oracle");;
        PreparedStatement pstmt = null;
        try {
            String sql = "select * from dept where loc like %?%";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setString(1, c);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn1);
        }
    }

    public void deleteDataInDept(int deptno) {
        Connection conn1 = ConnectionHelper.getConnection("oracle");;
        PreparedStatement pstmt = null;
        try {
            String sql = "delete from dept where deptno=?";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setInt(1,deptno);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn1);
        }
    }



}
