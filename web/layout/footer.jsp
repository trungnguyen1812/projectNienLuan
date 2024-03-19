<%-- 
    Document   : footer
    Created on : Mar 19, 2024, 10:36:47 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sach sinh Vien Page</title>
    </head>
    <body>
        <footer class="footer">
            <div class="d-sm-flex justify-content-center justify-content-sm-between">
                <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2021.  Premium <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap admin template</a> from BootstrapDash. All rights reserved.</span>
                <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="ti-heart text-danger ml-1"></i></span>
            </div>
            <div class="d-sm-flex justify-content-center justify-content-sm-between">
                <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Distributed by <a href="https://www.themewagon.com/" target="_blank">Themewagon</a></span> 
            </div>
        </footer> 


        <!-- plugins:js -->
        <script src="${pageContext.request.contextPath}/vendors/js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page -->
        <script src="${pageContext.request.contextPath}/vendors/chart.js/Chart.min.js"></script>
        <script src="${pageContext.request.contextPath}/vendors/datatables.net/jquery.dataTables.js"></script>
        <script src="${pageContext.request.contextPath}/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
        <script src="${pageContext.request.contextPath}/js/dataTables.select.min.js"></script>

        <!-- End plugin js for this page -->
        <!-- inject:js -->
        <script src="${pageContext.request.contextPath}/js/off-canvas.js"></script>
        <script src="${pageContext.request.contextPath}/js/hoverable-collapse.js"></script>
        <script src="${pageContext.request.contextPath}/js/template.js"></script>
        <script src="${pageContext.request.contextPath}/js/settings.js"></script>
        <script src="${pageContext.request.contextPath}/js/todolist.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page-->
        <script src="${pageContext.request.contextPath}/js/dashboard.js"></script>
        <script src="${pageContext.request.contextPath}/js/Chart.roundedBarCharts.js"></script>
        <script src="https://unpkg.com/boxicons@2.1.4/dist/boxicons.js"></script>

        <!-- End custom js for this page-->
    </body>
</html>
