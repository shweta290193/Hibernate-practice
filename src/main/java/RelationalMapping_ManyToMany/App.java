package RelationalMapping_ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
  public static void main(String[] args) {
	  List<Employee2> empList1 = new ArrayList<Employee2>();
	  List<Employee2> empList2 = new ArrayList<Employee2>();
	  List<Employee2> empList3 = new ArrayList<Employee2>();
	  
	  List<Laptop2> lapList1 = new ArrayList<Laptop2>();
	  List<Laptop2> lapList2 = new ArrayList<Laptop2>();
	  List<Laptop2> lapList3 = new ArrayList<Laptop2>();
	   
	  Employee2 e1=new Employee2(101,"Shweta",4000000, lapList1);
	  Employee2 e2=new Employee2(102,"Sonal",4000000,lapList2);
	  Employee2 e3=new Employee2(103,"Nishu",4000000,lapList3);
	  
	  empList1.add(e1);
	  empList1.add(e3);
	  empList2.add(e3);
	  empList2.add(e2);
	  empList3.add(e3);
	  empList3.add(e2);
	  empList3.add(e1);
	   	  
	  
	  Laptop2 l1 =new  Laptop2(110156, "Windows" ,"HP", empList1);
	  Laptop2 l2 =new  Laptop2(110157, "MacOs" ,"Apple", empList2);
	  Laptop2 l3 =new  Laptop2(110159, "Linux" ,"Dell", empList3);
	  Laptop2 l4 =new  Laptop2(110155, "Windows" ,"Hp-office", empList1);
	  
	  lapList1.add(l1);
	  lapList1.add(l4);
	  lapList1.add(l3);	  
	  lapList2.add(l2);
	  lapList2.add(l3);
	  lapList3.add(l1);
	  lapList3.add(l2);
	  lapList3.add(l3);
	  lapList3.add(l4);
	  
	  //System.out.println("printing e3 : "+e3.getLaptops().size());
    
    Configuration config= new Configuration().configure().addAnnotatedClass(Employee2.class).addAnnotatedClass(Laptop2.class);
    SessionFactory sessionFactory =config.buildSessionFactory();
    Session session = sessionFactory.openSession();
    
    Transaction t1 = session.beginTransaction(); 
    /*session.save(e1);
    session.save(e2);
    session.save(e3);
    session.save(l1);
    session.save(l2);
    session.save(l3);
    session.save(l4);*/
    
    System.out.println("here");
    Employee2 e=session.get(Employee2.class, 101);
    //System.out.println("Printing e: "+e.empId+", "+e.name+" , "+e.salary+" , "+e.laptops);
    
    t1.commit();
  }
}
