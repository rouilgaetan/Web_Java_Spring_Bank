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
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/formInscr.js"></script>
        <title>Inscription</title>
    </head>
    <body>
        <FORM method="POST" ACTION="inscrOK.htm">
            <p>Nom : </p><input type="text" id="nom" name="nom"/><br/>
            <p>Prenom : </p><input type=text id="prenom" name="prenom"><br/>
            <p>Identifiant : </p><input type="text" id="identifiant" name="identifiant"><br/>
            <p>Mot de passe : </p><input type="password" name="mdp" id="mdp"><br/>
            <p>Date de naissance : <input type="date" id="ddNaissance" name="birthDate"/></p>
            <p>Code Postal : </p><input type="text" id="codePostal" name="codePostal" maxlength="5"/><br />
            <p>Ville : </p><input type="text" id="ville" name="ville"/><br />
            <p>Adresse : <p><input type="text" id="adresse" name="adresse"/><br />
            <div>
                <input type="radio" id="particulier" name="type" value="particulier" checked>
                <label for="particulier">Particulier</label>
            </div><br />
            <div>
                <input type="radio" id="pro" name="type" value="pro">
                <label for="pro">Professionnel</label>
            </div><br />
            <div id="divPro" class="test">
                <p>Entreprise : </p><input type="text" id="entreprise" /><br />
                <p>N° Siret : </p><input type="text" id="siret" maxlength="14"/><br />
            </div>
            <INPUT Type="submit" VALUE="OK">
        </FORM>
    </body>
</html>