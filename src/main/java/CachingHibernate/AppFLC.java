package CachingHibernate;

//Main app for 1st level caching

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.sf.ehcache.CacheManager;

public class AppFLC {
  public static void main(String[] args) {
	  
    Configuration config= new Configuration().configure().addAnnotatedClass(Employee_FLC.class);
    SessionFactory sessionFactory =config.buildSessionFactory();
    Session session1 = sessionFactory.openSession();
    
    //InsertIntoTable.insert(session1);
    session1.get(Employee_FLC.class, 101);
    session1.get(Employee_FLC.class, 102);
    
    Session session2 = sessionFactory.openSession();
    session1.get(Employee_FLC.class, 101);	//this will not query the Db again,but will pickup values from 1st level cache.hence no separate Db query in console
    //session2.get(Employee_FLC.class, 101); 	//this will query the Db again,and hence there will be a separate Db query in console
   }
}
