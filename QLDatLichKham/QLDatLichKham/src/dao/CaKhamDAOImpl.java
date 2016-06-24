package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.CaKham;
import model.PhongKham;
import util.HibernateUtil;

public class CaKhamDAOImpl implements CaKhamDAO {

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	@Override
	public List<CaKham> findCaKhamByLichBieu(Date ngayLam, int buoiLam, String phongKhamId) {
		List<CaKham> results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT c FROM CaKham c, LichBieu l WHERE c.lichBieu_Id = l.lichBieu_Id AND l.ngayLam = :ngayLam AND l.buoiLam = :buoiLam AND l.phongKham_Id = :phongKhamId AND c.trangThai = 1 AND rownum = 1";
			Query query = session.createQuery(hql);
			query.setParameter("ngayLam", ngayLam);
			query.setParameter("buoiLam", buoiLam);
			query.setParameter("phongKhamId", phongKhamId);
			results = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}
	@Override
	public CaKham findCaKhamById(int caKhamId) {
		CaKham results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT c FROM CaKham c WHERE c.caKham_Id = :caKhamId";
			Query query = session.createQuery(hql);
			query.setParameter("caKhamId", caKhamId);
			results = (CaKham) query.list().get(0);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}
	@Override
	public int updateCaKham(int caKhamId, int trangThai) {
		int result = 0;
		session.getTransaction().begin();
		try {
			String hql = "UPDATE CaKham SET trangThai = :trangThai WHERE caKham_Id = :caKhamId";
			Query query = session.createQuery(hql);
			query.setParameter("trangThai", trangThai);
			query.setParameter("caKhamId", caKhamId);
			result = query.executeUpdate();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return result;
	}
	@Override
	public List<CaKham> findCaKhamByBacSi(Date ngayLam, int buoiLam, int bacSiId) {
		List<CaKham> results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT c FROM CaKham c, LichBieu l WHERE c.lichBieu_Id = l.lichBieu_Id AND l.ngayLam = :ngayLam AND l.buoiLam = :buoiLam AND l.bacSi_Id = :bacSiId AND c.trangThai = 1 AND rownum = 1";
			Query query = session.createQuery(hql);
			query.setParameter("ngayLam", ngayLam);
			query.setParameter("buoiLam", buoiLam);
			query.setParameter("bacSiId", bacSiId);
			results = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}

}
