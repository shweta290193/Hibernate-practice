package RelationalMapping_ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Employee2 {
   
	@Id
	int empId;
   String name;
   long salary;
   
    //@ManyToMany(mappedBy = "employees",fetch = FetchType.EAGER)
   @ManyToMany(mappedBy = "employees")
   @JoinColumn(name="l_id")
   List<Laptop2> laptops;   //Many employees mapped to many laptops
   
   public Employee2()
   {
	   
   }
     
   public Employee2(int id, String name, long salary) {
		super();
		this.empId = id;
		this.name = name;
		this.salary = salary;
	}

public Employee2(int empId, String name, long salary, List<Laptop2> laptops) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.laptops = laptops;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public List<Laptop2> getLaptops() {
	return laptops;
}

public void setLaptops(List<Laptop2> laptops) {
	this.laptops = laptops;
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
