package HibernateInheritance.SingleTable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Child extends Parent {
	
	
	String cname;
	String school;
	public Child(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public Child() {
		super();
	}
	

}
