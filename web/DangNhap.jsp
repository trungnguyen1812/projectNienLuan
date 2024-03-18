<%-- 
    Document   : DangNhap
    Created on : Mar 16, 2024, 7:47:31 PM
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
        <form action="DangNhap" method=" post" class="content">
            <img class="imgLogin" width="80px" height="80px" src="Logo.png" alt="">
            <h1 class="titleLogin">ĐĂNG <span style="color:rgb(51, 164, 202);">NHẬP</span></h1>
            <div class="formInput">
                <div style=" margin-left: 48px;">Mã số sinh viên <span style="color: red;">*</span></div>
                <input id="my-element" name="masogv" type="text"><br><br>
                <div style=" margin-left: 48px;">Mật khẩu <span style="color: red;">*</span></div>
                <input id="my-element" name="password"type="password"><br><br>
                <div style="margin-left: 48px;">
                    <a href="" style="color:rgb(51, 164, 202) ;">Quên mật khẩu.</a>
                    <span style="margin-left: 168px;">Đăng ký tại <a href="DangKy.jsp" style="color:rgb(51, 164, 202) ;">Đây.</a></a>
                </div>
                <button class="btnLogin" value="submit">Đăng nhập</button><br>

            </div>

        </form>

    </body>
</html>
