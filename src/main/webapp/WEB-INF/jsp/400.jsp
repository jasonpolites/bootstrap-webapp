<%@ page isErrorPage="true" contentType="text/html"%>

<!DOCTYPE html>
<html>
<head>
    <title>Bad Request</title>
    <link href="${pageContext.request.contextPath}/css/errorpage.css" rel="stylesheet">
</head>
<body style="background-color: #c5acac">
<div id="inner">
    <div class="title-400">Bad Request!</div>
    <div class="sub-400"><%=request.getAttribute("javax.servlet.error.message")%></div>
</div>
</body>
</html>