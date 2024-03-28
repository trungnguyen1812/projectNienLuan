/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author LENOVO
 */
import connect.DBContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.util.ArrayList;
//import java.util.List;
import entity.TaiKhoan;
import entity.GiangVien;

public class Dao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public TaiKhoan checkTaiKhoan(String maso) {
        String query = "SELECT * FROM TaiKhoan WHERE [maso] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maso);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new TaiKhoan(
                        rs.getString("hoten"),
                        rs.getString("maso"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("chucvu"),
                        rs.getInt("role")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
        return null;
    }

//    public GiangVien checkAccountExist(String maso) {
//        String query = "select * from taikhoangv\n"
//                + "where [masogv] = ?\n";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setString(1, maso);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                return new GiangVien(rs.getString(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getString(4),
//                        rs.getString(5));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
    public void DangKy(String maso, String hoten, String email, String password, String chucvu, int role) {
        String query = "INSERT INTO TaiKhoan(hoten, maso, email, password, chucvu, role) VALUES (?, ?, ?, ?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, hoten);
            ps.setString(2, maso);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, chucvu);
            ps.setInt(6, role);

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
    
    public TaiKhoan DangNhap(String maso, String password){
        String query="select * from TaiKhoan where [maso]=? and password=?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maso);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new TaiKhoan(
                        rs.getString("hoten"),
                        rs.getString("maso"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("chucvu"),
                        rs.getInt("role")
                );
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
        return null;
    }
    
    public void ThemGiangVien(String maso, String hoten, String khoa, String email, String trinhdo){
//        String query = "INSERT [dbo].[GiangVien] \n"
//                + "([maso], [hoten], [khoa], [email], [trinhdo])\n"
//                + "VALUES(?,?,?,?,?)";
        String query = "INSERT INTO GiangVien (maso, hoten, khoa, email, trinhdo) VALUES (?, ?, ?, ?,?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maso);
            ps.setString(2, hoten);
            ps.setString(3, khoa);
            ps.setString(4, email);
            ps.setString(5, trinhdo);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Ban da them thanh cong" +maso);
            } else {
                System.out.println("Ban dang ky khong thanh cong");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
    
public void insertTeacher(GiangVien giangvien){
    String query = "INSERT INTO GiangVien (maso, hoten, khoa, email, trinhdo) VALUES (?, ?, ?, ?,?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, giangvien.getMaSo());
            ps.setString(2, giangvien.getHoTenCB());
            ps.setString(3, giangvien.getKhoa());
            ps.setString(4, giangvien.getEmail());
            ps.setString(5, giangvien.getTrinhDo());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Ban da them thanh cong");
            } else {
                System.out.println("Ban dang ky khong thanh cong");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
    
    


public GiangVien getGiangVienByMaso(String maso) {
        String query = "SELECT * FROM GiangVien WHERE maso = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maso);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new GiangVien(
                        rs.getString("maso"),
                        rs.getString("hoten"),
                        rs.getString("khoa"),
                        rs.getString("email"),
                        rs.getString("trinhdo")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try {
                if (rs != null) {
                    rs.close();
                }
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
        return null;
    }
}