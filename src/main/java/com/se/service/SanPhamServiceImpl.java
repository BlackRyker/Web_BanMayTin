package com.se.service;

import com.se.dao.SanPhamDAO;
import com.se.entity.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamDAO sanPhamDAO;

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamDAO.getAllSanPham();
    }

    @Override
    public void saveSanPham(SanPham sanPham) {
        sanPhamDAO.saveSanPham(sanPham);
    }

    @Override
    public void deleteSanPham(int id) {
        sanPhamDAO.deleteSanPham(id);
    }

	@Override
	public SanPham getSanPham(int maSp) {
		// TODO Auto-generated method stub
		return sanPhamDAO.getSanPham(maSp);
	}

	@Override
	public void updateSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		sanPhamDAO.updateSanPham(sanPham);
	}

	@Override
	public SanPham getSanPhamById(int maSp) {
		// TODO Auto-generated method stub
		return sanPhamDAO.getSanPhamById(maSp);
	}

}