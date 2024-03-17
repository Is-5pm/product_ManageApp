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
    <title>Title</title>
</head>
<body>
<h1>${dto.id}번 상품</h1>
<form action="/product/modify" method="post">

    <input type="text" id="pno" name="pno" value="${dto.pno}" readonly style="display: none;"><br>

    <label for="pname">상품 이름</label>
    <input type="text" id="pname" name="pname" value="${dto.pname}" required><br>

    <label for="price">상품 가격</label>
    <input type="number" id="price" name="price" value="${dto.price}" required><br>

    <label for="pamount">재고</label>
    <input type="number" id="pamount" name="pamount" value="${dto.pamount}" required><br>

    <button type="submit">수정하기</button>
</form>
</body>
</html>
