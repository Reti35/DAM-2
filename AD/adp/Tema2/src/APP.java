

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class APP {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    
	    int id = 115;
	    
	    Libro llibre = session.get(Libro.class, id);
		System.out.println(llibre.toString());
	    
	}

}
