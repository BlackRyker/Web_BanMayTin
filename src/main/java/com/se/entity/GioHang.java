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
@Table(name = "gioHang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maGh")
    private int maGh;

    @ManyToOne
    @JoinColumn(name = "maTk", nullable = false)
    private TaiKhoan taiKhoan;

	public int getMaGh() {
		return maGh;
	}

	public void setMaGh(int maGh) {
		this.maGh = maGh;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GioHang(int maGh, TaiKhoan taiKhoan) {
		super();
		this.maGh = maGh;
		this.taiKhoan = taiKhoan;
	}

	@Override
	public String toString() {
		return "GioHang [maGh=" + maGh + ", taiKhoan=" + taiKhoan + "]";
	}
    
    
}