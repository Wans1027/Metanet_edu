package kr.or.kosa.controller;

import kr.or.kosa.dao.RegisterDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.as")
public class AsyncServlet extends HttpServlet {
    public AsyncServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        /////
        req.setCharacterEncoding("UTF-8");
        System.out.println("호출됨!!!!");

        RegisterDao registerDao = new RegisterDao();
        int empno = Integer.parseInt(req.getParameter("empno"));
        System.out.println(empno);
        boolean alreadyExistEmpno = registerDao.isAlreadyExistEmpno(empno);
        System.out.println(alreadyExistEmpno);

        resp.setCharacterEncoding("utf-8");
        resp.setStatus(200);
        resp.getWriter().write("aaaa");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String jsonResponse;
        if (alreadyExistEmpno) {
            jsonResponse = "{\"isExist\": false}";
        } else {
            jsonResponse = "{\"isExist\": true}";
        }

        try (PrintWriter out = resp.getWriter()) {
            out.print(jsonResponse);
        }
    }
}
