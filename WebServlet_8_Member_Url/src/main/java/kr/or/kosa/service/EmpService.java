package kr.or.kosa.service;

import kr.or.kosa.dto.EmpDto;
import kr.or.kosa.dto.RegisterDto;
import kr.or.kosa.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmpService {
    public int updateEmp(EmpDto empDto, int empno) { //회원정보수정
        Connection conn = null;
        PreparedStatement pstmt = null;

        int result =0;
        try {
            conn = ConnectionHelper.getConnection("oracle");
            //// mgr INT, hiredate DATE, sal INT, comm INT, deptno INT;
            String sql="update emp set job= ?, sal= ?, comm = ?, deptno = ?, mgr= ? where empno= ?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, empDto.getJob());
            pstmt.setInt(2, empDto.getSal());
            pstmt.setInt(3, empDto.getComm());
            pstmt.setInt(4, empDto.getDeptno());
            pstmt.setInt(5, empDto.getMgr());
            pstmt.setInt(6, empno);

            result = pstmt.executeUpdate();
            pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return result;
    }
    public int deleteEmp(int empno) { //회원정보수정
        Connection conn = null;
        PreparedStatement pstmt = null;

        int result =0;
        try {
            conn = ConnectionHelper.getConnection("oracle");
            //// mgr INT, hiredate DATE, sal INT, comm INT, deptno INT;
            String sql="delete from emp where empno= ?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, empno);

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return result;
    }

    public List<EmpDto> searchEmpByNameLike(String text) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        int result =0;
        List<EmpDto> empDtoList = new ArrayList<>();
        try {
            conn = ConnectionHelper.getConnection("oracle");
            //// mgr INT, hiredate DATE, sal INT, comm INT, deptno INT;
            String s = new StringBuilder().append("%").append(text).append("%").toString();
            String sql="select * from emp where ename like ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%"+text+"%");
            result = pstmt.executeUpdate();
            System.out.println(result);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                empDtoList.add(new EmpDto(empno, ename, job, mgr, hiredate, sal, comm, deptno));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return empDtoList;
    }
    public List<EmpDto> searchAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result =0;
        List<EmpDto> empDtoList = new ArrayList<>();
        try {
            conn = ConnectionHelper.getConnection("oracle");
            //// mgr INT, hiredate DATE, sal INT, comm INT, deptno INT;
            String sql="select * from emp";
            pstmt = conn.prepareStatement(sql);
            result = pstmt.executeUpdate();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                empDtoList.add(new EmpDto(empno, ename, job, mgr, hiredate, sal, comm, deptno));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return empDtoList;
    }

    public EmpDto searchByEnameAndEmpno(int empnoIn, String enameIn) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        EmpDto empDto = null;
        try {
            conn = ConnectionHelper.getConnection("oracle");
            //// mgr INT, hiredate DATE, sal INT, comm INT, deptno INT;
            String sql="select * from emp where empno=? and ename=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,empnoIn);
            pstmt.setString(2,enameIn);
            int result = pstmt.executeUpdate();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                int sal = rs.getInt("sal");
                System.out.println(sal);
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                empDto = new EmpDto(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return empDto;
    }
}
