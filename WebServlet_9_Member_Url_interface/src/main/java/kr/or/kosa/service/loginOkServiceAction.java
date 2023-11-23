package kr.or.kosa.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.LoginDao;
import kr.or.kosa.dto.EmpDto;
import kr.or.kosa.dto.RegisterDto;

public class loginOkServiceAction  implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		//String email = request.getParameter("email");

		//RegisterDao dao = new RegisterDao();
		LoginDao dao = new LoginDao();
		RegisterDto dto = new RegisterDto();
		dto.setEmpno(empno);
		dto.setEname(ename);
		RegisterDto logined = null;
		logined = dao.loginOK(dto);
		EmpService empService = new EmpService();
		EmpDto empDto = empService.searchByEnameAndEmpno(empno, ename);
		String resultdata="";
		if(logined != null) {
			resultdata = "welcome to kosa " + dto.getEname() + "님";
		}else {
			resultdata = "Insert Fail ..... retry...";
		}
		//4. 데이터 저장
		request.setAttribute("data", empDto);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false); //forward 방식
		forward.setPath("/WEB-INF/views/login/login_complete.jsp");
		return forward;

	}

}
