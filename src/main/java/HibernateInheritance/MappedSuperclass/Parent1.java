package HibernateInheritance.MappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Parent1 {
	
	@Id
	int pid;
	String pname;
	public Parent1() {
		super();
	}
	public Parent1(int pid, String pname) {
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
