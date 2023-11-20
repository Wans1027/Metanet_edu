<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>3조</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="icon" href="./bear.ico" type="image/x-icon">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@700&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- footer -->
    <link rel="stylesheet" href="../css/footer.css">
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
            /*background-image: url("/w3images/mac.jpg");*/
            min-height: 100%;
            width: 30%;
        }

        .w3-bar .w3-button {
            padding: 16px;
        }

        @font-face {
            font-family: 'NPSfontBold';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2310@1.0/NPSfontBold.woff2') format('woff2');
            font-weight: 800;
            font-style: normal;
        }

        /* img#woody5 {
          position: relative;
          z-index: 1;
          max-width: 100%;
          height: auto;
          margin-top: -20px;
          margin-left: -20px;
        }

        h1.w3-center {
          position: relative;
          z-index: 2;
        } */
    </style>
</head>

<body>
<%--NAVBAR--%>
<jsp:include page="/Metanet_3/MainPage/module/nav.jsp"></jsp:include>

<!-- Team Section -->
<div class="container tex-center" style="padding:128px 16px" id="team">
    <h1 class="w3-center" style="font-size: 70px; font-family:'NPSfontBold'; color: #7d542a;">
        <img id="woody5"
             src="https://github.com/KHaeWon/MetanetWebBasic/assets/127920368/e2147a8f-112b-4922-bfcc-c0897b4170c0"
             style="width: 60px;height: auto;">
        Metanet 3조
    </h1>
    <div class="w3-row-padding row" style="margin-top:64px">
        <div class="col">
            <div>
                <a href="./page/wans/wans.jsp"><img
                        src="https://github.com/JINHEEWON/metanet_study_3/assets/110229966/2834e62c-1f7a-49c8-bcf1-7eb4c40a350d"
                        alt="John" style="width:100%"></a>
                <div class="w3-container">
                    <h3 style="font-family:'NPSfontBold';">김완승</h3>
                    <p class="w3-opacity"
                       style="color: #7d542a; font-size: 20px; font-weight: bold; font-family:'NPSfontBold';"><img
                            src="">ISFJ</p>
                    <p class="w3-opacity"><img src="https://mizutaniyuji.github.io/my_portfolio/image/github.jpg"
                                               style="width: 10%; margin-right: 3%;"><a href="https://github.com/Wans1027" target="_blank">github</a>
                    </p>
                </div>
            </div>
        </div>
        <div class="col">
            <a href="./page/HongSeongCheol/index.html"><img
                    src="https://github-production-user-asset-6210df.s3.amazonaws.com/76652929/283404159-fa67dd55-0882-471a-96cb-9dc41d859aa9.jpg"
                    alt="John" style="width:100%"></a>
            <div class="w3-container">
                <h3 style="font-family:'NPSfontBold';">홍성철</h3>
                <p class="w3-opacity"
                   style="color: #7d542a; font-size: 20px; font-weight: bold; font-family:'NPSfontBold';"><img
                        src="">INFJ
                </p>
                <p class="w3-opacity"><img src="https://mizutaniyuji.github.io/my_portfolio/image/github.jpg"
                                           style="width: 10%; margin-right: 3%;"><a href="https://github.com/godo129" target="_blank">github</a></p>
            </div>
        </div>

        <div class="col">
            <a href="./page/heewon/heewon.jsp"><img
                    src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/801beaa0-2e9a-46a0-a583-a2ea8b7e33de"
                    alt="John" style="width:100%"></a>
            <div class="w3-container">
                <h3 style="font-family:'NPSfontBold';">진희원</h3>
                <p class="w3-opacity"
                   style="color: #7d542a; font-size: 20px; font-weight: bold; font-family:'NPSfontBold';"><img
                        src="">INFJ
                </p>
                <p class="w3-opacity"><img src="https://mizutaniyuji.github.io/my_portfolio/image/github.jpg"
                                           style="width: 10%; margin-right: 3%;"><a href="https://github.com/JINHEEWON" target="_blank">github</a>
                </p>
            </div>
        </div>
        <div class="col">
            <a href="./page/jangwon.html"><img
                    src="https://github.com/yjjjwww/introduce/assets/100079037/570e4a18-625a-4b55-b1ea-e88b6a1afece" alt="John"
                    style="width:100%"></a>
            <div class="w3-container">
                <h3 style="font-family:'NPSfontBold';">윤장원</h3>
                <p class="w3-opacity"
                   style="color: #7d542a; font-size: 20px; font-weight: bold; font-family:'NPSfontBold';"><img
                        src="">INTJ
                </p>
                <p class="w3-opacity"><img src="https://mizutaniyuji.github.io/my_portfolio/image/github.jpg"
                                           style="width: 10%; margin-right: 3%;"><a href="https://github.com/yjjjwww" target="_blank">github</a></p>
            </div>
        </div>
        <div class="col">
            <a href="./page/haewon/VillaAgency-1.0.0/haewon.jsp"><img
                    src="https://github.com/JINHEEWON/metanet_study_3/assets/127920368/dd7f2eff-d63d-4f92-bbc0-ab8c8dd76862"
                    alt="John" style="width:100%"></a>
            <div class="w3-container">
                <h3 style="font-family:'NPSfontBold';">김혜원</h3>
                <p class="w3-opacity"
                   style="color: #7d542a; font-size: 20px; font-weight: bold; font-family:'NPSfontBold';"><img
                        src="">ISFP
                </p>
                <p class="w3-opacity"><img src="https://mizutaniyuji.github.io/my_portfolio/image/github.jpg"
                                           style="width: 10%; margin-right: 3%;"><a href="https://github.com/KHaeWon" target="_blank">github</a></p>
            </div>
        </div>
    </div>
</div>
<%--FOOTER--%>
<jsp:include page="/Metanet_3/MainPage/module/footer.jsp"/>

</body>

</html>
