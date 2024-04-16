package com.techja.quanlyquanao.khachhang;

import com.techja.quanlyquanao.giohang.GioHang;
import com.techja.quanlyquanao.quanly.QuanLy;
import com.techja.quanlyquanao.sanpham.SanPham;

public class KhachHang {
    private String ma, hoTen, sdt, diaChi, email;
    SanPham sanPham;
    GioHang gioHang;

    public KhachHang(String ma, String hoTen, String sdt, String diaChi, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;

        // khởi tạo giỏ hàng
        gioHang = new GioHang();
    }

    void inTT() {
        System.out.println("Thông tin KH:");
        System.out.println("Mã: " + ma);
        System.out.println("Tên: " + hoTen);
        System.out.println("SĐT: " + sdt);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Email: " + email);

        gioHang.inTT();
    }

    void themSPVaoGH(SanPham sanPham) {
        gioHang.themSP(sanPham);
    }

    void xoaSP(String maSPXoa) {
        gioHang.xoaSP(maSPXoa);
    }

    void xemTTGioHang() {
        System.out.println("Thông tin giỏ hàng: ");
        gioHang.inTT();
    }

    void thanhToanGioHang(QuanLy quanLy) {
        gioHang.thanhToan(quanLy);

        // Thông tin khách hàng sẽ được lưu lại
        // trong danh sách khách hàng để quản lý.
        quanLy.themKH(this);
    }

    SanPham[] timKiemSanPhamTrenShop(String ten, QuanLy quanLy) {
        SanPham[] kq = quanLy.timKiemSanPham(ten);

        // làm thế nào để tìm kiếm trong danh sách quần của QuanLy
        return kq;
    }

    void xemDSSanPham(QuanLy quanLy) {
        quanLy.xemDSSanPham();
    }
}
