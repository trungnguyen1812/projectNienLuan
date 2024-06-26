/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import dao.Dao;
import entity.TaiKhoan;

/**
 *
 * @author LENOVO
 */
public class DangNhap extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String maso = request.getParameter("maso");
        String password = request.getParameter("password");
        Dao dao = new Dao();
        TaiKhoan a = dao.DangNhap(maso, password);
        if (a == null) {
            request.setAttribute("thongdiep", "Ma so hoac mat khau sai");
            request.getRequestDispatcher("DangNhap.jsp").forward(request, response);
            System.out.println("Ma so hoac mat khau sai"); 
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("taikhoan", a);
            session.setMaxInactiveInterval(1000); //được sử dụng để đặt thời gian chờ không hoạt động tối đa cho phiên HttpSession, được tính bằng giây.
//            response.sendRedirect("pages/CanBoQuanLY/home.jsp");
//            System.out.println("Dang nhap thanh cong");

            switch (a.getRole()) {
                case 1:
                    response.sendRedirect("pages/GiangVien/home.jsp");
                    break;
                case 2:
                    response.sendRedirect("pages/CanBoQuanLY/home.jsp");
                    break;
                case 3:
                    response.sendRedirect("pages/SinhVien/home.jsp");
                    break;
                default:
                    response.sendRedirect("loi.jsp");
            }
            System.out.println("Đăng nhập thành công");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
