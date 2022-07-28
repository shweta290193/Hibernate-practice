package CascadingHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	int book_id;
	String book_name;
	@ManyToOne
	@JoinColumn(name="s_id")  //the book table gets the primary key from School as foregin key. We can modify its name using joincolumn or we can make composoite foreign key using joincolumn
	School school;
	
	public Book() {
		super();
	}
	
	public Book(int book_id, String book_name, School school) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.school = school;
	}

	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
}
