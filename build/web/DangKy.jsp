<%-- 
    Document   : DangKy
    Created on : Mar 15, 2024, 9:46:06 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "entity.GiangVien"%>
<%@page import ="dao.Dao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>LGON: QUAN LY NIEN LUAN</title>
        <link rel="stylesheet" href="css/login.css">
    </head>

    <body>
        <form action="SignUp" method="post" class="content">
            <img class="imgLogin" width="80px" height="80px" src="Logo.png" alt="">
            <h1 class="titleLogin">ĐĂNG <span style="color:rgb(51, 164, 202);">KÝ</span></h1>
            <div class="formInput">
                <div style=" margin-left: 48px;">Mã số sinh viên <span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="masogv"><br><br>
                <div style=" margin-left: 48px;">Họ tên<span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="hoten"><br><br>
                <div style=" margin-left: 48px;">Email <span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="email"><br><br>
                <div style=" margin-left: 48px;">Mật khẩu <span style="color: red;">*</span></div>
                <input id="my-element" type="password" name="password"><br><br>
                <div style=" margin-left: 48px;">Chức vụ<span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="chucvu"><br><br>
                <br>
                <button style="margin-left: 320px;" class="btnLogin"  type="submit">Đăng KÝ</button><br>

            </div>

        </form>
    </body>
</html>
