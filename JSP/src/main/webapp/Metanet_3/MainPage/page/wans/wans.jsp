<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Metanet 3조</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="icon" href="../../bear.ico" type="image/x-icon">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- footer -->
    <link rel="stylesheet" href="../../../css/footer.css">
    <style>
        body {
            background-color: darkgray;
        }

        h1,
        h3 {
            color: bisque;
        }

        h2 {
            color: bisque;
            padding-left: 10%;
        }


        p {
            color: white;
        }

        th {
            color: rgb(78, 76, 76);
        }

        .table-font {
            font-size: large;
        }

        td {
            color: rgb(77, 76, 76);
            font-weight: bold;
        }

        .kor-font {
            font-family: 'Roboto', 'Noto Sans KR', sans-serif;
        }

        h1 {
            text-align: center;
            padding-top: 70px;
            padding-bottom: 50px;
        }

        .imageGrid {
            height: 200px;
        }

        .carousel-inner h2 {
            color: rgb(77, 76, 76);
        }
    </style>
</head>

<body>
<%-- NAVBAR--%>
<jsp:include page="../../../MainPage/module/nav.jsp"/>


    <div>
        <h1 style="text-align: center;">Hello, I'm WanSeoung!!</h1>
    </div>
    <hr>
    <div class="container text-center">

        <div class="row">

            <div class="col">
                <div class="table-responsive">

                    <table class="table table-bordered" style="background-color: rgb(185, 184, 184);">
                        <tbody class="table-font">
                        <tr>
                            <th scope="row">이름</th>
                            <td>김완승</td>
                        </tr>
                        <tr>
                            <th scope="row">생년월일</th>
                            <td>1997.10.27</td>
                        </tr>
                        <tr>
                            <th scope="row">거주지</th><br>
                            <td>경기도 화성시</td>
                        </tr>
                        <tr>
                            <th scope="row">전공</th><br>
                            <td>SW정보통신공학</td>
                        </tr>


                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col">
                <!-- <img src="wans_util\avatar2.jpg" class="img-fluid" alt="..."> -->
                <!-- <img src="wans_util\avatar2.jpg" class="img-thumbnail" alt="..."> -->
            </div>

        </div>
    </div>

    <br></br>





    <br>


    <div id="carouselExample" class="carousel slide mx-auto" style="height: 110%;">
        <div class="carousel-inner">

            <div class="carousel-item active">
                <h2>경기도 화성시 동탄</h2>
                <div class="container-sm">
                    <img src="wans_util\meta.jpg" class="img-thumbnail" alt="..." style="width: 60%;">
                </div>
            </div>
            <div class="carousel-item">
                <h2>취미</h2>
                <div class="container-sm">
                    <img src="https://cdn-icons-png.flaticon.com/512/4112/4112938.png"
                         class="img-thumbnail imageGrid" alt="...">

                    <img src="https://previews.123rf.com/images/vladvm/vladvm1506/vladvm150601590/41471316-%EB%B0%B0%EB%93%9C%EB%AF%BC%ED%84%B4-%EC%95%84%EC%9D%B4%EC%BD%98%EC%9E%85%EB%8B%88%EB%8B%A4-%EC%8A%A4%ED%8F%AC%EC%B8%A0-%EA%B8%B0%ED%98%B8%EC%9E%85%EB%8B%88%EB%8B%A4-%ED%8F%89%EB%A9%B4-%EB%B2%A1%ED%84%B0-%EC%9D%BC%EB%9F%AC%EC%8A%A4%ED%8A%B8-%EB%A0%88%EC%9D%B4-%EC%85%98.jpg"
                         class="img-thumbnail imageGrid" alt="...">

                    <img src="https://cdn-icons-png.flaticon.com/512/2727/2727244.png"
                         class="img-thumbnail imageGrid" alt="...">

                    <img src="https://previews.123rf.com/images/solargaria/solargaria1711/solargaria171100076/89618697-%EC%BB%B4%ED%93%A8%ED%84%B0-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%95%84%EC%9D%B4%EC%BD%98-%EA%B8%B0%EC%88%A0-%EA%B8%B0%ED%98%B8-%EA%B0%9C%EB%85%90%EC%97%90-%EB%8C%80-%ED%95%9C-%ED%9D%B0%EC%83%89-%EB%B0%B0%EA%B2%BD%EC%97%90-%EC%95%84%EC%9D%B4%EC%BD%94-%EB%8B%89-%EA%B8%B0%ED%98%B8-%EB%B2%A1%ED%84%B0-%EC%95%84%EC%9D%B4%EC%BD%94-%EB%8B%89.jpg"
                         class="img-thumbnail imageGrid" alt="...">

                    <img src="https://w7.pngwing.com/pngs/689/148/png-transparent-computer-icons-art-palette-drawing-painting-monochrome-hand-drawn-palette.png"
                         class="img-thumbnail imageGrid" alt="...">
                </div>
            </div>
            <div class="carousel-item">
                <h2></h2>
                <div class="container text-center">
                    <div class="row">
                        <div class="col">
                            <div class="container-sm">
                                <img src="wans_util\game1.png" class="img-thumbnail" alt="..."></img>
                            </div>
                        </div>
                        <div class="col">
                            <div class="container-sm">
                                <img src="wans_util\game2.png" class="img-thumbnail" alt="..."></img>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <h2></h2>
                <div class="container text-center" style="height: 60%;">
                    <div class="row">
                        <div class="col">
                            <div class="container-sm" style="height: 80%;">
                                <img src="wans_util\draw1.jpg" class="img-thumbnail" alt="..."
                                     style="height: 80%;"></img>
                            </div>
                        </div>
                        <div class="col">
                            <div class="container-sm" style="height: 80%;">
                                <img src="wans_util\draw2.jpg" class="img-thumbnail" alt="..."
                                     style="height: 80%;"></img>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <br><br><br><br>
    <div class="container mt-3" style="padding-right: 10%;">
        <div class="container p-5 my-5 text-white" style="background-color: rgb(77, 76, 76);">
            <h3 style="font-weight: bolder;">새로운 기술에 대한 도전정신과 활용능력을 지닌 백엔드 개발자</h3>
            <br>
            <p>빠르게 발전하는 IT트렌드에 맞춰 뒤쳐지지않고 지속적으로 성장하는 개발자가 되고 싶습니다. </p>
        </div>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
            integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
            crossorigin="anonymous"></script>

    <!-- <div class="mt-5 p-4 bg-dark text-white text-center">
        <p>Footer</p>


    </div> -->
<%--    Footer--%>
    <jsp:include page="../../../MainPage/module/footer.jsp"/>

</body>
</html>
<script>
    function imageGrid() {
    }
</script>
