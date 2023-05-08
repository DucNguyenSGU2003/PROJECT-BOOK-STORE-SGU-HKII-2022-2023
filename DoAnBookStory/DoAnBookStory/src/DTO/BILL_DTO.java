/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class BILL_DTO {
    private String maHD;
    private String maNV;
    private String maKH;
    private String ngayLap;
    private float ThanhTien;
    private boolean TrangThai;
    
    public BILL_DTO()
    {
    }

    public BILL_DTO(String maHD, String maNV, String maKH, String ngayLap, float ThanhTien, boolean TrangThai) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayLap = ngayLap;
        this.ThanhTien = ThanhTien;
        this.TrangThai = TrangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "BILL_DTO{" + "maHD=" + maHD + ", maNV=" + maNV + ", maKH=" + maKH + ", ngayLap=" + ngayLap + ", ThanhTien=" + ThanhTien + ", TrangThai=" + TrangThai + '}';
    }

    
    
    
    
}
