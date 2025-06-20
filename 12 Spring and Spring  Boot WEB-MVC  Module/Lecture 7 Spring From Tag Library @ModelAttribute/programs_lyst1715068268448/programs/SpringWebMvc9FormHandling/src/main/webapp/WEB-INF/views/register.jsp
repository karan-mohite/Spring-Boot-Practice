<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Register Here </h2>
	
	<form action="regForm" method="POST">
		Name : <input type="text" name="name1" /> <br/> <br/>
		Email : <input type="text" name="email1" /> <br/> <br/>
		Password : <input type="password" name="pass1" /> <br/> <br/>
		Gender : <input type="radio" name="gender1" value="Male" /> Male <input type="radio" name="gender1" value="Female" /> Female <br/> <br/>
		City : <select name="city1">
					<option value="Select City"> Select City </option>
					<option value="Chandigarh"> Chandigarh </option>
					<option value="Delhi"> Delhi </option>
					<option value="Pune"> Pune </option>
				</select> <br/> <br/>
				
		<input type="submit" value="Register" />
	</form>
</body>
</html>