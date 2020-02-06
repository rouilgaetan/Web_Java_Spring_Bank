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
        <script src="jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/formInscr.js"></script>
        <title>Inscription</title>
    </head>
    <body>
        <FORM method="POST" ACTION="inscrOK.htm">
            <p>Nom : </p><input type="text" id="nom" /><br/>
            <p>Prenom : </p><INPUT Type=text Name="prenom"><br/>
            <p>Identifiant : </p><INPUT Type="text" Name="identifiant"><br/>
            <p>Mot de passe : </p><input type="password" name="password" id="pass"><br/><br/>
            <div>
            <input type="radio" id="particulier" name="type" value="particulier" checked>
            <label for="particulier">Particulier</label>
            </div><br />
            <div>
                <input type="radio" id="pro" name="type" value="pro" onclick="myfunct()">
                <label for="pro">Professionnel</label>
            </div><br />
            <div id="divPro" class="test">
                <p>TEST !!!!!!!!!!!!!!!!!!!!!!!!!!!!</p>
            </div>
            <INPUT Type="submit" VALUE="OK">
        </FORM>
    </body>
</html>