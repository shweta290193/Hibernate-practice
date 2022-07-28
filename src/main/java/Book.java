import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_book")
public class Book {
	
	public Book(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public Book() {
		
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
	@Id
	int empId;
   String name;
   long salary;

}
