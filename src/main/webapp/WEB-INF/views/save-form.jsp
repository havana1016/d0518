<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오전 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>여기는 save-form입니다~</h1>

<h2>/save 영역</h2>
<form action="save" method="post">
  <input type="text" name="name" placeholder="이름을 입력해 주세요."><br>
  <input type="text" name="age" placeholder="나이를 입력해 주세요."><br>
  <input type="submit" value="전송하기">


</form>
<h2>/save2 영역</h2>
<form action="save2" method="post">
    <input type="text" name="name" placeholder="이름을 입력해 주세요."><br>
    <input type="text" name="age" placeholder="나이를 입력해 주세요."><br>
    <input type="submit" value="전송하기">


</form>


</body>
</html>
