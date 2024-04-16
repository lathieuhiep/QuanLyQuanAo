package com.techja.quanlyquanao.main;

import com.techja.quanlyquanao.sanpham.Ao;
import com.techja.quanlyquanao.sanpham.Quan;
import com.techja.quanlyquanao.sanpham.SanPham;

public class Main {
    public static void main(String[] args) {
        // them sp quan
        SanPham sp1 = new Quan(
                "Quan 001",
                "Quan",
                "Quan bo",
                "ahihi",
                "XL",
                250,
                10,
                "30cm",
                "150cm"
        );
        System.out.println("Thong tin sp quan:");
        sp1.inTT();

        System.out.println();

        // them sp ao
        SanPham sp2 = new Ao(
                "Ao 001",
                "Ao",
                "Ao so mi",
                "ahihi",
                "XL",
                300,
                12,
                "30cm",
                "92cm",
                "95cm",
                "80cm"
        );
        System.out.println("Thong tin sp ao:");
        sp2.inTT();
    }
}
