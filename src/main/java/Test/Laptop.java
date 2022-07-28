package Test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Laptop_tb")
public class Laptop {
	
	@Id
	long lap_id;
	String os;
	String brand;
	
	
	  @ManyToOne //Many laptops can be mapped to One employee 
	  @JoinColumn(name="emp_id")
	  Employee employee;
	 
	
	  
	public Laptop(long lap_id, String os, String brand, Employee employee) {
		super();
		this.lap_id = lap_id;
		this.os = os;
		this.brand = brand;
		this.employee = employee;
	}

	public Laptop() {
		
	}		
	
	public long getLap_id() {
		return lap_id;
	}


	public void setLap_id(long lap_id) {
		this.lap_id = lap_id;
	}


	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	
	
	  public Employee getEmployee() { return employee; }
	  
	  
	  public void setEmployee(Employee employee) { this.employee = employee; }
	 
	 
		
}
