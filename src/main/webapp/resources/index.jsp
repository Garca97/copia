<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap-3.3.0/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">       
        <script src="bootstrap-3.3.0/dist/js/bootstrap.min.js"></script>
        <script src="js/myscript.js"></script>
        <script src="js/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/styles.css" media="screen" />
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <img class="profile-img-card" src="http://keperawatan.unja.ac.id/wp-content/uploads/2014/03/dosen.png" alt="" />
                <p id="profile-name" class="profile-name-card"></p>
                <form class="form-signin" action="ServletLogin" method="POS">
                    <span id="Usuario" class="reauth-email"></span>
                    <input type="text" name="Usuario" id="inputEmail" class="form-control" placeholder="Usuario" required autofocus>
                    <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Password" required>      <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
                </form>
            </div><!-- /card-container -->
        </div><!-- /container -->
    </body>
</html>
