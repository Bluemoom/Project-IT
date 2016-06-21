package util;

import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtil {
//	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	   private static SessionFactory buildSessionFactory() {
	       // Tạo đối tượng cấu hình.
	       Configuration configuration = new Configuration();
	       // Mặc định nó sẽ đọc cấu hình trong file hibernate.cfg.xml
	       // Bạn có thể chỉ định rõ file nếu muốn:
	       // configuration.configure("hiberante.cfg.xml");
	       configuration.configure();
	 
	       ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	               configuration.getProperties()). buildServiceRegistry();
	 
	       // Tạo đối tượng SessionFactory
	       SessionFactory sessionFactory = configuration
	               .buildSessionFactory(serviceRegistry);
	       return sessionFactory;
	   }
	 
	   public static SessionFactory getSessionFactory() {
	       return sessionFactory;
	   }
	 
	   public static void shutdown() {
	       // Close caches and connection pools
	       // Giải phóng cache và Connection Pools.
	       getSessionFactory().close();
	   }
}
