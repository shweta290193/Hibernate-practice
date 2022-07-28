package PersistenceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_DetachedToPersistent {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Student s=session.get(Student.class, 8);
		Transaction t = session.beginTransaction();		
		s.setPhone(44444);			  
		 		
		t.commit();
		
		//detaching the entity
		session.detach(s);
		 s.setPhone(111111);
		 System.out.println("s.getPhone in app is : "+s.getPhone());
		 s=session.get(Student.class, 8);
		 System.out.println("but s.getPhone in DB is : "+s.getPhone());
		 
		 //reattaching the entity
		 Transaction t2 = session.beginTransaction();	
		 s.setPhone(111111);
		 session.update(s);
		 t2.commit();
		 System.out.println("s.getPhone in DB is now after reattaching : "+s.getPhone()); 
	}

}
