package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 

public class Author {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int author_id;
	private String author_name;
	
	@ManyToMany(mappedBy = "authors",fetch = FetchType.LAZY)
	@JsonIgnore()
	private List<Book> books=new ArrayList<>();

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", author_name=" + author_name + "]";
	}

}
