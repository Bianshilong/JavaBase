<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<br/>
	<br/>
	<div class="container" style="width: 500px;">
		<h2>注册信息</h2>
		<form action="register.action" method="post">
			<div class="form-group">
				<label for="name">用户名:</label> 
				<input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
			</div>
			<div class="form-group">
				<label for="password">密码:</label> 
				<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pass">
			</div>
			<div class="form-group">
				<label for="pwd">密码确认:</label> 
				<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pass">
			</div>
			<div class="form-group">
				<label for="email">邮箱:</label> 
				<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
			</div>
			<div class="radio">
				<label for="sex">性别:</label><br/>
					<label><input type="radio" id="sex" checked="checked" name="sex">男</label>&nbsp;&nbsp;
					<label><input type="radio" id="sex"  name="sex">女</label>
			</div>
			<div class="form-group">
				<label for="birth">出生日期:</label> 
				<input type="date" class="form-control" id="email" name="birth">
			</div>
			<input type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="重置" />
		</form>
	</div>
</body>
</html>