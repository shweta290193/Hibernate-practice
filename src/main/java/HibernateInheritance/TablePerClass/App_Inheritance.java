package HibernateInheritance.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import HibernateInheritance.JoinedTable.Parent2;


public class App_Inheritance {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(Parent3.class).addAnnotatedClass(Child3.class).addAnnotatedClass(GrandChild3.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    //Parent3 p = new Parent3(101,"Gita");
	    //Child1 c = new Child1("shweta", "KV");
		/*
		 * GrandChild1 g = new GrandChild1("Agam", "KV");
		 * 
		 * g.pid=101; g.pname="Shatrughan";
		 */
		/*
		 * GrandChild3 g = new GrandChild3("Tani", "KV"); g.pid=101; g.pname="Gita";
		 */
		 
		
		  Child3 c = new Child3("Sonal", "KV"); c.pid=103; c.pname="Shobha";
		 
			/*
			 * Parent3 n= session.get( Parent3.class, 101);
			 * 
			 * System.out.println("Printing n : "+n.pid+" , "+n.pname);
			 */
	    
		
		  Transaction t= session.beginTransaction(); session.save(c); t.commit();
		 
	    

	}

}
