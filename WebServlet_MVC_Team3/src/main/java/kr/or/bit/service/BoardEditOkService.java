package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.BoardDao;

public class BoardEditOkService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		
		try {
			request.setCharacterEncoding("UTF-8");
			  String idx = request.getParameter("idx");
			  
			  BoardDao dao = new BoardDao();
			  int result = dao.boardEdit(request);
			  
				String msg="";
				String url="";
				if(result > 0){
					msg="edit success";
					url="/WebServlet_92_Board_Model1/board_list.meta";
				}else{
					msg="edit fail";
					url="/WebServlet_92_Board_Model1/board_edit.meta?idx="+idx;
				}
				
				request.setAttribute("board_msg",msg);
				request.setAttribute("board_url",url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/board/redirect.jsp");
		
		return forward;
	}

}
