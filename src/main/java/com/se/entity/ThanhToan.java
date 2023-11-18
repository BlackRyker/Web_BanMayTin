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
@Table(name = "thanhToan")
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maTt")
    private int maTt;

    @Column(name = "ngayTt")
    private Date ngayTt;

    @Column(name = "soTien")
    private BigDecimal soTien;

    @Column(name = "phuongThuc")
    private String phuongThuc;

    @ManyToOne
    @JoinColumn(name = "maDh", nullable = false)
    private DonHang donHang;

	public int getMaTt() {
		return maTt;
	}

	public void setMaTt(int maTt) {
		this.maTt = maTt;
	}

	public Date getNgayTt() {
		return ngayTt;
	}

	public void setNgayTt(Date ngayTt) {
		this.ngayTt = ngayTt;
	}

	public BigDecimal getSoTien() {
		return soTien;
	}

	public void setSoTien(BigDecimal soTien) {
		this.soTien = soTien;
	}

	public String getPhuongThuc() {
		return phuongThuc;
	}

	public void setPhuongThuc(String phuongThuc) {
		this.phuongThuc = phuongThuc;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

	public ThanhToan(int maTt, Date ngayTt, BigDecimal soTien, String phuongThuc, DonHang donHang) {
		super();
		this.maTt = maTt;
		this.ngayTt = ngayTt;
		this.soTien = soTien;
		this.phuongThuc = phuongThuc;
		this.donHang = donHang;
	}

	public ThanhToan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ThanhToan [maTt=" + maTt + ", ngayTt=" + ngayTt + ", soTien=" + soTien + ", phuongThuc=" + phuongThuc
				+ ", donHang=" + donHang + "]";
	}
    
    
}
