package HibernateInheritance.SingleTable;

import javax.persistence.Entity;

@Entity
public class GrandChild extends Parent {
	
	String cname;
	String school;
	public GrandChild(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public GrandChild() {
		super();
	}
}
