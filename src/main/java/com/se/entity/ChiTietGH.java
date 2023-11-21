package com.se.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chiTietGh")
public class ChiTietGH implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "maGh", nullable = false)
	private GioHang gioHang;

	@Id
	@ManyToOne
	@JoinColumn(name = "maSp", nullable = false)
	private SanPham sanPham;

	@Column(name = "soLuong")
	private int soLuong;

	public ChiTietGH() {
		super();
	}

	public ChiTietGH(GioHang gioHang, SanPham sanPham, int soLuong) {
		super();
		this.gioHang = gioHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}

	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
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

	

}