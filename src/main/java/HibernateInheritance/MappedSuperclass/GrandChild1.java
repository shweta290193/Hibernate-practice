package HibernateInheritance.MappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrandChild1 extends Parent1 {
	/*
	 * @Id int gid;
	 */
	String cname;
	String school;
	public GrandChild1(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public GrandChild1() {
		super();
	}
}
