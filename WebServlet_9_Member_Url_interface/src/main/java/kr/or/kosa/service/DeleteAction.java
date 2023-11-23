package kr.or.kosa.service;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAction implements Action {

    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        EmpService empService = new EmpService();
        int empno = Integer.parseInt(request.getParameter("empno"));
        empService.deleteEmp(empno);
        //뷰설정하기
        String viewpage="/default.html";

        ActionForward forward = new ActionForward();
        forward.setRedirect(false); //forward 방식
        forward.setPath(viewpage);

        return forward;

    }
}
