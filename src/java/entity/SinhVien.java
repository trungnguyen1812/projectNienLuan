/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class SinhVien {
     private String maso;
    private String hoten;
    private String email;
    private String password;
    private String chucvu;
    public SinhVien(){
        
    }
    public SinhVien(String maso, String hoten, String email, String password, String chucvu){
        this.maso=maso;
        this.hoten=hoten;
        this.email=email;
        this.password=password;
        this.chucvu=chucvu;
    }
    public String getMaSoCB(){
        return maso;
    }
    public void setMaSoCB(String maso){
        this.maso=maso;
    }
    public String getHoTenCB(){
        return hoten;
    }
    public void setHoTenCB(String hoten){
        this.hoten=hoten;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getChucVu(){
        return chucvu;
    }
    public void setChucVu(String chucvu){
        this.chucvu=chucvu;
    }
    @Override
    public String toString() {
        return "Account{" + "ma so giang vien=" + maso + ", ho ten giang vien=" + hoten + ", Email=" + email + ", Password=" + password + ", hoc vi=" + chucvu + '}';
    }
}