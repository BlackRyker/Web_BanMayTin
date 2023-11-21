package com.se.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "khachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maKh")
    private int maKh;

    @Column(name = "tenKh")
    private String tenKh;

    @Column(name = "email")
    private String email;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private TaiKhoan taiKhoan;

	public int getMaKh() {
		return maKh;
	}

	public void setMaKh(int maKh) {
		this.maKh = maKh;
	}

	public String getTenKh() {
		return tenKh;
	}

	public void setTenKh(String tenKh) {
		this.tenKh = tenKh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}


	public KhachHang(int maKh, String tenKh, String email, String diaChi, String soDienThoai, TaiKhoan taiKhoan) {
		super();
		this.maKh = maKh;
		this.tenKh = tenKh;
		this.email = email;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.taiKhoan = taiKhoan;
	}

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
