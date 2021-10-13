package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Greatting;



public interface GreattingRepo extends CrudRepository<Greatting, Integer>{

}
