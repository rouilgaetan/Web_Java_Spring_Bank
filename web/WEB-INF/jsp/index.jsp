<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/redirectForm.js"></script>
        <title>BanqueRoot</title>
    </head>

    <body>
        <p>
        <img src="${pageContext.request.contextPath}/images/logo.png" />
        </p>
        <center>
            <h1>Bienvenue sur BanqueRoot, la banque à la racine !</h1>
        </center><br />
        <div id="gauche">
            <div>
                <h2>Se connecter en tant que client</h2>
                <div id="client">
                    <h3>Connectez-vous pour accéder à vos comptes</h3>
                    <FORM method="POST" ACTION="accueil.htm">
                        <p>Identifiant : <INPUT Type=text Name=nom></p>
                        <p>Mot de passe : <input type=password name=password></p>
                        <INPUT Type=submit VALUE="OK">
                    </FORM>
                    <h2>Se connecter</h2>
                    <input type="button" value ="Inscription" onclick="redirectInscription()" action="inscription.htm"/>
                </div>
            </div>
        </div>
        <div id="droite">
            <h2>Se connecter en tant que conseiller</h2>
            <div id="conseiller">
                <h3>Connectez-vous en tant que conseiller</h3>
                <FORM method="POST" ACTION="accueil.htm">
                    Identifiant : <INPUT Type=text Name=nom>
                    Mot de passe : <input type=password name=password>
                    <INPUT Type=submit VALUE="OK">
                </FORM>
            <h2>Se connecter</h2>
            <input type="button" value ="Inscription" onclick="redirectInscription()" action="inscription.htm"/>
            </div>
        </div>
    </body>
</html>
