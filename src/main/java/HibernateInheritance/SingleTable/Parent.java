package HibernateInheritance.SingleTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Parent {
	
	@Id
	int pid;
	String pname;
	public Parent() {
		super();
	}
	public Parent(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
