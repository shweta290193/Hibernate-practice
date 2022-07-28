package Native_SQLQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import CachingWithQuery.Student;

//earlier , to use sql queries ,SQLQuery was used , but now this is deprecated so NativeQuery is used

public class App_NativeQuery {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//#1 fetching all the data from Student via SQL
		NativeQuery query = session.createSQLQuery("select * from Student");
		query.addEntity(Student.class);
		List<Student> li=new ArrayList<Student>();
		li=query.list();
		System.out.println("printing student");
		for(Student s:li)
		{
			//Student s=(Student) o;
			System.out.println(s.getName()+" , "+s.getPhone()+" , "+s.getRollno());
		}
			
		System.out.println("****************");
		
		//#2 fetching "selected columns" from Student via SQL,  for this , we need to use key value pair , hence map
		query = session.createSQLQuery("select name,rollno from Student");
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		li=query.list();
		System.out.println("printing students via map");
		for(Object o:li)
		{
			Map s=(Map) o;
			System.out.println(s.get("name")+" , "+s.get("rollno"));
		}

	}

}
