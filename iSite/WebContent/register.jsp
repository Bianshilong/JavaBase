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
<!-- <script type="text/javascript" src="js/register.js"></script> -->
<script type="text/javascript">
function checkName() {
	// 只简单的判断用户名的长度
	var name =$('#name').val();
	if (name.replace(/\s/g, "") == "") {
		$('#error_name').html("输入不能为空，请重新输入");
	}else if(name.length<6){
		$('#error_name').html("输入用户名太短，请重新输入");
	}else{
		$('#error_name').html("√");
	}
}
</script>
</head>
<body>
	<br/>
	<br/>
	<div class="container" style="width: 500px;">
		<h2>注册信息</h2>
		<form action="regst.action" method="post">
			<div class="form-group">
				<label for="name">用户名:</label> 
				<input type="text" class="form-control" id="name" maxlength="10"
				placeholder="Enter name (字母、数字6-10位) " name="name" onblur="checkName()"><span id="error_name"></span>
			</div>
			<div class="form-group">
				<label for="password">密码:</label> 
				<input type="password" class="form-control" id="pwd" maxlength="12"
				placeholder="Enter password (字母、数字8-12位) " name="pass" onblur="checkPwd1()"><span id="error_pwd"></span>
			</div>
			<div class="form-group">
				<label for="pwd">密码确认:</label> 
				<input type="password" class="form-control" id="pwd2" maxlength="12"
				placeholder="Enter password (字母、数字8-12位) " name="pass" onblur="checkPwd2()"><span id="error2_pwd"></span>
			</div>
			<div class="form-group">
				<label for="email">邮箱:</label> 
				<input type="email" class="form-control" id="email"
				 placeholder="Enter email" name="email" onblur="checkEmail()"><span id="error_email"></span>
			</div>
			<div class="form-group">
				<label for="tell">邮箱:</label> 
				<input type="text" class="form-control" id="tell" maxlength="15"
				 placeholder="Enter phoneNumber" name="tell" onblur="checkTell()"><span id="error_tell"></span>
			</div>
			<div class="radio">
				<label for="sex">性别:</label><br/>
					<label><input type="radio" id="sex" checked="checked" name="sex">男</label>&nbsp;&nbsp;
					<label><input type="radio" id="sex"  name="sex">女</label>
			</div>
			<div class="form-group">
				<label for="birth">出生日期:</label> 
				<input type="date" class="form-control" id="birth" name="birth" onblur="checkBirth()"><span id="error_birth"></span>
			</div>
			<input type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="重置" />
		</form>
	</div>
	<!-- <form action="regst.action" method="post">
		<input type="text" name="name"/><br/>
		<input type="password" name="pass" /><br/>
		<input type="submit" value="提交" />
		<input type="reset" value="重置" />
	</form> -->
	
</body>
</html>