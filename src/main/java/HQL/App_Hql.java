package HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import CachingWithQuery.Student;

public class App_Hql {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//#1 fetching all the data from Student
		Query query = session.createQuery("from Student");
		List<Student> li = query.list();
		for(Student s:li)
			System.out.println(s.getName()+", "+s.getPhone()+" , "+s.getRollno());

		//#2 fetching filtered records from Student
		query = session.createQuery("from Student where rollno=2");
		Student s = (Student) query.uniqueResult();
		System.out.println(s.getName()+", "+s.getPhone()+" , "+s.getRollno());
		
		//#3 fetching filtered records with selected columns from Student using select
		query = session.createQuery("select name, phone, rollno from Student where rollno=2");	//when we give select keyword , the an object array is returned
		Object obj[]= (Object[]) query.uniqueResult();
		System.out.println(obj[0]+", "+obj[1]+", "+obj[2]);
		
		System.out.println("*************");
		
		//#4 - using positional parameter - fetching filtered records with selected columns from Student using select
		long phone=88888;
		query = session.createQuery("select s.name, s.phone from Student s where s.phone=:x");		//this will give these selected cols for entire table 
		query.setParameter("x", phone);
		List<Object[]> students= query.list();
		for(Object[] stu:students)
			System.out.println(stu[0]+", "+stu[1]);
		
		System.out.println("************* #5");
		
		//#5
		/*query = session.createQuery("select * from Student where phone=9999999");	//this will fail as hql doesnt allow *
		List<Object[]> studentss= query.list();
		for(Object[] stu:studentss)
			System.out.println(stu[0]+", "+stu[1]+", "+stu[2]);*/
		
		
			
	}

}
