<%-- 
    Document   : sidebar
    Created on : Mar 19, 2024, 10:37:00 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quan Ly CTU</title>
    </head>
    <body>
       
        <nav class="sidebar sidebar-offcanvas" id="sidebar">
            <ul style="margin-left: -10px;" class="nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/home.jsp">
                        <i class="icon-grid menu-icon"></i>
                        <span class="menu-title">Trang Chủ</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                        <i class="icon-layout menu-icon"></i>
                        <span class="menu-title">Quản lý Giảng Viên</span>
                        <i class="menu-arrow"></i>
                    </a>
                    <div class="collapse" id="ui-basic">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/dsGiangVien.jsp">Danh Sách Giảng Viên</a></li>
                            <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/dsDeTai.jsp">Danh sách Đề Tài</a></li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
                        <i class="icon-columns menu-icon"></i>
                        <span class="menu-title">Quản Lý Sinh Viên</span>
                        <i class="menu-arrow"></i>
                    </a>
                    <div class="collapse" id="form-elements">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/dsSinhVien.jsp">Danh Sách Sinh Viên</a></li>
                        </ul>

                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#charts" aria-expanded="false" aria-controls="charts">
                        <i class="icon-bar-graph menu-icon"></i>
                        <span class="menu-title">Thống kê</span>
                        <i class="menu-arrow"></i>
                    </a>
                    <div class="collapse" id="charts">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/chart.jsp">Danh Sách Sinh Viên</a></li>
                            <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/chart.jsp">Danh Sách Giảng Viên</a></li>
                            <li class="nav-item"> <a class="nav-link" href="${pageContext.request.contextPath}/pages/CanBoQuanLY/chart.jsp">Danh Sách Đề Tài</a></li>

                        </ul>
                    </div>
                </li>
            </ul>
        </nav>
    </body>
</html>
