package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import CachingHibernate.Employee_SLC;
import CachingWithQuery.Student;
import General.InsertIntoTable;
import net.sf.ehcache.CacheManager;


//Main app for 2nd level caching using Ehcache
public class AppSLC {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(Employee_SLC.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session1 = sessionFactory.openSession();
	    
	    //InsertIntoTable.insert(session1);	//uncomment this when need to insert anything in table , go to insert method , add row details and execute
		
		  session1.get(Employee_SLC.class, 101); 
		  //session1.get(Employee_SLC.class,102); 
		  //session1.get(Employee_SLC.class, 101);
		  
		  Session session2 = sessionFactory.openSession();
		  session2.get(Employee_SLC.class, 101); 
		  session2.get(Employee_SLC.class, 103);
		  
		  Session session3 = sessionFactory.openSession();
		  session3.get(Employee_SLC.class, 102); 
		  session3.get(Employee_SLC.class, 103);
		  session3.get(Employee_SLC.class, 104);
		  
		  Query q= session1.createQuery("from Employee_SLC where name=\'Nipun\'");
		  Employee_SLC e= (Employee_SLC) q.getSingleResult();
		  
		  System.out.println("Printing Employee");
		  System.out.println(e.getName()+", "+e.getEmpId()+" , "+e.getSalary());
		  
		  int size = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache(
		  "CachingHibernate.Employee_SLC").getSize(); 
		  System.out.println("size is : " +
		  size);
		 
	    
	}

}
