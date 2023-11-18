package com.se.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaiSanPham")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maLoai")
    private int maLoai;

    @Column(name = "tenLoai")
    private String tenLoai;

    @OneToMany(mappedBy = "loaiSanPham")
    private List<SanPham> sanPham;

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<SanPham> getSanPham() {
		return sanPham;
	}

	public void setSanPham(List<SanPham> sanPham) {
		this.sanPham = sanPham;
	}

	public LoaiSanPham(int maLoai, String tenLoai, List<SanPham> sanPham) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.sanPham = sanPham;
	}

	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoaiSanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", sanPham=" + sanPham + "]";
	}
    
    
}