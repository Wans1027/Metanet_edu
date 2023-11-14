package JDBC;

import JDBC.kosa.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
create table trans_A(
   num number,
   name varchar2(20)
);

create table trans_B(
   num number constraint pk_trans_B_num primary key,
   name varchar2(20)
);

JDBC >> default(DML) >> autocommit >> 실반영된다
JDBC >> autocommit >> 변경(옵션) >> False >> 개발자 직접(반드시) >> commit , rollback 제어 허락


은행업무 (여러개의 DML 처리되어야 하는 경우)
*/
public class Ex04_Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;

		conn = ConnectionHelper.getConnection("oracle");

		String sql = "insert into trans_A(num,name) values(100,'A')";
		String sql2 = "insert into trans_A(num,name) values(100,'B')";

		try{
			//업무상 (둘 다 성공 아니면 둘다 실패 극단적인 처리 >> 하나의 논리적인 작업단위 (transaction)
			conn.setAutoCommit(false); //JDBC commit, rollback 개발자가 강제 하겠다
			pstmt = conn.prepareStatement(sql);
			pstmt2 = conn.prepareStatement(sql2);
			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			//예외 발생하지 않으면
			//여기까지 오는데 이때 커밋
			conn.commit();
		}catch (Exception e){
			try {
				conn.rollback();
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			}
		}finally {
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(pstmt2);
			ConnectionHelper.close(conn);
		}
	}

}
