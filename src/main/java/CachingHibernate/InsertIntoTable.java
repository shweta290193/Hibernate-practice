package CachingHibernate;

import org.hibernate.Session;

public class InsertIntoTable {
	
	public static void insert(Session session)
	{
		/*Employee_SLC e1= new Employee_SLC(101,"Sonal",4000000);		
		Employee_SLC e2= new Employee_SLC(102,"Shubham",4000000);
		
		/*Employee_FLC e1= new Employee_FLC(101,"Sonal",4000000);		
		Employee_FLC e2= new Employee_FLC(102,"Shubham",4000000);*/
		//Employee_SLC e3= new Employee_SLC(103,"nishu",4000000);
		//Employee_SLC e4= new Employee_SLC(104,"shweta",4000000);
		//Employee_SLC e5= new Employee_SLC(105,"nipun",4000000);
		Employee_SLC e6= new Employee_SLC(106,"Shilpa",4000000);
		
		session.beginTransaction(); 
		/*
		 * session.save(e1); session.save(e2);
		 */
	    session.save(e6);
		//session.update(e6);
	    session.getTransaction().commit(); 
	}
	
}
