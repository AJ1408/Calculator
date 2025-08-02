<%@page language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h2>Hello World!!!</h2>
    <h1>Calculator</h1>
    <form action="calculator" method="get">
        <label for="num1">Enter 1st Number: </label>
        <input type="text" id="num1" name="num1"><br>

        <label for="operator">Enter Operator (+, -, *, /): </label>
        <input type="text" id="operator" name="operator"><br>

        <label for="num2">Enter 2nd Number: </label>
        <input type="text" id="num2" name="num2"><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
