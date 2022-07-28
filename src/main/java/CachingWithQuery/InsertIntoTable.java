package CachingWithQuery;

import org.hibernate.Session;

public class InsertIntoTable {
	
	public static void insert(Session session)
	{
		Student s1 = new Student(4, "Nipun", 88888);
		
		session.beginTransaction(); 
		session.update(s1);
		session.getTransaction().commit(); 
	}
	
}
