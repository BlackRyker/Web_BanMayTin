package com.se.entity;

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
public class ChiTietGH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maCtgh")
    private int maCTGH;

    @Column(name = "soLuong")
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "maGh", nullable = false)
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "maSp", nullable = false)
    private SanPham sanPham;

	public int getMaCTGH() {
		return maCTGH;
	}

	public void setMaCTGH(int maCTGH) {
		this.maCTGH = maCTGH;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
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

	public ChiTietGH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChiTietGH(int maCTGH, int soLuong, GioHang gioHang, SanPham sanPham) {
		super();
		this.maCTGH = maCTGH;
		this.soLuong = soLuong;
		this.gioHang = gioHang;
		this.sanPham = sanPham;
	}

	@Override
	public String toString() {
		return "ChiTietGH [maCTGH=" + maCTGH + ", soLuong=" + soLuong + ", gioHang=" + gioHang + ", sanPham=" + sanPham
				+ "]";
	}
    
    
}