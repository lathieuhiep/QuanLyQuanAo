package com.techja.quanlyquanao.quanly;

import com.techja.quanlyquanao.giohang.GioHang;
import com.techja.quanlyquanao.khachhang.KhachHang;
import com.techja.quanlyquanao.sanpham.Ao;
import com.techja.quanlyquanao.sanpham.Quan;
import com.techja.quanlyquanao.sanpham.SanPham;

public class QuanLy {
    SanPham dsSanPham[];
    KhachHang dsKH[];

    public void themSP(SanPham sanPham) {
        // thêm quan vào dsQuan
    }

    public void xoaSP(String maSPXoa) {
        // duyệt qua từng Quan trong dsQuan, nếu dsQuan[i]->ma == maSPXoa
        // thì xóa khỏi dsQuan
        // duyệt qua từng Ao trong dsAo, nếu dsAo[i]->ma == maSPXoa
        // thì xóa khỏi dsAo
    }

    public SanPham[] timKiemSanPham(String tenSP) {
        SanPham[] kq = null;

        // tim kiem dsSanPham neu dsSanPham->getTen() == tenSP
        // thì thêm vào kq

        return kq;
    }

    public KhachHang[] timKiemKHTheoTen(String tenKH) {
        KhachHang[] dsKQ = null;

        // duyệt từng KhachHang trong dsKhachHang, nếu dsKhachHang[i] -> ten == tenKH
        // thì thêm vào dsKQ

        return dsKQ;
    }

    public KhachHang[] timKiemKHTheoSDT(String sdtKH) {
        KhachHang[] dsKQ = null;

        // duyệt từng KhachHang trong dsKhachHang, nếu dsKhachHang[i]->sdt == sdtKH
        // thì thêm vào dsKQ

        return dsKQ;
    }

    public void thongKeSPBanTheoLoaiSP(String loaiSP) {
        // duyệt từng KhachHang trong dsKhachHang

        // lấy dsQuan ứng với mỗi KhachHang
        // Quan[] dsQuan = dsKH[i]->gioHang->dsQuan
        // Ao[] dsAo = dsKH[i]->gioHang->dsAo

        // duyệt từng Quan trong dsQuan, nếu dsQuan[i]->loai == loaiSP
        // thì dsQuan[i]->inTT()

        // duyệt từng Ao trong dsAo, nếu dsAo[i]->loai == loaiSP
        // thì dsAo[i]->inTT()
    }

    public void hienThiDoanhThuTheoNgay(String ngay) {
        int soTien = 0;

        // duyệt từng KhachHang trong dsKhachHang
        // nếu dsKH[i]->gioHang->thoiGianTao == ngay
        // thì: soTien += dsKH[i]->gioHang->tongThanhToan()

        System.out.println("Tổng doanh thu " + ngay + "=" + soTien);
    }

    public void capNhatTonKho(GioHang gioHang) {
        // dựa vào gioHang->dsQuan, gioHang->dsAo
        // quản lý sẽ cập nhật lại số lượng dsQuan, dsAo trong kho

        int tongSLQuanBan = 0;
        // duyệt từng Quan trong gioHang->dsQuan
        // tongSLQuanBan += gioHang->dsQuan[i]->soLuong

        int tongSLAoBan = 0;
        // duyệt từng Ao trong gioHang->dsAo
        // tongSLAoBan += gioHang->dsAo[i]->soLuong

        // cập nhật lại số lượng Quan = số lượng hiện tại - tongSLQuanBan
        // cập nhật lại số lượng Ao = số lượng hiện tại - tongSLAoBan

    }

    public void themKH(KhachHang khachHang) {
        // đưa them kh vào dsKH
    }

    public void xemDSSanPham() {
        // duyệt từng Quan trong dsQuan, nếu dsQuan[i]->inTT()
        // duyệt từng Ao trong dsAo, nếu dsAo[i]->inTT()
    }
}
