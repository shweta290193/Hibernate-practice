package CascadingHibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	int school_id;
	String school_name;
	@OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
	List<Book> book;
	
	public School() {
		
	}

	public School(int school_id, String school_name, List<Book> book) {
		super();
		this.school_id = school_id;
		this.school_name = school_name;
		this.book = book;
	}

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
}
