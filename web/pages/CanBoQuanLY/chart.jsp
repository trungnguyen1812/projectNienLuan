<%-- 
    Document   : chart
    Created on : Mar 19, 2024, 8:57:23 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../../layout/header.jsp" %>
        <%@include file="../../layout/sidebar.jsp" %>

        <div class="main-panel">
            <div class="container-fluid page-body-wrapper">
                <div class="main-panel">
                    <div style="width: 1280px" class="content-wrapper">
                        <div class="row">
                            <div class="col-lg-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Line chart</h4>
                                        <canvas id="lineChart"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Bar chart</h4>
                                        <canvas id="barChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Area chart</h4>
                                        <canvas id="areaChart"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Doughnut chart</h4>
                                        <canvas id="doughnutChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-6 grid-margin grid-margin-lg-0 stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Pie chart</h4>
                                        <canvas id="pieChart"></canvas>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 grid-margin grid-margin-lg-0 stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Scatter chart</h4>
                                        <canvas id="scatterChart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
  
                    <!-- partial -->
                </div>
            </div>

            <%@include file="../../layout/footer.jsp" %>
        </div>
    </body>
</html>
<script src="../../js/chart.js"></script>
