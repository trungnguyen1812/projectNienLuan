<%-- 
    Document   : DangKy
    Created on : Mar 15, 2024, 9:46:06 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entity.TaiKhoan" %>
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
                <div style=" margin-left: 48px;">Mã số<span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="maso" placeholder="ma so " required><br><br>
                <div style=" margin-left: 48px;">Họ tên<span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="hoten" placeholder="ho ten" required><br><br>
                <div style=" margin-left: 48px;">Email <span style="color: red;">*</span></div>
                <input id="my-element" type="text" name="email" placeholder="email" required><br><br>
                <div style=" margin-left: 48px;">Mật khẩu <span style="color: red;">*</span></div>
                <input id="my-element" type="password" name="password" placeholder="password" required><br><br>
                <div style=" margin-left: 48px;">Chức vụ<span style="color: red;">*</span></div>
                <!--<input id="my-element" type="text" name="chucvu" placeholder="chucvu" required><br><br>-->
                <select name="chucvu" id="chucvu" style="margin-left: 48px">
                    <option value="sinhvien">Sinh viên</option>
                    <option value="giangvien">Giảng viên</option>
                    <option value="canbo">Cán Bộ</option><br><br>
                </select>
                <br>
                <button style="margin-left: 320px;" class="btnLogin"  type="submit">Đăng KÝ</button><br>

            </div>

        </form>
    </body>

</html>
<!-- <script>
        function validateForm() {
            var hoten = document.getElementById("hoten").value;
            var masogv = document.getElementById("masogv").value;
            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;
            var chucvu = document.getElementById("chucvu").value;

            if (hoten === null || masogv === "" || email === "" || password === "" || chucvu === "") {
                alert("Please fill in all fields");
                return false;
            }
            return true;
        }
    </script>-->
