package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.BoardDao;
import kr.or.bit.dto.Board;

public class BoardEditService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		ActionForward forward = new ActionForward();
		if(idx == null || idx.trim().equals("")){
			forward.setRedirect(true);
			forward.setPath("/WEB-INF/views/board/board_list.jsp");
			
			return forward;
		}
		BoardDao dao;
		try {
			dao = new BoardDao();
			Board board = dao.getEditContent(idx);
			request.setAttribute("board", board);
		} catch (Exception e) {
			e.printStackTrace();
		}

		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/board/board_edit.jsp");
		return forward;
	}

}
