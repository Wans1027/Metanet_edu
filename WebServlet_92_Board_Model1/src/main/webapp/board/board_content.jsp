<%@page import="kr.or.bit.dto.Reply"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.bit.dto.Board"%>
<%@page import="kr.or.bit.service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board_content</title>
	<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<link rel="Stylesheet"
	href="<%=request.getContextPath()%>/style/default.css" />
</head>
<body>
	<%
		String idx= request.getParameter("idx"); //글번호 받기
		
		//글 번호를 가지고 오지  않았을 경우 예외처리
		if(idx == null || idx.trim().equals("")){
			response.sendRedirect("board_list.jsp");
			return; //더 이상 아래 코드가 실행되지 않고 클라이언트에게 바로 코드 전달
		}
		
		idx=idx.trim();
		//http://192.168.0.12:8090/WebServlet_5_Board_Model1_Sample/board/board_content.jsp?idx=19&cp=1&ps=5
		//board_content.jsp?idx=19&cp=1&ps=5  //다시 목록으로 갔을때  ... cp , ps 가지고 ...
		//why: 목록으로 이동시 현재 page 유지하고 싶어요
		String cpage = request.getParameter("cp"); //current page
		String pagesize = request.getParameter("ps"); //pagesize
		
		//List 페이지 처음 호출 ...
		if(cpage == null || cpage.trim().equals("")){
			//default 값 설정
			cpage = "1"; 
		}
	
		if(pagesize == null || pagesize.trim().equals("")){
			//default 값 설정
			pagesize = "5"; 
		}
		
		//상세보기 내용
		BoardService service = BoardService.getInBoardService();
		
		//옵션
		//조회수 증가
		boolean isread = service.addReadNum(idx);
		if(isread)System.out.println("조회증가 : " + isread);
		
		
		//데이터 조회 (1건 (row))
		Board board = service.content(Integer.parseInt(idx));
	
	%>
	<%
		pageContext.include("/include/header.jsp");
	%>
	<div id="pageContainer">
		<div style="padding-top: 30px; text-align: center">
			<center>
				<b>게시판 글내용</b>
				<table width="80%" border="1">
					<tr>
						<td width="20%" align="center"><b> 글번호 </b></td>
						<td width="30%"><%=idx%></td>
						<td width="20%" align="center"><b>작성일</b></td>
						<td><%=board.getWritedate()%></td>
					</tr>
					<tr>
						<td width="20%" align="center"><b>글쓴이</b></td>
						<td width="30%"><%=board.getWriter()%></td>
						<td width="20%" align="center"><b>조회수</b></td>
						<td><%=board.getReadnum()%></td>
					</tr>
					<tr>
						<td width="20%" align="center"><b>홈페이지</b></td>
						<td><%=board.getHomepage()%></td>
						<td width="20%" align="center"><b>첨부파일</b></td>
						<td><%=board.getFilename()%></td>
					</tr>
					<tr>
						<td width="20%" align="center"><b>제목</b></td>
						<td colspan="3"><%=board.getSubject()%></td>
					</tr>
					<tr height="100">
						<td width="20%" align="center"><b>글내용</b></td>
						<td colspan="3">
							<%
								String content = board.getContent();
								if(content != null){
									content = content.replace("\n", "<br>");
								}
								out.print(content);
							%>

						</td>
					</tr>
					<tr>
						<td colspan="4" align="center">
						<a href="board_list.jsp?cp=<%=cpage%>&ps=<%=pagesize%>">목록가기</a> |
						<a href="board_edit.jsp?idx=<%=idx%>&cp=<%=cpage%>&ps=<%=pagesize%>">편집</a>	|
						<a href="board_delete.jsp?idx=<%=idx%>&cp=<%=cpage%>&ps=<%=pagesize%>">삭제</a> |
						<a href="board_rewrite.jsp?idx=<%=idx%>&cp=<%=cpage%>&ps=<%=pagesize%>&subject=<%=board.getSubject()%>">답글</a>
						</td>
					</tr>
				</table>
				<!--  꼬리글 달기 테이블 -->
