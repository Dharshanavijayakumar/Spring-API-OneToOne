package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Author;
import com.example.demo.Repository.AuthorRepo;


@Service
public class AuthorService {
	@Autowired
	AuthorRepo authorRep;
	public Author saveAuthor(Author author)
	{
		return authorRep.save(author);
	}
	public List<Author> getAllAuthors()
	{
		return authorRep.findAll();
	}

}
