package CascadingHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App_Cascading {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure().addAnnotatedClass(School.class).addAnnotatedClass(Book.class);
	    SessionFactory sessionFactory =config.buildSessionFactory();
	    Session session = sessionFactory.openSession();

	    List<Book> blist=new ArrayList<Book>();
	    School s1= new School(1, "KV", blist);
	    
		
		  Book b1 = new Book(101, "B1",s1); 
		  Book b2 = new Book(102, "B2",s1); 
		  Book b3 = new Book(103, "B3",s1);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		
		
		Transaction t = session.beginTransaction();
		session.save(s1);
		t.commit();

	}

}
