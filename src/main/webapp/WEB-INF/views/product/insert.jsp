<%--
  Created by IntelliJ IDEA.
  User: is5pm
  Date: 3/15/24
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Page</title>
</head>
<body>
<h1>Product  Insert </h1>
<form action="/product/insert" method="post">
    <input type="text" id="pname" name="pname" required placeholder="상품 이름"><br>
    <input type="number" id="price" name="price" min="0" max="1000000" placeholder="상품 가격" required><br>
    <input type="number" id="pamount" name="pamount" min="0" max="99999" placeholder="재고 수량" required><br>
    <button type="reset">초기화</button>
    <button type="submit">상품등록</button>
</form>
</body>
</html>
