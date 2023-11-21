package com.se.service;

import java.util.List;

import com.se.entity.ChiTietGH;
import com.se.entity.SanPham;

public interface UserService {
	List<SanPham> getAllSanPham();

	void saveSanPham(SanPham sanPham);

//  add sp trong gio hang
	void addSanPham(ChiTietGH chiTietGH);

	List<ChiTietGH> getAllChiTietSpInGh(int maGh);

//  update so luong sp trong gio hang
	void updateSanPham(SanPham sanPham);

//  xoa sp trong gio hang
	void deleteSanPham(int maSp);
	

    void deleteChiTietGh(int maCtGh);

//  get detail sp
	SanPham getSanPhamById(int maSp);
}
