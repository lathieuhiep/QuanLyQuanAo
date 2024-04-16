package com.techja.quanlyquanao.sanpham;

public class Quan extends SanPham {
    String rongTui, daiQuan;

    public Quan(String ma, String loai, String ten, String moTa, String size, int soLuong, int gia, String rongTui, String daiQuan) {
        super(ma, loai, ten, moTa, size, soLuong, gia);
        this.rongTui = rongTui;
        this.daiQuan = daiQuan;
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Rộng túi: " + rongTui);
        System.out.println("Dài quần: " + daiQuan);
    }
}
