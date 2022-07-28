package CachingHibernate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee_SLC {
		@Id
	   int empId;
	   String name;
	   long salary;
	   
	   
	   public Employee_SLC()
	   {}
	 
	   public Employee_SLC(int empId, String name, long salary) {
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
