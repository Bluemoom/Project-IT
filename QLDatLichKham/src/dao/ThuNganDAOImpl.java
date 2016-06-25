package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.BenhNhan;
import model.ThuNgan;
import util.HibernateUtil;

public class ThuNganDAOImpl implements ThuNganDAO {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();

	@Override
	public ThuNgan checkLogin(String userName, String passWord) {
		ThuNgan results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT tn FROM ThuNgan tn WHERE tn.userName = :userName and tn.passWord = :passWord";
			Query query = session.createQuery(hql);
			query.setParameter("userName",userName);
			query.setParameter("passWord",passWord);
			results = (ThuNgan) query.list().get(0);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return results;
	}
}
