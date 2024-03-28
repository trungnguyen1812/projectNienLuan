/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class TaiKhoan {
    private String maso;
    private String hoten;
    private String email;
    private String password;
    private String chucvu;
    private int role;
    public TaiKhoan(){
        
    }
    public TaiKhoan(String maso, String hoten, String email, String password, String chucvu,int role){
        this.maso=maso;
        this.hoten=hoten;
        this.email=email;
        this.password=password;
        this.chucvu=chucvu;
        this.role=role;
    }
    public String getMaSo(){
        return maso;
    }
    public void setMaSo(String masocb){
        this.maso=masocb;
    }
    public String getHoTen(){
        return hoten;
    }
    public void setHoTen(String hoten){
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
    public int getRole(){
        return role;
    }
    public void setRole(int role){
        this.role=role;
    }
    @Override
    public String toString() {
        return "Account{" + "ma so giang vien=" + maso + ", ho ten giang vien=" + hoten + ", Email=" + email + ", Password=" + password + ", hoc vi=" + chucvu + '}';
    }
}
