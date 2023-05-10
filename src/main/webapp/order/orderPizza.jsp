<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="PizzaOrderServlet" method="post">
    <label for="crust">Crust:</label>
    <select id="crust" name="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="deep-dish">Deep Dish</option>
    </select><br><br>

    <label for="sauce">Sauce:</label>
    <select id="sauce" name="sauce">
        <option value="tomato">Tomato</option>
        <option value="bbq">BBQ</option>
        <option value="alfredo">Alfredo</option>
    </select><br><br>

    <label for="size">Size:</label>
    <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
        <option value="extra-large">Extra Large</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
    <label for="pepperoni">Pepperoni</label><br>
    <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms">
    <label for="mushrooms">Mushrooms</label><br>
    <input type="checkbox" id="onions" name="toppings" value="onions">
    <label for="onions">Onions</label><br>
    <input type="checkbox" id="sausage" name="toppings" value="sausage">
    <label for="sausage">Sausage</label><br><br>

    <label for="address">Delivery Address:</label>
    <input type="text" id="address" name="address"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
