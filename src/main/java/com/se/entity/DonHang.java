package com.se.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "donHang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maDh")
    private int maDh;

    @Column(name = "ngayDat")
    private Date ngayDat;

    @Column(name = "tongTien")
    private BigDecimal tongTien;

    @ManyToOne
    @JoinColumn(name = "maTk", nullable = false)
    private TaiKhoan taiKhoan;

	public int getMaDh() {
		return maDh;
	}

	public void setMaDh(int maDh) {
		this.maDh = maDh;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public BigDecimal getTongTien() {
		return tongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		this.tongTien = tongTien;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public DonHang(int maDh, Date ngayDat, BigDecimal tongTien, TaiKhoan taiKhoan) {
		super();
		this.maDh = maDh;
		this.ngayDat = ngayDat;
		this.tongTien = tongTien;
		this.taiKhoan = taiKhoan;
	}

	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    

}
