package com.se.service;

import java.util.List;

import com.se.entity.SanPham;

public interface SanPhamService {
	List<SanPham> getAllSanPham();

	void saveSanPham(SanPham sanPham);

//  update so luong sp trong gio hang
	void updateSanPham(SanPham sanPham);

//  xoa sp trong gio hang
	void deleteSanPham(int maSp);

//  get detail sp
	SanPham getSanPhamById(int maSp);
}
