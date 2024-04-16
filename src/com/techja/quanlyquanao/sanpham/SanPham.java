package com.techja.quanlyquanao.sanpham;

import com.techja.quanlyquanao.ichung.Ichung;

public abstract class SanPham implements Ichung {
    private String ma, loai, ten, moTa, size;
    private int soLuong, gia;

    public SanPham(String ma, String loai, String ten, String moTa, String size, int soLuong, int gia) {
        this.ma = ma;
        this.loai = loai;
        this.ten = ten;
        this.moTa = moTa;
        this.size = size;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    @Override
    public void inTT() {
        System.out.println("Mã: " + ma);
        System.out.println("Loại: " + loai);
        System.out.println("Tên: " + ten);
        System.out.println("Mô tả: " + moTa);
        System.out.println("Size: " + size);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Giá tiền: " + gia);
    }

    public String getMa() {
        return ma;
    }

    public String getLoai() {
        return loai;
    }

    public String getTen() {
        return ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getSize() {
        return size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGia() {
        return gia;
    }
}
