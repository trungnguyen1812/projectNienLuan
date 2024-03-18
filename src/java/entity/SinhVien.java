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
     private String masosv;
    private String hoten;
    private String email;
    private String password;
    private String hocvi;
    public SinhVien(){
        
    }
    public SinhVien(String masosv, String hoten, String email, String password, String hocvi){
        this.masosv=masosv;
        this.hoten=hoten;
        this.email=email;
        this.password=password;
        this.hocvi=hocvi;
    }
    public String getMaSoSV(){
        return masosv;
    }
    public void setMaSoSV(String masosv){
        this.masosv=masosv;
    }
    public String getHoTenSV(){
        return hoten;
    }
    public void setHoTenSV(String hoten){
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
    public String getHocVi(){
        return hocvi;
    }
    public void setHocVi(String hocvi){
        this.hocvi=hocvi;
    }
    @Override
    public String toString() {
        return "Account{" + "ma so giang vien=" + masosv + ", ho ten giang vien=" + hoten + ", Email=" + email + ", Password=" + password + ", hoc vi=" + hocvi + '}';
    }
    
}
