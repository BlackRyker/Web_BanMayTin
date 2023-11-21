package com.se.entity;

import java.io.Serializable;
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
public class ChiTietDh implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "maDh")
	private DonHang donHang;

	@Id
	@ManyToOne
	@JoinColumn(name = "maSp")
	private SanPham sanPham;

	@Column(name = "soLuong")
	private int soLuong;

	@Column(name = "donGia")
	private BigDecimal donGia;

	@Column(name = "thanhTien")
	private BigDecimal thanhTien;

	public ChiTietDh() {
		super();
	}

	

	public ChiTietDh(DonHang donHang, SanPham sanPham, int soLuong, BigDecimal donGia, BigDecimal thanhTien) {
		super();
		this.donHang = donHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
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

}