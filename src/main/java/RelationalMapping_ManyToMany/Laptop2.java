package RelationalMapping_ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Laptop2 {
	
	@Id
	long lap_id;
	String os;
	String brand;
	
	
	@ManyToMany			//Many laptops can be mapped to many employees
	@JoinColumn(name="e_id")
	List<Employee2> employees;
	
	public Laptop2(long lap_id, String os, String brand, List<Employee2> employees) {
		super();
		this.lap_id = lap_id;
		this.os = os;
		this.brand = brand;
		this.employees = employees;
	}

	public Laptop2() {
		
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

	public List<Employee2> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee2> employees) {
		this.employees = employees;
	}

		
}
