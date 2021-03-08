<%--
  Created by IntelliJ IDEA.
  User: ionbenz
  Date: 3/8/21
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza</title>
</head>
<body>
    <form method="POST" action="pizza-order">
        <label for="crust">Select crust</label>
        <select name="crust" id="crust">
            <option value="thin">Thin Crust</option>
            <option value="garlic">Garlic Crust</option>
            <option value="burnt">Burnt Crust</option>
        </select>
        <br>
        <label for="sauce">Select sauce</label>
        <select name="sauce" id="sauce">
            <option value="red">Red Sauce</option>
            <option value="white">White Sauce</option>
            <option value="bbq">BBQ Sauce</option>
        </select>
        <br>
        <label for="size">Select size</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <br>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
        <label for="pepperoni"> Pepperoni</label>
        <input type="checkbox" id="sausage" name="toppings" value="sausage">
        <label for="sausage"> Sausage</label>
        <input type="checkbox" id="bacon" name="toppings" value="bacon">
        <label for="bacon"> Bacon</label>
        <br>
        <input type="submit">
    </form>

</body>
</html>
