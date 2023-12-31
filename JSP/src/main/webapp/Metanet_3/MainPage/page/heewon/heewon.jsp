<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with Meyawo landing page.">
    <meta name="author" content="Devcrud">
    <title>희원</title>
    <!-- font icons -->
    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <!-- Bootstrap + Meyawo main styles -->
    <link rel="stylesheet" href="assets/css/meyawo.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" >
    <link rel="icon" href="../../bear.ico" type="image/x-icon">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <!-- footer -->
    <link rel="stylesheet" href="../../../css/footer.css">

    <style>
        @font-face {
            font-family: 'NPSfontBold';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2310@1.0/NPSfontBold.woff2') format('woff2');
            font-weight: 800;
            font-style: normal;
        }

        .header-title, .section-title, .subtitle{
            font-family:'NPSfontBold';
            color: #7d542a;
        }

        .img_cap{
            font-family:'NPSfontBold';
            color: #7d542a;
            font-size: 20px;
        }

        .poster {
            position: relative;
            width: 200px;
            height: 250px;
            border-radius: 10px;
            background-color: papayawhip;
            animation: poster-ani 2s infinite linear alternate;
            transform-style: preserve-3d;
        }

        @keyframes poster-ani {
            0% {
                transform: rotateY(-20deg);
            }
            100%{
                transform: rotateY(20deg);
            }
        }

        .poster-title {
            padding: 0.2em 0;
            font-size: 1.5rem;
            font-family: NPSfontBold;
            top: 5%;
            left: 37%;
            position: absolute;
            transform: translateZ(20px);
        }

        .poster-caption {
            position: absolute;
            text-align: center;
            left: 42%;
            bottom: 0%;
            font-family: NPSfontBold;
            transform: translateZ(20px);
            color:#449638;
        }

        .poster-img {
            position: absolute;
            left: 17%;
            top: 22%;
            transform: translateZ(30px);
        }

        .world {
            margin: 20px;
            perspective: 500px;
        }

        .w3-center {
            padding: 30px;
        }


    </style>
</head>

