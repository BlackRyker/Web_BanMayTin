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
@Table(name = "sanPham")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maSp")
	private int maSp;

	@Column(name = "tenSp")
	private String tenSp;

	@Column(name = "giaSp")
	private BigDecimal giaSp;

	@Column(name = "moTaSp")
	private String moTaSp;

	@Column(name = "soLuong")
	private int soLuong;

	@Column(name = "anhSp")
	private String anhSp;

	@ManyToOne
	@JoinColumn(name = "maLoai", nullable = false)
	private LoaiSanPham loaiSanPham;

	public SanPham() {
		super();
	}

	public SanPham(int maSp, String tenSp, BigDecimal giaSp, String moTaSp, int soLuong, String anhSp,
			LoaiSanPham loaiSanPham) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.giaSp = giaSp;
		this.moTaSp = moTaSp;
		this.soLuong = soLuong;
		this.anhSp = anhSp;
		this.loaiSanPham = loaiSanPham;
	}

	public int getMaSp() {
		return maSp;
	}

	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public BigDecimal getGiaSp() {
		return giaSp;
	}

	public void setGiaSp(BigDecimal giaSp) {
		this.giaSp = giaSp;
	}

	public String getMoTaSp() {
		return moTaSp;
	}

	public void setMoTaSp(String moTaSp) {
		this.moTaSp = moTaSp;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getAnhSp() {
		return anhSp;
	}

	public void setAnhSp(String anhSp) {
		this.anhSp = anhSp;
	}

	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	

}
