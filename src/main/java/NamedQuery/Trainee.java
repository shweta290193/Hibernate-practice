package NamedQuery;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "Trainee.findById", query = "from Trainee t where t.name=:x")
public class Trainee {
	@Id
	int rollno;
	String name;
	long phone;
	
	public Trainee(int rollno, String name, long phone) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
	}
	
	public Trainee() {
		super();
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
