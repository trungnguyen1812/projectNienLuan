/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @a/**author LENOVO
 */

public class GiangVien {
     private String maso;
    private String hoten;
    private String email;
    private String password;
    private String chucvu;
    private String trinhdo;
    private String khoa;
    public GiangVien(){
        
    }
    public GiangVien(String maso, String hoten, String email, String password, String chucvu, String trinhdo, String khoa){
        this.maso=maso;
        this.hoten=hoten;
        this.email=email;
      //  this.password=password;
     //   this.chucvu=chucvu;
        this.trinhdo=trinhdo;
        this.khoa=khoa;
    }

    public GiangVien(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getMaSo(){
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
//    public String getPassword(){
//        return password;
//    }
//    public void setPassword(String password){
//        this.password=password;
//    }
//    public String getChucVu(){
//        return chucvu;
//    }
//    public void setChucVu(String chucvu){
//        this.chucvu=chucvu;
//    }
    public String getKhoa(){
        return khoa;
    }
    public void setKhoa(String khoa){
        this.khoa=khoa;
    }
    public String getTrinhDo(){
        return trinhdo;
    }
    public void setTrinhDo(String trinhdo){
        this.trinhdo=trinhdo;
    }
   // @Override
//    public String toString() {
//        return "Account{" + "ma so giang vien=" + maso + ", ho ten giang vien=" + hoten + ", Email=" + email + ", Password=" + password + ", hoc vi=" + chucvu + '}';
//    }
}
