package com.techja.quanlyquanao.sanpham;

public class Ao extends SanPham {
    String daiTay, vongNguc, vongEo, vongMong;

    public Ao(String ma, String loai, String ten, String moTa, String size, int soLuong, int gia, String daiTay, String vongNguc, String vongEo, String vongMong) {
        super(ma, loai, ten, moTa, size, soLuong, gia);
        this.daiTay = daiTay;
        this.vongNguc = vongNguc;
        this.vongEo = vongEo;
        this.vongMong = vongMong;
    }

    @Override
    public void inTT() {
        super.inTT();

        System.out.println("Dài tay: " + daiTay);
        System.out.println("Vòng ngực: " + vongNguc);
        System.out.println("Vòng eo: " + vongEo);
        System.out.println("Vòng mông: " + vongMong);
    }
}
