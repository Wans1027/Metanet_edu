package kr.or.kosa.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.RegisterDao;
import kr.or.kosa.dto.RegisterDto;

import java.util.Date;

public class RegisterOkServiceAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		//String email = request.getParameter("email");

		RegisterDao dao = new RegisterDao();

		RegisterDto dto = new RegisterDto();
		dto.setEmpno(empno);
		dto.setEname(ename);
		dto.setHiredate(new Date());

		int result = dao.writeOk(dto);

		String resultdata = "";
		if (result > 0) {
			resultdata = "welcome to kosa " + dto.getEname() + "님";
		} else {
			resultdata = "Insert Fail ..... retry...";
		}
		//4. 데이터 저장
		request.setAttribute("data", resultdata);
		//뷰설정하기
		String viewpage = "/WEB-INF/views/register/register_welcome.jsp";
	   

		ActionForward forward = new ActionForward();
		forward.setRedirect(false); //forward 방식
		forward.setPath(viewpage);
		
		return forward;
	}

}
