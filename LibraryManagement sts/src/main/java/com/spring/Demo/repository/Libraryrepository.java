package com.spring.Demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.spring.Demo.model.Librarymodel;

@Repository																		// repository to work with model
public interface Libraryrepository extends JpaRepository<Librarymodel,Integer>{
}