package com.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.career.entity.Vikash;
import com.career.repository.VikashRepository;

@Service
public class VikashServiceImpl implements VikashService {
	
	@Autowired
	private VikashRepository vikashRepo;

	@Override
	public void sharma(Vikash vikash) {
		vikashRepo.save(vikash);
		
	}

}
