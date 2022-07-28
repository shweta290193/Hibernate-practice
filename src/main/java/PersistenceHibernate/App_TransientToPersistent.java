package PersistenceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App_TransientToPersistent {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//Student s= new Student(8, "Shilpa", 77777777);
		Student s=session.get(Student.class, 8);
		Transaction t = session.beginTransaction();		
		//session.persist(s);
		s.setPhone(33333333);		//this will get updated in table without doing session.update because after save/persist(), the object has become persistent and any change in object will reflect in DB		  
		 		
		t.commit();
		
	}

}
