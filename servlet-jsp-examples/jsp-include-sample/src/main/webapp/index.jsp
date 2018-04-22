<html>
<head>
    <title>JSP include with parameters example</title>
</head>
<body>
<hr>
<h4>INDEX page content</h4>
<jsp:include page="file.jsp" >
    <jsp:param name="firstname" value="Sergiu" />
    <jsp:param name="middlename" value="I." />
    <jsp:param name="lastname" value="Motpan" />
</jsp:include>
</body>
</html>
