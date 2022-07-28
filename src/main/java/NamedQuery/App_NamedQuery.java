package NamedQuery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import General.InsertIntoTable;


public class App_NamedQuery {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Trainee.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//Query namedQuery = session.createNamedQuery("findByName");		//1
		Query namedQuery = session.getNamedQuery("findByName"); //2 - both 1 & 2 are valid
		namedQuery.setParameter("x", "Shilpa");	  
		Student s= (Student) namedQuery.getSingleResult();
		System.out.println("stud details : "+s.getName()+" , "+s.getRollno());
		
		long phone= 9999999;
		namedQuery = session.getNamedQuery("Student.findByphone"); // a good practise is to give entity name.queryname to avoid duplicate name exception
		namedQuery.setParameter("x", phone);	  
		List<Student> li= namedQuery.getResultList();
		System.out.println("stud details : ");
		for(Student m:li)
			System.out.println(m.name+" , "+m.rollno);

		
		  namedQuery = session.getNamedQuery("Trainee.findById");  // a good practise is to give entity name.queryname to avoid duplicate name exception
		  namedQuery.setParameter("x", "Nipun");		  
		  Trainee t= (Trainee) namedQuery.getSingleResult();
		  System.out.println("Trainee details : "+t.getName()+" , "+t.getRollno());
		
	}

}
