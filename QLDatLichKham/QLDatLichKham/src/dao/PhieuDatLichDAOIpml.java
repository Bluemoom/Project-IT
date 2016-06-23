package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.PhieuDatLich;
import model.PhongKham;
import util.HibernateUtil;

public class PhieuDatLichDAOIpml implements PhieuDatLichDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	@Override
	public int addNewPhieuDatLich(PhieuDatLich phieuDatLich) {
		session.getTransaction().begin();
		try {
			session.save(phieuDatLich);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return 0;
	}

	@Override
	public int updatePhieuDatLich(PhieuDatLich phieuDatLich) {
		session.getTransaction().begin();
		try {
			session.update(phieuDatLich);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return 0;
	}

	@Override
	public int deletePhieuDatLich(int phieuDatLichId) {
		int result = 0;
		session.getTransaction().begin();
		try {
			String hql = "UPDATE PhieuDatLich SET trangThai = 0 WHERE phieuDatLich_Id = :phieuDatLichId";
			Query query = session.createQuery(hql);
			query.setParameter("phieuDatLichId", phieuDatLichId);
			result = query.executeUpdate();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return result;
	}

	@Override
	public List<PhieuDatLich> findPhieuDatLichByBenhNhan(int benhNhanId) {
		List<PhieuDatLich> results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT p FROM PhieuDatLich p WHERE p.benhNhan_Id = :benhNhanId";
			Query query = session.createQuery(hql);
			query.setParameter("benhNhanId", benhNhanId);
			results = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}

	@Override
	public PhieuDatLich findLastestPhieuDatLichByBenhNhan(int benhNhanId) {
		PhieuDatLich results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT p FROM PhieuDatLich p WHERE p.benhNhan_Id = :benhNhanId AND rownum =1 ORDER BY p.phieuDatLich_Id DESC";
			Query query = session.createQuery(hql);
			query.setParameter("benhNhanId", benhNhanId);
			results = (PhieuDatLich) query.list().get(0);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}

	@Override
	public List<Object[]> findLichKhamByBenhNhan(int benhNhanId) {
		List<Object[]> results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT p,c,l,pk,b FROM PhieuDatLich p, CaKham c, LichBieu l, PhongKham pk, BacSi b"
            + " WHERE p.caKham_Id = c.caKham_Id AND c.lichBieu_Id = l.lichBieu_Id AND l.phongKham_Id = pk.phongKham_Id AND l.bacSi_Id = b.bacSi_Id AND p.trangThai = 1 AND p.benhNhan_Id = :benhNhanId";
			Query query = session.createQuery(hql);
			query.setParameter("benhNhanId", benhNhanId);
			results = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}

	@Override
	public PhieuDatLich findPhieuDatLichById(int phieuDatLichId) {
		PhieuDatLich results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT p FROM PhieuDatLich p WHERE p.phieuDatLich_Id = :phieuDatLichId";
			Query query = session.createQuery(hql);
			query.setParameter("phieuDatLichId", phieuDatLichId);
			results = (PhieuDatLich) query.list().get(0);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
	          session.getTransaction().rollback();
		} 
		return results;
	}

}
