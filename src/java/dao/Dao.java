/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author LENOVO
 */
import entity.GiangVien;
import connect.DBContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.util.ArrayList;
//import java.util.List;

public class Dao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void dangkyTaiKhoan(String hoten, String masogv, String email, String password, String chucvu) {
        String query = "INSERT INTO giangvien (hoten, masogv, email, password, chucvu) VALUES (?, ?, ?, ?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, hoten);
            ps.setString(2, masogv);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, chucvu);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Ban da dang ky thanh cong");
            } else {
                System.out.println("Ban dang ky khong thanh cong");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exception appropriately, display message or log.
        } finally {
            // Close PreparedStatement and Connection
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public GiangVien checkAccountExist(String masogv) {
        String query = "select * from giangvien\n"
                + "where [masogv] = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, masogv);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new GiangVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public GiangVien DangNhap(String masogv, String password) {
        String query = "select * from giangvien\n"
                + "where [masogv] = ?\n"
                + "and password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masogv);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new GiangVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;

    }
}
