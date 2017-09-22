package ff.yazeed.bookstore.Bookstore.domain;

import javax.persistence.Entity;


@Entity
public class Book {

	
	private String title;
	private String author;
	private double year;
	private double isbn;
	
	
	
	
	public Book(String title, String author, double year, double isbn) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	public double getIsbn() {
		return isbn;
	}
	public void setIsbn(double isbn) {
		this.isbn = isbn;
	}
	
	
}