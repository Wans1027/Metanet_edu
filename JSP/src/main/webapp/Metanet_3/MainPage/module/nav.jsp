<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="main_page.jsp">3조</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="board.jsp">게시판</a>
                    </li>
                </ul>
            </div>
            <!--Login-->
            <div class="w3-container">
                <button style="float: right;" onclick="document.getElementById('id01').style.display='block'"
                        class="w3-button w3-large">Login</button>
                <button style="float: right;" onclick="document.getElementById('id02').style.display='block'"
                        class="w3-button w3-large">Register</button>

                <div id="id01" class="w3-modal">
                    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                        <div class="w3-center"><br>
                            <span onclick="document.getElementById('id01').style.display='none'"
                                  class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                        </div>

                        <form class="w3-container" action="/action_page.php">
                            <div class="w3-section">
                                <label><b>Username</b></label>
                                <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username"
                                       name="usrname" required>
                                <label><b>Password</b></label>
                                <input class="w3-input w3-border" type="text" placeholder="Enter Password" name="psw" required>
                                <button class="w3-button w3-block w3-section w3-padding" type="submit">Login</button>
                                <input class="w3-check w3-margin-top" type="checkbox" checked="checked"> Remember me
                            </div>
                        </form>

                        <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                            <button onclick="document.getElementById('id01').style.display='none'" type="button"
                                    class="w3-button">Cancel</button>
                            <span class="w3-right w3-padding w3-hide-small">Forgot <a href="#">password?</a></span>
                        </div>

                    </div>
                </div>
            </div>

            <!--Register-->
            <div class="w3-container">
                <div id="id02" class="w3-modal">
                    <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                        <div class="w3-center"><br>
                            <span onclick="document.getElementById('id02').style.display='none'"
                                  class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                        </div>

                        <form class="w3-container" action="/action_page.php">
                            <div class="w3-section">
                                <label><b>Username</b></label>
                                <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username"
                                       name="usrname" required>
                                <label><b>Password</b></label>
                                <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Password" name="psw"
                                       required>
                                <label><b>Password check</b></label>
                                <input class="w3-input w3-border" type="text" placeholder="Enter Password" name="psw" required>
                                <button class="w3-button w3-block w3-section w3-padding" type="submit">Register</button>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </nav>
</div>
