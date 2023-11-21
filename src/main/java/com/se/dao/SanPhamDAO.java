package com.se.dao;

import java.util.List;

import com.se.entity.ChiTietGH;
import com.se.entity.SanPham;

public interface SanPhamDAO {
    void saveSanPham(SanPham sanPham);
    SanPham getSanPham(int maSp);
	List<ChiTietGH> getAllChiTietSpInGh(int maGh);
    void addSanPham(ChiTietGH chiTietGH);
    void updateSanPham(SanPham sanPham);
    void deleteSanPham(int maSp);
    void deleteChiTietGh(int maCtGh);
    List<SanPham> getAllSanPham();
    SanPham getSanPhamById(int maSp);
}