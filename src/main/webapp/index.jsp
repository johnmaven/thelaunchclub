<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Spring date</title>
<style>
body
{
text-align:center;
}
form
{
 padding:150px 50px;
 box-border:1px solid black;
 width:600px;
 height:100px;
 background-color: #fbe0fb ;
 margin:100px 220px;
}

</style>
</head>
<body>

	<form action="getdate" >
	Enter month(1-12) <input type="text" name="month"/>
	Enter Day(1-7)<input type="text" name="day"/><br><br>
	 <input type="submit" value="Submit"/>
	</form>
    <br>
 
</body>
</html>