package HibernateInheritance.MappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Child1 extends Parent1 {
	
	/*
	 * @Id int cid;
	 */
	String cname;
	String school;
	public Child1(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public Child1() {
		super();
	}
	

}
