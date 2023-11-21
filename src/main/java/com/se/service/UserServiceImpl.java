package com.se.service;

import com.se.dao.SanPhamDAO;
import com.se.entity.ChiTietGH;
import com.se.entity.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SanPhamDAO sanPhamDAO;

	@Override
	@Transactional
	public List<SanPham> getAllSanPham() {
		return sanPhamDAO.getAllSanPham();
	}

	@Override
	@Transactional
	public void saveSanPham(SanPham sanPham) {
		sanPhamDAO.saveSanPham(sanPham);
	}

	@Override
	@Transactional
	public SanPham getSanPhamById(int maSp) {
		// TODO Auto-generated method stub
		return sanPhamDAO.getSanPhamById(maSp);
	}

	@Override
	@Transactional
	public void deleteSanPham(int id) {
		sanPhamDAO.deleteSanPham(id);
	}

	@Override
	@Transactional
	public void updateSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		sanPhamDAO.updateSanPham(sanPham);
	}

	@Override
	@Transactional
	public void addSanPham(ChiTietGH chiTietGH) {
		sanPhamDAO.addSanPham(chiTietGH);
	}

	@Override
	@Transactional
	public List<ChiTietGH> getAllChiTietSpInGh(int maGh) {
		return sanPhamDAO.getAllChiTietSpInGh(maGh);
	}

	@Override
	@Transactional
	public void deleteChiTietGh(int maCtGh) {
		sanPhamDAO.deleteChiTietGh(maCtGh);
		
	}

}