package com.se.service;

import java.util.List;

import com.se.entity.SanPham;

public interface SanPhamService {
	void saveSanPham(SanPham sanPham);
    SanPham getSanPham(int maSp);
    void updateSanPham(SanPham sanPham);
    void deleteSanPham(int maSp);
    List<SanPham> getAllSanPham();
    SanPham getSanPhamById(int maSp);
}
