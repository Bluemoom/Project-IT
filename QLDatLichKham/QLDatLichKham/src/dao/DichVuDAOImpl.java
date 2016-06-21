package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.DichVu;
import util.HibernateUtil;

public class DichVuDAOImpl implements DichVuDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	@Override
	public List<DichVu> getAllDichVu() {
		List<DichVu> results = null;
		try {
			session.getTransaction().begin();
			String hql = "SELECT d FROM DichVu d";
			Query query = session.createQuery(hql);
			results = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return results;
	}

}
