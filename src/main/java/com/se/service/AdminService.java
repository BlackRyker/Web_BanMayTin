package com.se.service;

import java.util.List;

import com.se.entity.SanPham;

public interface AdminService {
	List<SanPham> getAllSanPham();
	void saveSanPham(SanPham sanPham);
    SanPham getSanPham(int maSp);
    void updateSanPham(SanPham sanPham);
    void deleteSanPham(int maSp);
    SanPham getSanPhamById(int maSp);
}
