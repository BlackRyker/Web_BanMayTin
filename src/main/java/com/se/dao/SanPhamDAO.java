package com.se.dao;

import java.util.List;

import com.se.entity.SanPham;

public interface SanPhamDAO {
    void saveSanPham(SanPham sanPham);
    SanPham getSanPham(int maSp);
    void updateSanPham(SanPham sanPham);
    void deleteSanPham(int maSp);
    List<SanPham> getAllSanPham();
    SanPham getSanPhamById(int maSp);
}