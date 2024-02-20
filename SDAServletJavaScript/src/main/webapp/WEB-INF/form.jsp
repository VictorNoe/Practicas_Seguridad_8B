<%--
  Created by IntelliJ IDEA.
  User: victo
  Date: 19/02/2024
  Time: 06:33 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form
            method="post"
            action="<%=request.getContextPath()%>/PokemonServlet"
    >
        <p>
            <label for="nombre">Nombre:</label>
            <input id="nombre" name="nombre"/>
        </p>
        <p>
            <label for="caracteristicas">Caracteristicas:</label>
        </p>
        <p>
            <textarea id="caracteristicas" name="caracteristicas" cols="30" rows="10"></textarea>
        </p>
        <button type="submit">SEND</button>
    </form>
</body>
</html>