<%--<div data-spy="scroll" data-target=".navbar" data-offset="40" id="home">--%>
    <!--네비게이션바-->
    <jsp:include page="../../../MainPage/module/nav.jsp"/>

    <!-- 이미지(캐러셀) -->
    <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel" style="height: 900px;">
        <div class="carousel-inner" style="height: 100%;">
            <div class="carousel-item active" style="height: 100%;">
                <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/c76437da-fd94-447a-b01c-2f229a7b370b" class="d-block w-100" alt="..." style="width: 100%;  height: 100%; object-fit:cover;">
            </div>
            <div class="carousel-item" style="height: 100%;">
                <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/c80e6353-2ee2-420e-9b47-8ac161d14d98" class="d-block w-100" alt="..." style="width: 100%; height: 100%; object-fit:cover;">
            </div>
            <div class="carousel-item" style="height: 100%;">
                <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/0fcdce43-08f3-4975-b3f2-0c16c071fe1e" class="d-block w-100" alt="..." style="width: 100%; height: 100%; object-fit:cover;">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>


    <!-- page header -->
    <header id="home" class="header">
        <div class="overlay"></div>
        <div class="header-content container">
            <h1 class="header-title">
                <span class="up">HI!</span>
                <span class="down">I am Heewon</span>
            </h1>

            <button class="btn btn-primary" onclick="location.href='https://github.com/JINHEEWON'"; >Visit My Works</button>
        </div>
    </header><!-- end of page header -->


    <!-- about section -->
    <section class="section pt-0" id="about">
        <!-- container -->
        <div class="container text-center">
            <!-- about wrapper -->
            <div class="about">
                <div class="about-img-holder">
                    <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/dfc81db8-69b9-401b-b799-f2bb3f5edd2b" class="about-img"
                         alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page">
                </div>
                <div class="about-caption">
                    <p class="section-subtitle">Who Am I ?</p>
                    <h2 class="section-title mb-3">About Me</h2>
                    <p>
                        안녕하세요 저는 진희원입니다.
                        <br>컴퓨터공학과 졸업 후 취업준비중입니다
                    </p>
                </div>
                <div class="world">
                    <div class="poster">
                        <h1 class="poster-title">Mbti</h1>
                        <figure class="poster-img">
                            <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/33059e89-011e-4cb6-8462-c8bec7cfe8ec" class="about-img" style=" max-width: 80%;"
                                 alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page">
                        </figure>
                        <p class="poster-caption">INFJ</p>
                    </div>
                </div>
            </div><!-- end of about wrapper -->
        </div><!-- end of container -->
    </section> <!-- end of about section -->



    <!-- portfolio section -->
    <section class="section" id="portfolio">
        <div class="container text-center">
            <p class="section-subtitle">What I Like ?</p>
            <h6 class="section-title mb-6">Favorite</h6>

            <!-- row -->
            <div class="row">
                <div class="col-md-4">
                    <div class="portfolio-card" style="height: 100%;" onclick="document.getElementById('img01').style.display='block'">
                        <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/e3c2752c-dc5b-4694-8b26-e2ffafee4c55" class="portfolio-card-img" style="height: 100%;"
                             alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page" >
                        <span class="portfolio-card-overlay">
                            <span class="portfolio-card-caption">

                            </span>
                        </span>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="portfolio-card" style="height: 100%;" onclick="document.getElementById('img02').style.display='block'">
                        <img class="portfolio-card-img" src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/5fa16594-1693-492a-956c-70a7b88b973b" class="img-responsive rounded" style="height: 100%;"
                             alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page">
                        <span class="portfolio-card-overlay">
                            <span class="portfolio-card-caption">
                            </span>
                        </span>
                    </div>
                </div>
                <div class="col-md-4">
                    <div href="#" class="portfolio-card" style="height: 100%;" onclick="document.getElementById('img03').style.display='block'">
                        <img class="portfolio-card-img" src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/91a807f9-5c22-4acb-83c0-0cc852bd393a" class="img-responsive rounded" style="height: 100%;"
                             alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page">
                        <span class="portfolio-card-overlay">
                            <span class="portfolio-card-caption">

                            </span>
                        </span>
                    </div>
                </div>
            </div><!-- end of row -->

        </div><!-- end of container -->
    </section> <!-- end of portfolio section -->

    <!--모달-->
    <div class="w3-container">
        <div id="img01" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                <div class="w3-center">
              <span onclick="document.getElementById('img01').style.display='none'"
                    class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <p class="img_cap">콩이</p>
                    <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/e3c2752c-dc5b-4694-8b26-e2ffafee4c55" alt="Avatar" style="width:100%" class="w3-circle w3-margin-top">
                </div>

            </div>
        </div>
    </div>

    <div class="w3-container">
        <div id="img02" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                <div class="w3-center">
              <span onclick="document.getElementById('img02').style.display='none'"
                    class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <p class="img_cap">그림</p>
                    <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/5fa16594-1693-492a-956c-70a7b88b973b" alt="Avatar" style="width:100%" class="w3-circle w3-margin-top">
                </div>

            </div>
        </div>
    </div>

    <div class="w3-container">
        <div id="img03" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                <div class="w3-center">
              <span onclick="document.getElementById('img03').style.display='none'"
                    class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <p class="img_cap">테니스</p>
                    <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/91a807f9-5c22-4acb-83c0-0cc852bd393a" alt="Avatar" style="width:100%" class="w3-circle w3-margin-top">
                </div>

            </div>
        </div>
    </div>


    <!-- service section -->
    <section class="section" id="service">
        <div class="container text-center">
            <p class="section-subtitle">What I Want ?</p>
            <h6 class="section-title mb-6">Goal</h6>
            <!-- row -->
            <div class="row">
                <div class="col-md-6 col-lg-3">
                    <div class="service-card">
                        <div class="body">
                            <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/613211b7-aeb5-4d4d-b4d5-1229d29cb7e1"
                                 alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page"
                                 class="icon">
                            <h6 class="title">Property</h6>
                            <p class="subtitle" style="left:35%;">아파트 구입</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="service-card">
                        <div class="body">
                            <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/66ea50a7-ca0b-4fab-b2a1-19dcbc5f195e"
                                 alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page"
                                 class="icon">
                            <h6 class="title">Career</h6>
                            <p class="subtitle" style="left:35%;">좋은 개발자</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="service-card">
                        <div class="body">
                            <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/a2a1a4c4-9deb-47a8-975f-bf026a76b864"
                                 alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page"
                                 class="icon">
                            <h6 class="title">Family</h6>
                            <p class="subtitle" style="left:32%;">강아지 & 고양이</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-lg-3">
                    <div class="service-card">
                        <div class="body">
                            <img src="https://github.com/JINHEEWON/metanet_study_3/assets/35156107/bd3c79cc-15b3-4935-ae1d-5ea49fefb46c"
                                 alt="Download free bootstrap 4 landing page, free boootstrap 4 templates, Download free bootstrap 4.1 landing page, free boootstrap 4.1.1 templates, meyawo Landing page"
                                 class="icon">
                            <h6 class="title">Life</h6>
                            <p class="subtitle" style="left:40%;">봉사하기</p>
                        </div>
                    </div>
                </div>
            </div><!-- end of row -->
        </div>
    </section><!-- end of service section -->

    <!-- footer -->

    <jsp:include page="../../../MainPage/module/footer.jsp"/>

    <!-- core  -->
    <script src="assets/vendors/jquery/jquery-3.4.1.js"></script>
    <script src="assets/vendors/bootstrap/bootstrap.bundle.js"></script>

    <!-- bootstrap 3 affix -->
    <script src="assets/vendors/bootstrap/bootstrap.affix.js"></script>

    <!-- Meyawo js -->
    <script src="assets/js/meyawo.js"></script>

    </body>

</html>
