<%-- 
    Document   : inscription
    Created on : 23 janv. 2020, 09:56:12
    Author     : croux08
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="../css/formInscr.css" />
        <title>Inscription</title>
    </head>
    <body>
        <FORM method="POST" ACTION="accueil.htm">
            <label for="nom">Nom :</label><input type="text" id="nom" /><br />
            <p>Prenom : <INPUT Type=text Name=prenom></p>
            <p>Identifiant : <INPUT Type=text Name=identifiant></p>
            <p>Mot de passe : <input type=password name=password></p>
            <INPUT Type=submit VALUE="OK">
        </FORM>
    </body>
</html>