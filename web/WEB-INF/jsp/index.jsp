<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BanqueRoot</title>
    </head>

    <body>
        <h1>Bienvenue sur BanqueRoot, la banque à la racine !</h1>
        <h2>Connectez-vous</h2>
        <FORM method="POST" ACTION="accueil.htm">
            Identifiant : <INPUT Type=text Name=nom>
            Mot de passe : <input type=password name=password>
            <INPUT Type=submit VALUE="OK">
        </FORM>
        <h2>Créer un compte</h2>
        <input type="button" value ="Inscription" onclick="document.forms[0].action ='inscription.jsp'" />
        <p id="demo" onclick="myFunction()">Click me to change my text color.</p>


        
    </body>
</html>

<script>
function myFunction() {
  document.getElementById("demo").style.color = "red";
}
</script>