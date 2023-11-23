package kr.or.kosa.service;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dto.EmpDto;
import kr.or.kosa.dto.RegisterDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateEmpAction implements Action {

    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        int mgr = Integer.parseInt(request.getParameter("mgr"));
        System.out.println("MGR:"+mgr);
        String hiredate = request.getParameter("hiredate");
        int sal = Integer.parseInt(request.getParameter("sal"));
        int comm = Integer.parseInt(request.getParameter("comm"));
        int deptno = Integer.parseInt(request.getParameter("deptno"));
        EmpDto empDto = new EmpDto(empno, ename, job, mgr, hiredate, sal, comm, deptno);
        EmpService empService = new EmpService();
        RegisterDto dto = new RegisterDto();
        dto.setEmpno(empno);
        dto.setEname(ename);
        RegisterDto logined = null;
        int i = empService.updateEmp(empDto, empno);

        String resultdata="";
        if(i>0) {
            resultdata = "변경완료";
        }else {
            resultdata = "Insert Fail ..... retry...";
        }
        //4. 데이터 저장
        request.setAttribute("data", dto);
        //뷰설정하기
        String viewpage="/WEB-INF/views/service/update_complete.jsp";

        ActionForward forward = new ActionForward();
        forward.setRedirect(false); //forward 방식
        forward.setPath(viewpage);

        return forward;
    }
}
