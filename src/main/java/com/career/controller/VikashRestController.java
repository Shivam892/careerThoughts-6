package com.career.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.career.entity.Vikash;
import com.career.repository.VikashRepository;

@RestController
//@RequestMapping("/api")
public class VikashRestController {
	
	@Autowired
	private VikashRepository vikashRepo;
	
//	@GetMapping
//	public List<Vikash> alldata(){
//		List<Vikash> findAll = vikashRepo.findAll();
//		return findAll;
//	}
	
	@RequestMapping("/data/{id}")
	public Vikash getdata(@PathVariable("id") long id) {
		if(id==0) {
			throw new IdNotFound();
		}
		Optional<Vikash> findById = vikashRepo.findById(id);
		Vikash vikash = findById.get();
		return vikash;
	}

}
