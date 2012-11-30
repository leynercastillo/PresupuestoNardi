<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.zkoss.org/jsp/zul" prefix="z"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="-1" />
	<link rel="stylesheet" type="text/css" href="style/stylePage.css">
	<z:zkhead />
</head>
<body style="height: auto">
	<%
		request.setAttribute(org.zkoss.zk.ui.sys.Attributes.NO_CACHE,Boolean.TRUE);
	%>
	<z:page>
		<z:window>
			<div class="page">
				<div class="aside">
					<jsp:include page="frmMenu.zul"></jsp:include>
				</div>
				<div class="section-main">
					<jsp:include page="index.zul" />
				</div>
			</div>
		</z:window>
	</z:page>
</body>
</html>