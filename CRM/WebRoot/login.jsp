<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>����CRM����ƽ̨</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<div id="login">
	<div id="login_header">
		<h1 class="login_logo">
			<a href="http://demo.dwzjs.com"><img src="images/login_logo.gif" /></a>
		</h1>
		<div class="login_headerContent">
			<div class="navList">
				<ul>
					<li><a href="#">��Ϊ��ҳ</a></li>
					<li><a href="http://bbs.dwzjs.com">����</a></li>
					<li><a href="doc/dwz-user-guide.pdf" target="_blank">����</a></li>
				</ul>
			</div>
			<h2 class="login_title"><img src="images/login_title.png" /></h2>
		</div>
	</div>
	<div id="login_content">
		<div class="loginForm">
			<form action="index.html">
				<p>
					<label>�û�����</label>
					<input type="text" name="username" size="20" class="login_input" />
				</p>
				<p>
					<label>���룺</label>
					<input type="password" name="password" size="20" class="login_input" />
				</p>
				<div class="login_bar">
					<input class="sub" type="submit" value=" " />
				</div>
			</form>
		</div>
		<div class="login_banner"><img src="images/login_banner.jpg" /></div>
		<div class="login_main">
			<ul class="helpList">
				<li><a href="#">������������</a></li>
				<li><a href="#">��ΰ�װ��Կ��������</a></li>
				<li><a href="#">����������ô�죿</a></li>
				<li><a href="#">Ϊʲô��¼ʧ�ܣ�</a></li>
			</ul>
			<div class="login_inner">
				<p>������ʹ�� �������� ����ʱ�棬���ȡ</p>
				<p>��������ʹ�� ������ ��������ʱ�����ʼ���������շ��ʼ���</p>
				<p>�� �ٱ��� �������Բ�����������Ʊ����С˵��ѧ���ˡ�</p>
			</div>
		</div>
	</div>
	<div id="login_footer">
		Copyright &copy; 2009 www.dwzjs.com Inc. All Rights Reserved.
	</div>
</div>
<body>
</body>
</html>