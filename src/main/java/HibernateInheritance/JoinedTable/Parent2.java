package HibernateInheritance.JoinedTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorColumn(name = "Parent_type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Parent2 {
	
	@Id
	int pid;
	String pname;
	public Parent2() {
		super();
	}
	public Parent2(int pid, String pname) {
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
