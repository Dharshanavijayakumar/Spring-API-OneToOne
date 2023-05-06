package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
