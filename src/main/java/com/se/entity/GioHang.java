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
@Table(name = "gioHang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maGh")
    private int maGh;

    @Column(name = "maSp")
    private int maSp;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "giaSp")
    private BigDecimal giaSp;

    @ManyToOne
    @JoinColumn(name = "maTk", nullable = false)
    private TaiKhoan taiKhoan;

    @ManyToOne
    @JoinColumn(name = "maSp", nullable = false)
    private SanPham sanPham;

	public int getMaGh() {
		return maGh;
	}

	public void setMaGh(int maGh) {
		this.maGh = maGh;
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

	public BigDecimal getGiaSp() {
		return giaSp;
	}

	public void setGiaSp(BigDecimal giaSp) {
		this.giaSp = giaSp;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public GioHang(int maGh, int maSp, int soLuong, BigDecimal giaSp, TaiKhoan taiKhoan, SanPham sanPham) {
		super();
		this.maGh = maGh;
		this.maSp = maSp;
		this.soLuong = soLuong;
		this.giaSp = giaSp;
		this.taiKhoan = taiKhoan;
		this.sanPham = sanPham;
	}

	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GioHang [maGh=" + maGh + ", maSp=" + maSp + ", soLuong=" + soLuong + ", giaSp=" + giaSp + ", taiKhoan="
				+ taiKhoan + ", sanPham=" + sanPham + "]";
	}
    
    
}