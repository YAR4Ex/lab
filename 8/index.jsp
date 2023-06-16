<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1>This is start of your journey!</h1>
<p>
    <% String username = (String)session.getAttribute("username");
        if (username != null) { %>
    Wassup, <%= username %>! <a href="logout">Logout</a>
    <% } else { %>
    What are you trying, your are not login, man. <a href="login.jsp">Login</a>
    <% } %>
</p>
</body>
</html>