package kr.or.kosa.service;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dto.EmpDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class SearchAllAction implements Action {

    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
        EmpService empService = new EmpService();
        List<EmpDto> empDtoList = empService.searchAll();
        //4. 데이터 저장
        request.setAttribute("data", empDtoList);
        //뷰설정하기
        String viewpage="/WEB-INF/views/service/memberlist.jsp";
        ActionForward forward = new ActionForward();
        forward.setRedirect(false); //forward 방식
        forward.setPath(viewpage);

        return forward;
    }
}
