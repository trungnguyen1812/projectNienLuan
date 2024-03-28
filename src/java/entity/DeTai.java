/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class DeTai {
    private String madetai;
    private String tendetai;
    private String noidung;
    public DeTai(){
        
    }
    public DeTai( String madetai, String tendetai, String noidung){
        this.madetai=madetai;
        this.tendetai=tendetai;
        this.noidung=noidung;
        
    }
    public String getMaDeTai(){
        return madetai;
    }
    public void setMaDeTai(String madetai){
        this.madetai=madetai;
    }
    public String getTenDeTai(){
        return tendetai;
    }
    public void setTenDeTai(String tendetai){
        this.tendetai=tendetai;
    }
    public String getNoiDung(){
        return noidung;
    }
    public void setNoiDung(String noidung){
        this.noidung=noidung;
    }
            
}
