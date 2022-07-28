package CachingHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee_FLC {
   
   @Id
   int empId;
   String name;
   long salary;
   
   
   public Employee_FLC()
   {}
 
   public Employee_FLC(int empId, String name, long salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
   
   public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}

}
