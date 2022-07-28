package TypedQuery;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import CachingWithQuery.Student;

public class App_TypedQuery {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		String name="Shilpa";
		TypedQuery typedQuery = session.createQuery("from Student where name= :x");
		typedQuery.setParameter("x", name);
		
		Student s= (Student) typedQuery.getSingleResult();
		System.out.println("stud details : "+s.getName()+" , "+s.getRollno());
	}

}
