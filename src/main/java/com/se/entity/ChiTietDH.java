package com.se.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chiTietDh")
public class ChiTietDH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maDh")
    private int maDh;

    @Column(name = "maSp")
    private int maSp;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "donGia")
    private BigDecimal donGia;

    @Column(name = "thanhTien")
    private BigDecimal thanhTien;

    @ManyToOne
    @JoinColumn(name = "maDh", nullable = false)
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "maSp", nullable = false)
    private SanPham sanPham;

	public int getMaDh() {
		return maDh;
	}

	public void setMaDh(int maDh) {
		this.maDh = maDh;
	}

	public int getMaSp() {
		return maSp;
	}

	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getDonGia() {
		return donGia;
	}

	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}

	public BigDecimal getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(BigDecimal thanhTien) {
		this.thanhTien = thanhTien;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public ChiTietDH(int maDh, int maSp, int soLuong, BigDecimal donGia, BigDecimal thanhTien, DonHang donHang,
			SanPham sanPham) {
		super();
		this.maDh = maDh;
		this.maSp = maSp;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
		this.donHang = donHang;
		this.sanPham = sanPham;
	}

	public ChiTietDH() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ChiTietDH [maDh=" + maDh + ", maSp=" + maSp + ", soLuong=" + soLuong + ", donGia=" + donGia
				+ ", thanhTien=" + thanhTien + ", donHang=" + donHang + ", sanPham=" + sanPham + "]";
	}
    
    
}
