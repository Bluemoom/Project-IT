package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.BenhNhan;
import model.DichVu;
import util.HibernateUtil;

public class BenhNhanDAOImpl implements BenhNhanDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	@Override
	public BenhNhan findBenhNhanById(int benhNhanId) {
		BenhNhan results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT b FROM BenhNhan b WHERE b.benhNhan_Id = :benhNhanId";
			Query query = session.createQuery(hql);
			query.setParameter("benhNhanId", benhNhanId);
			results = (BenhNhan) query.list().get(0);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return results;
	}

}
