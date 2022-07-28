package CriteriaHibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import CachingWithQuery.Student;


public class App_Criteria {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		//fetching all from students via Criteria
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> li= (List<Student>) criteria.list();
		for(Student m:li)
			System.out.println(m.getName()+" , "+m.getRollno());
		
		//fetching few rows from students via Criteria and adding Restrictions
		System.out.println("******************");
		criteria.add(Restrictions.eq("phone", 9999999L));
		List<Student> li2= (List<Student>) criteria.list();
		for(Student m:li2)
			System.out.println(m.getName()+" , "+m.getRollno());
		
		System.out.println("******************Projections**");
		
		//fetching few columns from students via Criteria and adding Projections
		Criteria criteria2 = session.createCriteria(Student.class);
		criteria2.setProjection(Projections.projectionList()
			      .add(Projections.property("rollno"), "rollno")
			      .add(Projections.property("name"), "name"))
			    .setResultTransformer(Transformers.aliasToBean(Student.class));
			
		List<Student> li3= (List<Student>) criteria2.list();
				for(Student m:li3)
					System.out.println(m.getName()+" , "+m.getRollno());
	}

}
