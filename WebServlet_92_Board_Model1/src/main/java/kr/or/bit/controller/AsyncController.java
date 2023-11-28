package kr.or.bit.controller;

import kr.or.bit.dto.Reply;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

@WebServlet("/asyn")
public class AsyncController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public AsyncController() {
        super();
    }
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("application/json");
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("UTF-8");

        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        JSONObject replyObj = new JSONObject(new Reply(4,"test","test","test","test",date,1));
        System.out.println(replyObj.toString());
        response.getWriter().write(replyObj.toString());
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
