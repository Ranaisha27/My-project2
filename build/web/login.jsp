<%-- 
    Document   : login
    Created on : Apr 1, 2019, 10:03:14 AM
    Author     : ranai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" href="animate.css"/>
	<style>
	body{
		
		background-size: cover;
		
	
		margin:0;
		padding: 0;
		font-family:sans-serif;
		background: url(images/login.jpg) no-repeat;
		background-size: cover;
		
		
		/*background-position:center;*/
	
	}
	.main
	{
		max-width:400px;
		border-radius: 20px;
		margin: auto;
		background:rgba(0,0,0,0.8);
		box-sizing:border-box;
		padding:40px;
		color:#fff;
		margin-top:50px;
	}
	.h2
	{
		text-align:center;

	}
	.main p{
	margin:0;
	padding:0;
	font-weight:bold;
}
	.my
	{
		width:100%;
		box-sizing: border-box;
		padding: 12px 5px;
		background:rgba(0,0,0,0.10);
		outline:none;
		border:none;
		border-bottom:1px solid #fff;
		color:white;
		border-radius:5px;
		margin:5px;
		font-weight:bold;

	}
	.g
{
    width:100%;
		box-sizing: border-box;
		padding: 12px 5px;
		background:rgba(0,0,0,0.10);
		outline:none;
		border:none;
		border-bottom:1px solid #fff ;
		color:white;
		border-radius:5px;
		margin:5px;
		font-weight:bold;
        opacity:0.9;
}
.g .j{
    
	color:black;
}
	.btn
	{
		width:100%;
		box-sizing:border-box;
		padding: 10px,0;
		background: #60adde;
		opacity:0.7;
		outline:none;
		border:none;
		border-bottom:1px  #fff;
		color:#fff;
		border-radius:20px;
		font-size:20px;
		margin-top:30px;
		height:50px;
	}
	.btn:hover
{
	background:#ffc107;
	color:#000;
	cursor:pointer;
}
.main a{
	text-decoration:none;
	font-size:12px;
	line-height:20px;
	color:darkgrey;
}
</style>
</head>
<body>
<div class="main">
	<h1 class="animated heartBeat">Login Here</h1>
	<form name="form" action ="logServlet" method="get" onsubmit=" return myValidation()">
		<p>ID</p>
		<input class= "my" type="text " placeholder= "ID" name="id" value=""><br>
		<p>Password</p>
		<input  class="my" type="password" placeholder="password" name="pass" value=""><br>
		<p>Account</p>
		<select class="g" name="select">
			<option class="j" value="">---select---</option>
       <option  class="j" value="Student">Student/Faculty</option>
       
        <option  class="j" value="Staff">Staff</option>
         <option  class="j" value="Admin">Admin</option>
         </select>


		<input class="btn" class="animated tada" type="submit" name="" value="login"><br><br>
		<a href="lostpass.jsp">Lost your password?</a><br><br>
		

		<script >
		function myValidation(){
		var value=document.forms["form"]["id"].value;
		var value1=document.forms["form"]["pwd"].value;
		var value2=document.forms["form"]["acc"].value;
		if(value=="")
		{
			alert("Name input cannot be empty!");
			//return false;
			flag=false;
		}

		if(value1=="")
		{
			alert("Password cannot be empty!");
			//return false;
			flag=false;
		}
		if(value2==""  )
		{
			alert("select type!!!!");
			flag=false;
		}
		return flag;
	}
	 </script>
	</form>


</div>
</body>
</html>
