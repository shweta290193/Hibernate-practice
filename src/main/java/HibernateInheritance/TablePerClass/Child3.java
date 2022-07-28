package HibernateInheritance.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Child3 extends Parent3 {
	
	/*
	 * @Id int cid;
	 */
	String cname;
	String school;
	public Child3(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public Child3() {
		super();
	}
	

}
