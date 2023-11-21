package com.se.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.entity.GioHang;

public class GioHangDaoImpl implements GioHangDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public GioHangDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GioHang getGioHangByMaTk(int maTk) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<GioHang> theQuery = currentSession.createQuery("from GioHang where maTk = :maTk order by maTk",
				GioHang.class);
		theQuery.setParameter("maTk", maTk);
		List<GioHang> sanPhams = theQuery.getResultList();
		return sanPhams.get(0);
	}

}