<%--				"board_replyok.jsp"--%>
<%--				'${pageContext.request.contextPath}/YourServletURL'--%>
				<form name="reply">
						<!-- hidden 태그  값을 숨겨서 처리  -->
						<input type="hidden" name="idx" value="<%=idx%>"> 
						<input type="hidden" name="userid" value=""><!-- 추후 필요에 따라  -->
						<!-- hidden data -->
						<table width="80%" border="1">
							<tr>
								<th colspan="2">덧글 쓰기</th>
							</tr>
							<tr>
								<td align="left">작성자 :
								 	<input type="text" name="reply_writer" ><br />
								 	내&nbsp;&nbsp;용 : 
								 	<textarea name="reply_content"  rows="2" cols="50"></textarea>
								</td>
								<td align="left">
									비밀번호:
									<input type="password" name="reply_pwd" size="4">
									<input type="button" value="등록" onclick="reply_check()">
								</td>
							</tr>
						</table>
				</form>
				<!-- 유효성 체크	 -->
				<script type="text/javascript">
					$(function () {
						getCommentListAsync();
					});
					function getCommentListAsync() {
						const urlParams = new URL(location.href).searchParams;
						let idx = urlParams.get("idx");

						$.ajax({
							url: "${pageContext.request.contextPath}/WriteReplyServlet?idx=" + idx, // 여기에 서블릿 URL을 입력하세요.
							type: 'GET', // 또는 'POST' 등 요청 메서드를 선택합니다.
							dataType: "json",
							success: function (data) {

								$.each(data, function (index, obj) {
									addComment(obj.writer, obj.content, obj.writedate, obj.no, obj.idx_fk);
								});
							},
							error: function (xhr, status, error) {
								// 오류가 발생한 경우 처리합니다.
								alert("덧글불러오기에 실패했습니다.");
							}
						});
					}
					function reply_check() {
						var frm = document.reply;
						if (frm.reply_writer.value == "" || frm.reply_content.value == ""
							|| frm.reply_pwd.value == "") {
									alert("리플 내용, 작성자, 비밀번호를 모두 입력해야합니다.");
							return false;
						}
						resetTable();
						const urlParams = new URL(location.href).searchParams;
						let p = {"idx": urlParams.get("idx"),"reply_writer": frm.reply_writer.value,"reply_content": frm.reply_content.value, "reply_pwd": frm.reply_pwd.value};
						$.ajax({
							url: "${pageContext.request.contextPath}/WriteReplyServlet", // 여기에 서블릿 URL을 입력하세요.
							type: "POST", // 또는 'POST' 등 요청 메서드를 선택합니다.
							data: p,
							dataType: "json",
							success: function(data) {

								$.each(data, function (index, obj) {
									addComment(obj.writer, obj.content, obj.writedate, obj.no, obj.idx_fk);
								});
							},
							error: function(xhr, status, error) {
								// 오류가 발생한 경우 처리합니다.
								alert("덧글입력에 실패했습니다.")
							}
						});
						frm.submit();
					}
					function resetTable() {
						$("#dynamicComments").empty();

					}
					function reply_del(frm) {
						// alert("del");
						// var frm = document.replyDel;
						// alert(frm);
						if (frm.delPwd.value == "") {
							alert("비밀번호를 입력하세요");
							frm.delPwd.focus();
							return false;
						}

						const urlParams = new URL(location.href).searchParams;
						let p = {"idx": urlParams.get("idx"),"no": frm.no.value,"delPwd": frm.delPwd.value};
						$.ajax({
							url: "${pageContext.request.contextPath}/DelReplyServlet", // 여기에 서블릿 URL을 입력하세요.
							type: "POST", // 또는 'POST' 등 요청 메서드를 선택합니다.
							data: p,
							// dataType: "json",
							success: function(data) {
								resetTable();
								// $.each(data, function (index, obj) {
								// 	addComment(obj.writer, obj.content, obj.writedate, obj.no, obj.idx_fk);
								// });
								getCommentListAsync();
							},
							error: function(xhr, status, error) {
								// 오류가 발생한 경우 처리합니다.
								alert('덧글삭제에 실패했습니다.');
								resetTable();
								getCommentListAsync();
							}
						});

						//frm.submit();
					}
					///////////////////////////////
					function addComment(writer, content, writedate, no, idx_fk) {
						// 동적으로 댓글 행을 생성하고 추가
						var dynamicCommentsContainer = $("#dynamicComments");

						var newRow = $("<tr>").attr("align", "left");

						var newCell1 = $("<td>").attr("width", "80%").html("[" + writer + "]" + ":" + content + "<br>작성일:" + writedate);

						var newCell2 = $("<td>").attr("width", "20%");
						var deleteForm = $("<form>").attr({
							action: "boardreply_deleteOk.jsp",
							method: "POST",
							name: "replyDel"
						});

						var hiddenNo = $("<input>").attr({
							type: "hidden",
							name: "no",
							value: no // 새로운 댓글의 번호 (필요에 따라 수정)
						});
						deleteForm.append(hiddenNo);

						var hiddenIdx = $("<input>").attr({
							type: "hidden",
							name: "idx",
							value: idx_fk // 게시글의 번호 (필요에 따라 수정)
						});
						deleteForm.append(hiddenIdx);

						var passwordInput = $("<input>").attr({
							type: "password",
							name: "delPwd",
							size: "4"
						});

						// "password:" 라벨 추가
						var passwordLabel = $("<label>").html("password:");
						deleteForm.append(passwordLabel);

						deleteForm.append(passwordInput);

						var deleteButton = $("<input>").attr({
							type: "button",
							value: "삭제"
						}).click(function() {
							reply_del(this.form);
						});
						deleteForm.append(deleteButton);

						newCell2.append(deleteForm);

						newRow.append(newCell1, newCell2);
						dynamicCommentsContainer.append(newRow);
					}

				</script>
				<br>
				<!-- 꼬리글 목록 테이블 -->

				<table width="80%" border="1" >
					<tr>
						<th colspan="2">REPLY LIST</th>
					</tr>
					<tbody id="dynamicComments">

					</tbody>
				</table>

			</center>
			<div id="response"></div>
		</div>
	</div>
</body>
</html>





