package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepo;
import com.example.demo.repository.BookRepo;

@RestController
public class ControllerClassForAuthorAndBook {
	@Autowired
	private AuthorRepo ar;
	@Autowired
	private BookRepo br;
	@GetMapping("all-books")
	public List<Book> get_all_books(){
		return br.findAll();
	}
	@GetMapping("all-authors")
	public List<Author> get_all_authors(){
		return ar.findAll();
	}
	@GetMapping("all_author_for_book/{id}")
	public List<Author> gel_all_author_for_book(@PathVariable("id") int id) {
		Book book= br.getOne(id);
		return book.getAuthors();
	}
	@GetMapping("all_book_by_author/{id}")
	public List<Book> gel_all_book_by_author(@PathVariable("id") int id) {
		
		
		Author author=ar.getOne(id);
		return author.getBooks();
	}
}
