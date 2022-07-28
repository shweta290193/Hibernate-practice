package HibernateInheritance.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrandChild3 extends Parent3 {
	/*
	 * @Id int gid;
	 */
	String gname;
	String school;
	public GrandChild3(String gname, String school) {
		super();
		this.gname = gname;
		this.school = school;
	}
	public GrandChild3() {
		super();
	}
}
