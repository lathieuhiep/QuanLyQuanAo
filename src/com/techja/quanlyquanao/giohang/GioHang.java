package com.techja.quanlyquanao.giohang;

import com.techja.quanlyquanao.quanly.QuanLy;
import com.techja.quanlyquanao.sanpham.Ao;
import com.techja.quanlyquanao.sanpham.Quan;
import com.techja.quanlyquanao.sanpham.SanPham;

import java.util.Calendar;

public class GioHang {
    private static final String CHUA_THANH_TOAN = "chưa thanh toán";
    private static final String DA_THANH_TOAN = "đã thanh toán";

    String thoiGianTao, trangThai;
    SanPham dsSanPham[];
    Quan[] dsQuan;
    Ao[] dsAo;

    public GioHang() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        thoiGianTao = String.format("%s/%s/%s", day, month, year);
        trangThai = CHUA_THANH_TOAN;
    }

    public void inTT() {
        System.out.println("Thời gian tạo: " + thoiGianTao);
        System.out.println("Trạng thái: " + trangThai);

        // duyệt dsSanPham, sau đó sai dsSanPham[i] -> inTT()
    }


    public void themSP(SanPham sanPham) {
        // them vao dsSanPham
    }

    public void xoaSP(String maSPXoa) {
        // duyệt dsSanPham, nếu dsSanPham[i]->getMa() == maSPXoa
        // thì xóa khỏi dsSanPham
    }

    public SanPham[] timKiemSanPham(String tenSP) {
        SanPham[] kq = null;

        // tim kiem dsSanPham neu dsSanPham->getTen() == tenSP
        // thì thêm vào kq

        return kq;
    }

    public void thanhToan(QuanLy quanLy) {
        int soTienTT = 0;
        // duyệt dsSanPham, sau đó sai dsQuan[i]->inTT()
        // soTienTT += dsQuan[i]->gia
        // duyệt dsAo, sau đó sai dsAo[i]->inTT()
        // soTienTT += dsAo[i]->gia

        System.out.println("Số tiền TT: " + soTienTT);
        trangThai = DA_THANH_TOAN;

        // đồng thời số lượng của từng sản phẩm tương ứng trong
        // danh sách sản phẩm bán của người quản lí sẽ được cập nhật lại.

        quanLy.capNhatTonKho(this); // this là GioHang
    }

    public int tongThanhToan() {
        int soTienTT = 0;
        // duyệt dsQuan, sau đó sai dsQuan[i]->inTT()
        // soTienTT += dsQuan[i]->gia
        // duyệt dsAo, sau đó sai dsAo[i]->inTT()
        // soTienTT += dsAo[i]->gia

        return soTienTT;
    }
}
