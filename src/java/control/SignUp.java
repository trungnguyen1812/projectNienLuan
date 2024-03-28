package control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import entity.TaiKhoan;

/**
 *
 * @author LENOVO
 */
public class SignUp extends HttpServlet {

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
        String hoten = request.getParameter("hoten");
        String maso = request.getParameter("maso");
        //String re_pass = request.getParameter("repass")
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String chucvu = request.getParameter("chucvu");
        int role = 0;
        switch (chucvu) {
            case "giangvien":
                role = 1;
                break;
            case "canbo":
                role = 2;
                break;
            case "sinhvien":
                role = 3;
                break;
            default:
                throw new IllegalArgumentException("Chuc vu khong hop le: " + chucvu);
        }
        Dao dao = new Dao();
        TaiKhoan tk = dao.checkTaiKhoan(maso);
        if (tk==null) {
            if (chucvu.equals("canbo")) {
                dao.DangKy(maso, hoten, email, password, chucvu, role);
                response.sendRedirect("pages/CanBoQuanLY/home.jsp");
                System.out.println("Ten toi la " + hoten);
                System.out.println("Chuc vu cua toi la " + chucvu + "," + role);

            } else if (chucvu.equals("giangvien")) {
                dao.DangKy(maso, hoten, email, password, chucvu, role);
                response.sendRedirect("trangchu.jsp");
                System.out.println("Ten toi la " + hoten);
                System.out.println("Chuc vu cua toi la " + chucvu + "," + role);
            } else if (chucvu.equals("sinhvien")) {
                dao.DangKy(maso, hoten, email, password, chucvu, role);
                response.sendRedirect("trangchu2.jsp");
                System.out.println("Ten toi la " + hoten);
                System.out.println("Chuc vu cua toi la " + chucvu + "," + role);
            } else {
                response.sendRedirect("loi.jsp");
            }

        }
        else{
            System.out.println("Tai khoan da ton tai");
            response.sendRedirect("DangNhap.jsp");
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
