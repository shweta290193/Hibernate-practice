package CachingWithQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import RelationalMapping_OneToMany.Employee;
import RelationalMapping_OneToMany.Laptop;


public class App_CachingWithQuery {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session1 = sf.openSession();
		
		//InsertIntoTable.insert(session1);
		
		/** fetching data via Query and not session.get() */
		//Query q1 = session1.createQuery("from Student where rollno= ?1");
		//q1.setInteger(1, 1);
		
		//Query q1 = session1.createQuery("from Student where name= \'Shweta\' ");
		Query q1 = session1.createQuery("from Student where name= ?1");		
		q1.setString(1, "Shweta");
		q1.setCacheable(true);
		Student s= (Student) q1.uniqueResult();  //if there is going to be more than 1 row in resultset, then use List li =  q1.list();
		//System.out.println("****Printing student fetched from db.. ");
		System.out.println(s.name+" , "+s.rollno);
		
		Query q2 = session1.createQuery("from Student where rollno= ?1");		//here ?1 means unknown #1 which will be set by q2.setInteger(1, 1);
		q2.setInteger(1, 1);
		q2.setCacheable(true);
		s= (Student) q2.uniqueResult();  //if there is going to be more than 1 row in resultset, then use List li =  q1.list();
		//System.out.println("****Printing student fetched from db.. ");
		System.out.println(s.name+" , "+s.rollno);
		
		Session session3 = sf.openSession();
		Query q3 = session3.createQuery("from Student where rollno= ?1");	//this query will not be fetched from data but 2nd level cache	
		q3.setInteger(1, 1);
		q3.setCacheable(true);
		s= (Student) q3.uniqueResult();  //if there is going to be more than 1 row in resultset, then use List li =  q1.list();
		//System.out.println("****Printing student fetched from db.. ");
		System.out.println(s.name+" , "+s.rollno);

	}

}
