/**
 * register.jsp页面的注册信息，验证使用
 */

//// 输入框获得焦点时，显示提示内容(未定义该方法)
//function showDesc(obj) {
//	var id = obj.name;
//	document.getElementById(id).style.display = "inline";
//}
// 输入框失去焦点时检验输入内容是否有效
//function checkText(obj) {
//	// 获取输入框的id值
//	var id = obj.name;
//	var text = document.getElementById(id.toString().toUpperCase()).value;
//
//	// 判断是否为空
//	if (text.replace(/\s/g, "") == "") {
//		document.getElementById(id).innerHTML = "输入不能为空";
//	} else {// 组装方法
//		// 取首字母转换为大写,其余不变
//		var firstChar = id.charAt(0).toString().toUpperCase();
//		//
//		var strsub = id.substring(1, id.length);
//		var strMethod = "check" + firstChar + strsub + "()";
//		var isTrue = eval(strMethod);
//		if (isTrue) {
//			document.getElementById(id).innerHTML = "输入有效";
//		}
//	}
//
//}

//判断用户名是否为空，空串，以及长度是否符合要求
function checkName() {
	var name =$('#name').val();
	if (name.replace(/\s/g, "") == "") {
		$('#error_name').html("用户名不能为空，请重新输入");
	}else if(name.length<6){
		$('#error_name').html("用户名太短，请重新输入");
	}else{
		$('#error_name').html("√");
	}
}

//判断输入的密码是否符合要求
function checkPwd1() {
	var password =$('#pwd').val();
	if (password.replace(/\s/g, "") == "") {
		$('#error_pass').html("密码不能为空，请重新输入");
	}else if(password.length<8){
		$('#error_pass').html("密码太短，请重新输入");
	}else{
		$('#error_pass').html("√");
	}
}

//验证2次输入的密码是否一致
function checkPwd2() {
	var password = $('#pwd').val();
	var password2 = $('#pwd2').val();
	if (password != password2) {
		$('#error2_pass').html("密码不一致");
	}else {
		$('#error2_pass').html("√");
	}
}

//检查输入的号码是否合法
function checkTell() {
	// 利用正则表达式对输入数据匹配
	var tell = $('#tell').val();
	// 匹配到一个非数字字符，则返回false
	var expr = /\D/i;
	if (expr.test(tell)) {
		$('#error_tell').html("不能输入非数字字符");
	}else{
		$('#error_tell').html("√");
	}
}

//检查输入的email是否合法
function checkEmail() {
	// 利用正则表达式对输入数据匹配
	var email = $('#email').val();
	// 以字母或数字开头，跟上@,字母数字以.com结尾
	var expr = /^([0-9]|[a-z])+@([0-9]|[a-z])+(\.[c][o][m])$/i;
	if (!expr.test(email)) {
		$('#error_email').html("输入的邮箱格式有误");
	}else{
		$('#error_email').html("√");
	}
}

//检查输入的生日是否合法
function checkBirth(){
	var birth =$('#birth').val();
	
	
}
