<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>공지사항</title>
    <link rel="stylesheet" href="../css/css.css" />
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body,
        html {
            height: 100%;
            line-height: 1.8;
        }

        body {
            background-color: papayawhip;
        }

        /* Full height image header */
        .bgimg-1 {
            background-position: center;
            background-size: cover;
            background-image: url("/w3images/mac.jpg");
            min-height: 100%;
            width: 30%;
        }

        .w3-bar .w3-button {
            padding: 16px;
        }

        a {
            color: black;
            text-decoration-line: none;
        }
    </style>
</head>

<body>
<%--NAVBAR--%>
<jsp:include page="/Metanet_3/MainPage/module/nav.jsp"></jsp:include>

<div class="board_wrap">
    <div class="board_title">
        <strong>게시판</strong>
    </div>
    <div class="board_list_wrap">
        <div class="board_list">
            <div class="top">
                <div class="num">번호</div>
                <div class="title">제목</div>
                <div class="writer">글쓴이</div>
                <div class="date">작성일</div>
            </div>
            <div>
                <div class="num">5</div>
                <div class="title">
                    <a href="#">글1</a>
                </div>
                <div class="writer">A</div>
                <div class="date">2021.1.15</div>
            </div>
            <div>
                <div class="num">4</div>
                <div class="title">
                    <a href="#">글2</a>
                </div>
                <div class="writer">B</div>
                <div class="date">2021.1.15</div>
            </div>
            <div>
                <div class="num">3</div>
                <div class="title">
                    <a href="#">글3</a>
                </div>
                <div class="writer">C</div>
                <div class="date">2021.1.15</div>
            </div>
            <div>
                <div class="num">2</div>
                <div class="title">
                    <a href="#">글4</a>
                </div>
                <div class="writer">D</div>
                <div class="date">2021.1.15</div>
            </div>
            <div>
                <div class="num">1</div>
                <div class="title">
                    <a href="#">글5</a>
                </div>
                <div class="writer">E</div>
                <div class="date">2021.1.15</div>
            </div>
        </div>
        <div class="board_page">
            <a href="#" class="bt first"> &lt;&lt; </a>
            <a href="#" class="bt prev">&lt;</a>
            <a href="#" class="num on">1</a>
            <a href="#" class="num">2</a>
            <a href="#" class="num">3</a>
            <a href="#" class="num">4</a>
            <a href="#" class="num">5</a>
            <a href="#" class="bt next">&gt;</a>
            <a href="#" class="bt last">&gt;&gt;</a>
        </div>
        <div class="bt_wrap">
            <a href="#" class="on">등록</a>
            <!--<a href="#">수정</a>-->
        </div>
    </div>
</div>
</body>

</html>

