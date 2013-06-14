<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Ascensores Nardi, C.A. - Login - Contacto</title>
<link rel="icon" type="image/png"
	href="../resource/images/icons/logo.png" />
<link rel="stylesheet" type="text/css"
	href="../resource/style/stylePage.css"/>
<link rel="stylesheet" type="text/css"
	href="../resource/style/bootstrap.min.css"/>
</head>
<body>
	<div class="container">
		<div class="row header">
			<div class="span7">
				<img alt="Ascensores Nardi Logo"
					src="../resource/images/logo-web.jpg"/>
			</div>
			<div class="span5">
				<jsp:include page="login.zul" />
			</div>
		</div>
		<div class="row">
			<div style="margin-top: 20px">
				<div class="span7 hidden-phone"></div>
				<div class="span5">
					<jsp:include page="../contacto/frmContact.zul" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>