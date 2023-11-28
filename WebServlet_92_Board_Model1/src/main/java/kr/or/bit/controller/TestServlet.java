package kr.or.bit.controller;


import kr.or.bit.dto.Reply;
import kr.or.bit.service.BoardService;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        //한글처리
        request.setCharacterEncoding("UTF-8");
        //데이터 받기
        String idx= request.getParameter("idx");
        String writer = request.getParameter("reply_writer");
        String content = request.getParameter("reply_content");
        String pwd = request.getParameter("reply_pwd");
        //String idx_fk = request.getParameter("idx");
        String userid = "empty";
        //service 객체 생성
        BoardService service = BoardService.getInBoardService();
        //DB저장
        try {
            int result = service.replyWrite(Integer.parseInt(idx), writer, userid, content, pwd);
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
        //Async Await이 필요한가???
        //저장 -> 목록조회
        //JSON배열
        List<JSONObject> jsonList = new ArrayList<>();
        //덧글 목록 보여주기
        List<Reply> replylist = null; //참조하는 글번호
        JSONArray jsonArray = new JSONArray();
        try {
            replylist = service.replyList(idx);
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
        if(replylist != null && replylist.size() > 0) {
            for (Reply reply : replylist) {
                JSONObject jsonObject = new JSONObject(reply);
                //jsonList.add(jsonObject);
                jsonArray.put(jsonObject);
            }
        }
        System.out.println(jsonArray.toString());
        response.getWriter().write(jsonArray.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("TESTGET");


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TESTpost");
    }
}