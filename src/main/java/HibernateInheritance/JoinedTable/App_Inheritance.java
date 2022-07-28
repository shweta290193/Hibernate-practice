package HibernateInheritance.JoinedTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import RelationalMapping_ManyToMany.Employee2;


public class App_Inheritance {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(Parent2.class).addAnnotatedClass(Child2.class).addAnnotatedClass(GrandChild2.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
	    //Parent2 p = new Parent2(104,"Kiran");
	    //Child1 c = new Child1("shweta", "KV");
		
		/*
		 * GrandChild2 g = new GrandChild2("Agam", "KV");
		 * 
		 * g.pid=101; g.pname="Shatrughan";
		 */
		 
		
		
		  //GrandChild2 g = new GrandChild2("Tani", "KV"); g.pid=102; g.pname="Gita";
		 
		 
		 
		
		  //Child2 c = new Child2("Sonal", "KV"); c.pid=103; c.pname="Shobha";
	    //Child2 c = new Child2("Shweta", "KV"); c.pid=101; c.pname="Shatrughan";
	    Child2 m= session.get(Child2.class, 101);
	    
	    System.out.println("Printing m : "+m.cname+" , "+m.pname);
	    
	    Parent2 n= session.get( Parent2.class, 103);
	    
	    System.out.println("Printing n : "+n.pid+" , "+n.pname);
	    
		
		  //Transaction t= session.beginTransaction(); session.save(c); t.commit();
		 
	    

	}

}
