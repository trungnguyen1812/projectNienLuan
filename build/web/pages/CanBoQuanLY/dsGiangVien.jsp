<%-- 
    Document   : dsGiangVien
    Created on : Mar 19, 2024, 11:50:37 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Quan Ly Giang Vien</title>

        <style>
            .addBtn {
                border-radius: .25rem;
                text-transform: uppercase;
                font-style: normal;
                font-weight: 400;
                padding-left: 25px;
                padding-right: 25px;
                color: #fff;
                -webkit-clip-path: polygon(0 0,0 0,100% 0,100% 0,100% calc(100% - 15px),calc(100% - 15px) 100%,15px 100%,0 100%);
                clip-path: polygon(0 0,0 0,100% 0,100% 0,100% calc(100% - 15px),calc(100% - 15px) 100%,15px 100%,0 100%);
                height: 40px;
                font-size: 0.7rem;
                line-height: 14px;
                letter-spacing: 1.2px;
                transition: .2s .1s;
                background-image: linear-gradient(90deg,#1c1c1c,#6220fb);
                border: 0 solid;
                overflow: hidden;
            }

            .addBtn:hover {
                cursor: pointer;
                transition: all .3s ease-in;
                padding-right: 30px;
                padding-left: 30px;
            }
        </style>
    </head>
    <body>
        <%@ include file="../../layout/header.jsp" %>

        <%@ include file="../../layout/sidebar.jsp" %>

        <div class="main-panel">
            <div class="col-lg-12 grid-margin stretch-card">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">Quản Lý Giảng Viên</h4>

                        <button class="addBtn">+Thêm Giảng Viên</button>
                        <div class="table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>
                                            User
                                        </th>
                                        <th>
                                            First name
                                        </th>
                                        <th>
                                            Progress
                                        </th>
                                        <th>
                                            Amount
                                        </th>
                                        <th>
                                            Deadline
                                        </th>
                                        <th>
                                            Action
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="py-1">
                                            <img src="../../images/faces/face1.jpg" alt="image"/>
                                        </td>
                                        <td>
                                            Herman Beck
                                        </td>
                                        <td>
                                            <div class="progress">
                                                <div class="progress-bar bg-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                                            </div>
                                        </td>
                                        <td>
                                            $ 77.99
                                        </td>
                                        <td>
                                            May 15, 2015
                                        </td>
                                        <td>
                                            <a href=""><img style="width: 30px;height:30px" src="../../images/file-icons/edit-solid-36.png"/></a>&nbsp;
                                            <a href=""><img style="width: 30px;height:30px"  src="../../images/file-icons/trash-regular-36.png"/></a>
                                        </td>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <%@include file="../../layout/footer.jsp" %>
        </div>
    </body>
</html>

