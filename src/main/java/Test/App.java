package Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
  public static void main(String[] args) {
	//Employee e1= new Employee();
	
	Employee e1= new Employee(103,"Shweta",4000000);
	Laptop l1 =new  Laptop(110156, "Windows" ,"HP", e1);
	Laptop l2 =new  Laptop(110155, "MacOs" ,"Apple", e1);
	List<Laptop>lap_list= new ArrayList<Laptop>();
	e1.setLaptops(lap_list);
	e1.getLaptops().add(l1);
	e1.getLaptops().add(l2);	   	  
	    
    Configuration config= new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
    SessionFactory sessionFactory =config.buildSessionFactory();
    Session session = sessionFactory.openSession();
    
    Transaction t1 = session.beginTransaction(); 
    session.save(e1);
    session.save(l1);
    session.save(l2);
    
    //fetching employee details via primary key from db table
    Employee obj = session.get(Employee.class, 103);
    System.out.println("Fetched emloyee details :"+obj.getEmpId()+" , "+obj.getName()+" , "+obj.getSalary());
    
    t1.commit();
  }
}
