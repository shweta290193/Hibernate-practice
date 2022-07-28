package General;
import org.hibernate.Session;

import CachingHibernate.Employee_SLC;
import NamedQuery.Trainee;

public class InsertIntoTable {

	public static void insert(Session session)
	{
		/*
		 * Student s1 = new Student(4, "Nipun", 88888);
		 * 
		 * session.beginTransaction(); session.update(s1);
		 * session.getTransaction().commit();
		 */ 

		/*
		 * Trainee t1 = new Trainee(1, "Nipun", 88888);
		 * 
		 * session.beginTransaction(); session.save(t1);
		 * session.getTransaction().commit();
		 */
		
		Employee_SLC t1 = new Employee_SLC(104, "Tani", 4000);
		
		session.beginTransaction(); 
		session.save(t1);
		session.getTransaction().commit();
	
	}

}
