<%-- 
    Document   : muestraDatos
    Created on : 25-ene-2021, 20:29:55
    Author     : DAW-B
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nomina:</h1>
        <%request.getAttribute("nomina");%>
        ${nomina.nombre} ${nomina.apellidos} lleva ${nomina.anios} en la empresa <br>
        Con ${nomina.dias} dia(s) trabajados tiene una nomina de ${nomina.nomina} <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
