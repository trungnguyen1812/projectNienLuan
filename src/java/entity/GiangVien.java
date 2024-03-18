/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class GiangVien {
    private String masogv;
    private String hoten;
    private String email;
    private String password;
    private String chucvu;
    public GiangVien(){
        
    }
    public GiangVien(String masogv, String hoten, String email, String password, String chucvu){
        this.masogv=masogv;
        this.hoten=hoten;
        this.email=email;
        this.password=password;
        this.chucvu=chucvu;
    }
    public String getMaSoGV(){
        return masogv;
    }
    public void setMaSoGV(String masogv){
        this.masogv=masogv;
    }
    public String getHoTenGV(){
        return hoten;
    }
    public void setHoTenGV(String hotengv){
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
        return "Account{" + "ma so giang vien=" + masogv + ", ho ten giang vien=" + hoten + ", Email=" + email + ", Password=" + password + ", chuc vu=" + chucvu + '}';
    }
}
