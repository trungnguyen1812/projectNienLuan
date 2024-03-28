<%-- 
    Document   : dsGiangVien
    Created on : Mar 19, 2024, 11:50:37 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "entity.GiangVien"%>
<%@page import = "dao.Dao" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Quan Ly Giang Vien</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

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
        <form action="ThemGiangVien" method="post">
            <%@ include file="../../layout/header.jsp" %>

            <%@ include file="../../layout/sidebar.jsp" %>

            <div class="main-panel">
                <div class="col-lg-12 grid-margin stretch-card">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">Quản Lý Giảng Viên</h4>
                            <button type="button" value="submit" href="" class="addBtn" data-bs-toggle="modal" data-bs-target="#exampleModal">+Thêm Giảng Viên</button>

                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">

                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h1 class="modal-title fs-5" id="exampleModalLabel" style="color: #003399">Form Add Giang Vien</h1>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">

                                            <div style="margin-left: 25px">Mã số<span style="color: red;">*</span></div>
                                            <input style="width: 400px;margin-left: 25px;height:40px;" id="my-element" type="text" name="maso" placeholder="A0001" required><br><br>
                                            <div style="margin-left: 25px">Họ Tên<span style="color: red;">*</span></div>
                                            <input style="width: 400px;margin-left: 25px;height:40px;" id="my-element" type="text" name="hoten" placeholder="Nguyen Van A " required><br><br>
                                            <div style="margin-left: 25px">Khoa<span style="color: red;">*</span></div>
                                            <input style="width: 400px;margin-left: 25px;height:40px;" id="my-element" type="text" name="khoa" placeholder="Cong Nghe Thong Tin" required><br><br>
                                            <div style="margin-left: 25px">Email<span style="color: red;">*</span></div>
                                            <input style="width: 400px;margin-left: 25px;height:40px;" id="my-element" type="text" name="email" placeholder="NVAa0001@ctu.edu." required><br><br>
                                            <div style="margin-left: 25px">Trình Độ<span style="color: red;">*</span></div>
                                            <input style="width: 400px;margin-left: 25px;height:40px;" id="my-element" type="text" name="trinhdo" placeholder="Dai Hoc" required><br><br>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                            <button type="submit" value="submit" class="btn btn-primary">+Add</button>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <!-- Modal -->


                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>
                                                Mã số 
                                            </th>
                                            <th>
                                                Họ Tên
                                            </th>
                                            <th>
                                                Khoa
                                            </th>
                                            <th>
                                                Email
                                            </th>
                                            <th>
                                                Trình độ
                                            </th>
                                            <th>
                                                Chỉnh sửa
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

                <%@include file="../../layout/footer.jsp" %>

            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        </form>

    </body>
</html>

