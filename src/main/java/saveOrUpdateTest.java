import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import RelationalMapping_OneToMany.Employee;
import RelationalMapping_OneToMany.Laptop;


public class saveOrUpdateTest {

	public static void main(String[] args) {
		
		Book e1= new Book(117,"asweoo",4000000);
		
		Configuration config= new Configuration().configure().addAnnotatedClass(Book.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    Transaction t1 = session.beginTransaction(); 
	    //Serializable id =session.save(e1);
	    session.save(e1);
	    session.save(e1);
	    //System.out.println("id : "+id);
		
		 //e1.setName("ggg"); session.saveOrUpdate(e1);
		 
	    
			
			  t1.commit(); session.close();
			 
		
		  Session session2 = new
		  Configuration().configure().addAnnotatedClass(Book.class).buildSessionFactory
		  ().openSession(); 
		  
		  Transaction t2 = session2.beginTransaction(); 
		  
		  e1.setName("sdsdsdfs");
		  session2.saveOrUpdate(e1);
		 
		  t2.commit();
	    
		/*
		 * e1= new Employee(102,"Shweta",4000000); session.save(e1);
		 */
	    
		/*
		 * Book obj = session.get(Book.class, 101);
		 * System.out.println("Fetched emloyee details :"+obj.getEmpId()+" , "+obj.
		 * getName()+" , "+obj.getSalary());
		 */
	    
	    
	    
	}

}
