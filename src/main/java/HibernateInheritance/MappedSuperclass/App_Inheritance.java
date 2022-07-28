package HibernateInheritance.MappedSuperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import HibernateInheritance.JoinedTable.Parent2;


public class App_Inheritance {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(Parent1.class).addAnnotatedClass(Child1.class).addAnnotatedClass(GrandChild1.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    //Parent1 p = new Parent1(101,"Gita");
	    //Child1 c = new Child1("shweta", "KV");
		/*
		 * GrandChild1 g = new GrandChild1("Agam", "KV");
		 * 
		 * g.pid=101; g.pname="Shatrughan";
		 */
		/*
		 * GrandChild1 g = new GrandChild1("Tani", "KV"); g.pid=101; g.pname="Gita";
		 */
		 
		
		  Child1 c = new Child1("Sonal", "KV"); c.pid=107; c.pname="Gita";
		 
		
		  Transaction t= session.beginTransaction(); session.save(c); t.commit();
		 
	    

	}

}
