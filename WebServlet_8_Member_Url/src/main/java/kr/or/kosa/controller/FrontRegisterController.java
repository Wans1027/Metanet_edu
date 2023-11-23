package kr.or.kosa.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.LoginDao;
import kr.or.kosa.dao.RegisterDao;
import kr.or.kosa.dto.EmpDto;
import kr.or.kosa.dto.RegisterDto;
import kr.or.kosa.service.EmpService;

/*
Url 방식 (command 방식 상관 없다)
http://192.168.0.46:8090/WebSite/list.do >> *.do 매핑
http://192.168.0.46:8090/WebSite/write.do >> *.do 매핑

Command방식(parameter 업무 파악)
@WebServlet("site.do")
http://192.168.0.46:8090/WebSite/site.do?cmd=list
http://192.168.0.46:8090/WebSite/site.do?cmd=write

*/
@WebServlet("*.do")
public class FrontRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FrontRegisterController() {
        super();
       
    }


	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.한글
		//2.데이터 받기
		//3.요청 판단하기 ... 판단에 따른 서비스 실행

		// 16:30분까지 조별 1명 접속 회원가입 할게요 ^^
		// register 라면 회원가입 주세요 >> register.jsp
		// registerok 라면 회원데이터 받아서 DB insert 하세요 그리고 webcome 페이지 forward
		// request 에 "회원 id 하고 환영인사" 담아서 view 에서 출력 >> register_welcome.jsp
		System.out.println("Do호출");
		//4.데이터 담기
		//5.뷰지정
		//6.뷰 forward

		//1. 한글
		request.setCharacterEncoding("UTF-8");
		//2. 데이터 받기  (입력데이터 , 판단데이터(command)
		//String command = request.getParameter("cmd");

		//Url 방식으로 요청 판단하기
		//http://192.168.0.46:8090/WebSite/list.do

		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String urlcommand = requestUri.substring(contextPath.length());

		System.out.println("requestUri : " + requestUri);
		System.out.println("contextPath : " + contextPath);
		System.out.println("urlcommand : " + urlcommand);
    	/*
    	requestUri  : /WebServlet_8_Member_Url/register.do
		contextPath : /WebServlet_8_Member_Url
		urlcommand  : /register.do
    	*/

		//3. 요청 서비스 판단 (command 통해서) 문자열 비교
		//3.1 판단에 의해서 서비스 동작 (DB작업 , 암호화 , ....)
		String viewpage = "";

		if (urlcommand.equals("/register.do")) {
			//회원가입 페이지(VIEW)
			//VIEW 만 전달
			viewpage = "/WEB-INF/views/register/register.jsp";

			//필요에 따라서 request 데이터 저장

		} else if (urlcommand.equals("/registerok.do")) {
			//회원가입 처리 (DB작업)
			//입력 데이터 >> DB 연결 >> insert >> 여부 > 처리
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
			viewpage = "/WEB-INF/views/register/register_welcome.jsp";
		} else if (urlcommand.equals("/login.do")) {
			//로그인 페이지(VIEW)
			//VIEW 만 전달
			viewpage = "/WEB-INF/views/login/login.jsp";

			//필요에 따라서 request 데이터 저장
		} else if (urlcommand.equals("/loginok.do")) {
			//로그인 처리 (DB작업)
			//입력 데이터 >> DB 연결 >> insert >> 여부 > 처리
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
			//뷰설정하기
			viewpage="/WEB-INF/views/login/login_complete.jsp";
		}else if (urlcommand.equals("/update.do")) {
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
			viewpage="/WEB-INF/views/service/update_complete.jsp";
		}else if (urlcommand.equals("/searchAll.do")) {

			EmpService empService = new EmpService();
			List<EmpDto> empDtoList = empService.searchAll();
			//4. 데이터 저장
			request.setAttribute("data", empDtoList);
			//뷰설정하기
			viewpage="/WEB-INF/views/service/memberlist.jsp";
		} else if (urlcommand.equals("/delete.do")) {

			EmpService empService = new EmpService();
			int empno = Integer.parseInt(request.getParameter("empno"));
			empService.deleteEmp(empno);
			//뷰설정하기
			viewpage="/default.html";
		}else if (urlcommand.equals("/searchbyname.do")) {
			//뷰설정하기
			viewpage="/WEB-INF/views/service/searchbyname.jsp";
		}
		else if (urlcommand.equals("/searchbynameOk.do")) {

			EmpService empService = new EmpService();
			String ename = request.getParameter("ename");
			List<EmpDto> empDtoList = empService.searchEmpByNameLike(ename);
			//4. 데이터 저장
			request.setAttribute("data", empDtoList);
			//뷰설정하기
			viewpage="/WEB-INF/views/service/memberlist.jsp";
		}
			//5. View 지정하기
			RequestDispatcher dis = request.getRequestDispatcher(viewpage);

			//6. View forward
			dis.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("겟 호출");
		doProcess(request, response);
		super.doGet(request, response);

	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		super.doPost(req, resp);
	}




}
