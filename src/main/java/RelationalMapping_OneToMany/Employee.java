package RelationalMapping_OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "emp")
@Table(name = "emp_tb")
public class Employee {
   
	@Id
	int empId;
   String name;
   long salary;
   
   @OneToMany(mappedBy = "employee")  //mappedBy will take the name of member variable Employee of Laptop 
   List<Laptop> laptops;   //One employee can have multiple laptops 
    
   public Employee()
   {
	   
   }
     
   public Employee(int empId, String name, long salary, List<Laptop> laptops) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.laptops = laptops;
}

public Employee(int id, String name, long salary) {
		super();
		this.empId = id;
		this.name = name;
		this.salary = salary;
	}
   
   public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public List<Laptop> getLaptops() {
	return laptops;
}

public void setLaptops(List<Laptop> laptops) {
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
