<%--
  Created by IntelliJ IDEA.
  User: is5pm
  Date: 3/15/24
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 id="pageTitle">Product List</h1>

<script>
    document.getElementById("pageTitle").addEventListener("click", function() {
        window.location.href = "/product/list";
    });
</script>

<div>
    <table>
        <thead>
        <tr>
            <th>상품 번호</th>
            <th>상품 이름</th>
            <th>상품 가격</th>
            <th>재고 수량</th>
            <th>수정</th>
            <th>삭제</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="dtoList" items="${dtoList}">
            <tr>

                <td>${dtoList.pno}</td>
                <td>${dtoList.pname}</td>
                <td>${dtoList.price}</td>
                <td>${dtoList.pamount}</td>
                <td><a href="/product/modify?id=${dtoList.pno}">수정</a></td>
                <td><a href="/product/remove?id=${dtoList.pno}">삭제</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<button onclick="location.href='/product/insert'">상품 등록</button>
</body>
</html>
