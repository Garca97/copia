<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">       
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="js/myscript.js"></script>
        <link rel="stylesheet" type="text/css" href="css/styles.css" media="screen" />
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <h1><%=String.valueOf(request.getAttribute("Usuario"));%></h1>
                <h1><%=String.valueOf(request.getAttribute("pass"));%></h1>
            </div><!-- /card-container -->
        </div><!-- /container -->
    </body>
</html>