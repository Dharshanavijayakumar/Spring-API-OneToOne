package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Author;
import com.example.demo.Service.AuthorService;

@RestController
public class AuthorController {
	AuthorService aservice;
	
	@PostMapping("/saveAuthor")
	public Author saveAuthor(@RequestBody Author a)
	{
		return  aservice.saveAuthor(a);
	}
	
	@GetMapping("/getAllAuthors")
	public List<Author> getDetails()
	{
		return aservice.getAllAuthors();
	}
	

}
