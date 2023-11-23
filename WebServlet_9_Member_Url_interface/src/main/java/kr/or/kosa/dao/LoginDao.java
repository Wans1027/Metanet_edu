package kr.or.kosa.dao;

import kr.or.kosa.dto.RegisterDto;
import kr.or.kosa.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class LoginDao {

    public RegisterDto loginOK(RegisterDto dto) { //로그인
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result =0;
        RegisterDto loginDto = null;
        try {
            conn = ConnectionHelper.getConnection("oracle");
            String sql="select * from emp where empno=? and ename=?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1,dto.getEmpno());
            pstmt.setString(2, dto.getEname());

            result = pstmt.executeUpdate();
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                Date today = new Date();
                loginDto = new RegisterDto(empno, ename, today);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ConnectionHelper.close(pstmt);
            ConnectionHelper.close(conn); //반환
        }
        return loginDto;
    }
}
