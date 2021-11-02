package com.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Author;

@RestController
public class AuthorsController {

	@GetMapping("/authors/get")
	public List<Author> authors(@RequestBody List<Author> authors) {
		return authors;
	}

}
