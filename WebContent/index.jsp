<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<LINK href="css/style.css" rel="stylesheet" type="text/css">     
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
</head>
<body>

 <div class="tab">
  <button class="tablinks" id="listUsers"><h2>List users :</h2></button> 
  <div>
  	<button class="tablinks" id="showUser"><h2>Single user :</h2></button>
  	UID: <input type="text" name="userId" id="userId" value=""  required/>
  </div>
  <div>
  <button class="tablinks" id="addUser"><h2>Create user :</h2></button>
  	UID: <input type="text" name="addUserId" id="addUserId" value=""  required/><br/>           
  	First Name: <input type="text" name="fname" id="fname" value=""  required/><br/>
  	Last Name: <input type="text" name="lname" id="lname" value=""  required/><br/>
  	avatar: <input type="text" name="avatar" id="avatar" value=""  required/>
  </div>
  <div>
  	<button class="tablinks" id="deleteUser"><h2>Delete user :</h2></button>
  	UID: <input type="text" name="delUserId" id="delUserId" value=""  required/><br/>
  </div>
  
</div>

<div id="ajaxResponse"></div>
 


</body>
</html>