<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<form method="post" action="upload" enctype="multipart/form-data">

         <label>email:</label>

         <input type="text" name="email">

         <br><br>


         <label>파일:</label>

         <input type="file" name="file1">

         <br><br>

         <input type="submit" value="upload">

</form>
</body>
</html>
