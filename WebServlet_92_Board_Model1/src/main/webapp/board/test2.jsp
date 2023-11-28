<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
    <title>댓글 동적 생성 예제</title>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
</head>
<body>

<table>
    <!-- 기존 댓글 행 -->
    <tr align="left">
        <td width="80%">
            [댓글 작성자] : 댓글 내용
            <br> 작성일: 2023-11-27
        </td>
        <td width="20%">
            <form action="boardreply_deleteOk.jsp" method="POST" name="replyDel">
                <input type="hidden" name="no" value="1">
                <input type="hidden" name="idx" value="1">
                password :<input type="password" name="delPwd" size="4">
                <input type="button" value="삭제" onclick="reply_del(this.form)">
            </form>
        </td>
    </tr>

    <!-- 동적으로 생성될 댓글 행을 담을 공간 -->
    <tbody id="dynamicComments"></tbody>

    <!-- 동적으로 댓글을 추가하는 버튼 -->
    <tr>
        <td colspan="2">
            <button onclick="addComment()">댓글 추가</button>
        </td>
    </tr>
</table>

<script>
    $(document).ready(function() {
        // 서블릿에 Ajax 요청을 보냅니다.
        $.ajax({
            url: "${pageContext.request.contextPath}/YourServletURL", // 여기에 서블릿 URL을 입력하세요.
            type: 'GET', // 또는 'POST' 등 요청 메서드를 선택합니다.
            dataType: "json",
            success: function(data) {
                // 서블릿에서 받은 응답을 처리합니다.
                //$('#response').html(data);
                $.each(data, function (index, obj) {
                    //$('#response').append(obj.writedate + "<br>");
                    addComment(obj.writedate);
                });
            },
            error: function(xhr, status, error) {
                // 오류가 발생한 경우 처리합니다.
                console.error('Error:', status, error);
            }
        });
    });
    function addComment(writer) {
        // 동적으로 댓글 행을 생성하고 추가
        var dynamicCommentsContainer = document.getElementById("dynamicComments");

        var newRow = document.createElement("tr");
        newRow.align = "left";

        var newCell1 = document.createElement("td");
        newCell1.width = "80%";
        newCell1.textContent = "[" + writer + "]"+ ": 새로운 댓글 내용<br>작성일:" + getCurrentDate();

        var newCell2 = document.createElement("td");
        newCell2.width = "20%";
        var deleteForm = document.createElement("form");
        deleteForm.action = "boardreply_deleteOk.jsp";
        deleteForm.method = "POST";
        deleteForm.name = "replyDel";

        var hiddenNo = document.createElement("input");
        hiddenNo.type = "hidden";
        hiddenNo.name = "no";
        hiddenNo.value = "2"; // 새로운 댓글의 번호
        deleteForm.appendChild(hiddenNo);

        var hiddenIdx = document.createElement("input");
        hiddenIdx.type = "hidden";
        hiddenIdx.name = "idx";
        hiddenIdx.value = "1"; // 게시글의 번호
        deleteForm.appendChild(hiddenIdx);

        var passwordInput = document.createElement("input");
        passwordInput.type = "password";
        passwordInput.name = "delPwd";
        passwordInput.size = "4";
        deleteForm.appendChild(passwordInput);

        var deleteButton = document.createElement("input");
        deleteButton.type = "button";
        deleteButton.value = "삭제";
        deleteButton.onclick = function() {
            reply_del(deleteForm);
        };
        deleteForm.appendChild(deleteButton);

        newCell2.appendChild(deleteForm);

        newRow.appendChild(newCell1);
        newRow.appendChild(newCell2);

        dynamicCommentsContainer.appendChild(newRow);
    }

    function getCurrentDate() {
        var currentDate = new Date();
        var year = currentDate.getFullYear();
        var month = (currentDate.getMonth() + 1).toString().padStart(2, '0');
        var day = currentDate.getDate().toString().padStart(2, '0');
        return year + '-' + month + '-' + day;
    }

    function reply_del(form) {
        // 댓글 삭제 로직을 여기에 추가
        console.log("댓글 삭제: " + form.no.value);
        // 실제로 서버로 요청을 보내거나 필요한 동작을 수행
    }
</script>

</body>
</html>
