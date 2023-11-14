package JDBC_Tier;

import JDBC_Tier.DAO.DeptDao;
import JDBC_Tier.DTO.Dept;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        //요청 받고 ... 처리 담당
        //Controller, View

        //1.부서 테이블 데이터 전체 조회 화면 출력

        //2. 부서 번호로 조건 조회 1건의 부서 정보 화면 출력

        //3. 데이터 삽입 (1건) (50, 'IT', 'SEOUL')

        //3.1 다시 전체 조회

        //4. 방금전 삽입 했던 데이터 수정
        //4.1 부서이름 ('IT_UP', 'BUSAN')
        //4.2 다시 전체 조회

        //5. 방금전 수정했던 데이터 삭제
        //5.1 50번 삭제
        //5.2 다시 전체 조회

        DeptDao deptDao = new DeptDao();
        deptDao.searchAll();
        Dept dept = deptDao.searchByDeptno(10);
        System.out.println(dept.toString());
        deptDao.insertDataInDept(50, "IT", "SEOUL");
        deptDao.searchAll();
        deptDao.updateDataInDept(50, "IT_UP", "BUSAN");
        deptDao.searchAll();
        deptDao.deleteDataInDept(50);
        deptDao.searchAll();
    }
}
