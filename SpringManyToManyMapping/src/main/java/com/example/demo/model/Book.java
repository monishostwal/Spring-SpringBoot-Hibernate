package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Book {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	private String book_name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	
	@JoinTable(name = "join_book_author",joinColumns = @JoinColumn(name = "book_id",referencedColumnName = "book_id"),inverseJoinColumns = @JoinColumn(name="author_id"))
	@JsonIgnore
	private List<Author> authors=new ArrayList<>();

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

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + "]";
	}
	
	
}
