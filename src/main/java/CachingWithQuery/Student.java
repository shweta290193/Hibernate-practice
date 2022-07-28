package CachingWithQuery;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable  
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Student {

	@Id
	int rollno;
	String name;
	long phone;
	
	public Student(int rollno, String name, long phone) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
	}
	public Student() {
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
