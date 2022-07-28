package HibernateInheritance.JoinedTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("1")
@PrimaryKeyJoinColumn(name = "parent_id")
public class Child2 extends Parent2 {
	String cname;
	String school;
	public Child2(String cname, String school) {
		super();
		this.cname = cname;
		this.school = school;
	}
	public Child2() {
		super();
	}
	

}
