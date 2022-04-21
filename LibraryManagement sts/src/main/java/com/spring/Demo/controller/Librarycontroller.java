package com.spring.Demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Demo.model.Librarymodel;
import com.spring.Demo.service.Libraryservice;

@RestController
public class Librarycontroller                            // controller class for LibraryMgmt
{
	
	@Autowired
	private Libraryservice bookservice;
	
	@PostMapping("/update")
	@CrossOrigin(origins="http://localhost:4200")                // angular domain that will consume rest service
    public Librarymodel updateBooks(@RequestBody Librarymodel book)
    {
       return bookservice.updateService(book);		
    }

	@PostMapping("/insert")
	@CrossOrigin(origins="http://localhost:4200")
	public Librarymodel insertBooks(@RequestBody Librarymodel book1)
	{
		
		return bookservice.insertService(book1);
		
	}
	
	@PostMapping("/delete")
	@CrossOrigin(origins="http://localhost:4200")
	public void deleteBooks(@RequestBody Librarymodel id) 
	{
		bookservice.deleteService(id);
		
	}

	
	@GetMapping("/fetch")
	@CrossOrigin(origins="http://localhost:4200")
    public List<Librarymodel> fetchBooks()	
	{
		return bookservice.fetchService();
	}
}

