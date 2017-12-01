<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="short cut icon" href="/iSite/favicon.ico" />
<link rel="stylesheet" href="../css/rgCss.css" type="text/css" />
</head>
<body>
	<!-- 打算使用Struts2的标签来创建JSP页面，但现在报错了，暂时不研究了，先用HTML页面处理注册信息 -->
	<br>
	<br>
	<!-- 图片与文档底对齐 -->
	<div class="p1 tb">
		<img src="../img/logo.png" align="middle" /> &nbsp;&nbsp; <span
			class="sp">注册信息</span>
	</div>
	<br />
	<hr size="10px" width="60%" color="PapayaWhip" />
	<div class="p2">
		<s:form action="RegistAction" method="post">
			<s:textfield id="name" name="username" label="用户名" />
			<s:password id="pwd_01" name="password" label="密&nbsp;&nbsp;码"/>
			<s:password id="pwd_02" name="password" label="密码确认"/>
			<s:radio name="sex" label="性别" list="{'男','女'}" />
			<s:textfield id = "email" name="email" label="邮箱" />
			<s:checkboxlist id="checklists" name="habirat" list="{'Java','PHP','C++','Python'}" />
			<s:submit value="确认" /> <s:reset value="重置" />
		</s:form>
	</div>
	<div class="ud">
		<span>当使用本站时，代表您已接受了本站的使用条款和隐私条款。版权所有，保留一切权利。&copy;2017
			皖ICP5879156</span><br />

	</div>
</body>
</html>