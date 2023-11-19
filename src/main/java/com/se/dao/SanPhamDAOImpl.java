package com.se.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.entity.SanPham;

@Repository
public class SanPhamDAOImpl implements SanPhamDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void saveSanPham(SanPham sanPham) {
		sessionFactory.getCurrentSession().saveOrUpdate(sanPham);
	}

	@Override
	public SanPham getSanPham(int maSp) {
		return sessionFactory.getCurrentSession().get(SanPham.class, maSp);
	}

	@Override
	@Transactional
	public void updateSanPham(SanPham sanPham) {
		sessionFactory.getCurrentSession().update(sanPham);
	}

	@Override
	@Transactional
	public void deleteSanPham(int maSp) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SanPham> theQuery = currentSession.createQuery("delete from SanPham where id=:maSp");
		theQuery.setParameter("maSp", maSp);
		theQuery.executeUpdate();
	}

	@Override
	public List<SanPham> getAllSanPham() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SanPham> theQuery = currentSession.createQuery("from SanPham order by tenSp", SanPham.class);
		List<SanPham> sanPhams = theQuery.getResultList();
		return sanPhams;
	}

	@Override
	public SanPham getSanPhamById(int maSp) {
		Session currentSession = sessionFactory.getCurrentSession();
		SanPham sanPham = currentSession.get(SanPham.class, maSp);
		return sanPham;
	}
}
