package com.example.demo.Model;

import java.awt.print.Book;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Author {
	@Id
	private int authorId;
	private String authorBook;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="author_book")
	private List<Book> bookInfo;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorBook() {
		return authorBook;
	}
	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}
	

}
