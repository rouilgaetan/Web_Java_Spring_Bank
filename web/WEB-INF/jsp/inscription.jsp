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
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/forminscr.css"/>
        <title>Inscription</title>
    </head>
    <body>
        <FORM method="POST" ACTION="accueil.htm">
            <p>Nom : </p><p><input type="text" id="nom" /></p>
            <p>Prenom : </p><p><INPUT Type=text Name="prenom"></p>
            <p>Identifiant : </p><p><INPUT Type="text" Name="identifiant"></p>
            <p>Mot de passe : </p><p><input type="password" name="password"></p>
            <div>
            <input type="radio" id="particulier" name="type" value="particulier" checked>
            <label for="particulier">Particulier</label>
            </div><br />
            <div>
              <input type="radio" id="pro" name="type" value="pro">
              <label for="pro">Professionnel</label>
            </div><br />
            <INPUT Type="submit" VALUE="OK">
        </FORM>
    </body>
</html>