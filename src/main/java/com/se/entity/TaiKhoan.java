package com.se.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "taiKhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maTk")
    private int maTk;

    @Column(name = "tenDangNhap")
    private String tenDangNhap;

    @Column(name = "matKhau")
    private String matKhau;

    @OneToOne
    @JoinColumn(name = "maKh", referencedColumnName = "maKh")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "taiKhoan")
    private List<DonHang> donHang;

	public int getMaTk() {
		return maTk;
	}

	public void setMaTk(int maTk) {
		this.maTk = maTk;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public List<DonHang> getDonHang() {
		return donHang;
	}

	public void setDonHang(List<DonHang> donHang) {
		this.donHang = donHang;
	}

	public TaiKhoan(int maTk, String tenDangNhap, String matKhau, KhachHang khachHang, List<DonHang> donHang) {
		super();
		this.maTk = maTk;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.khachHang = khachHang;
		this.donHang = donHang;
	}

	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}


    
}