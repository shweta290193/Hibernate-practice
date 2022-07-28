package HibernateInheritance.SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App_Inheritance {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(Parent.class).addAnnotatedClass(Child.class).addAnnotatedClass(GrandChild.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
		/*
		 * Parent p = new Parent(102,"Gita"); Child c = new Child("shweta", "KV");
		 * GrandChild g = new GrandChild("Agam", "KV");
		 * 
		 * // g.pid=102; g.pname="Shatrughan"; g.pid=101; g.pname="Shatrughan";
		 */
		
		  //Child c = new Child("Sonal", "KV"); c.pid=103; c.pname="Shobha";
		 
	    
		
			
			  Parent n= session.get( Parent.class, 101);
			  
			  System.out.println("Printing n : "+n.pid+" , "+n.pname);
			 
		 
	    
		
			/*
			 * Transaction t= session.beginTransaction(); session.save(p); session.save(c);
			 * session.save(g); t.commit();
			 */
		 
	    

	}

}
