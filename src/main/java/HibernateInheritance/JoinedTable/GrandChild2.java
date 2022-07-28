package HibernateInheritance.JoinedTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@DiscriminatorValue("2")
public class GrandChild2 extends Parent2 {
	/*
	 * @Id int gid;
	 */
	String gname;
	String school;
	public GrandChild2(String gname, String school) {
		super();
		this.gname = gname;
		this.school = school;
	}
	public GrandChild2() {
		super();
	}
}
