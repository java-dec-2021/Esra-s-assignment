package com.assignments.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;

	public void save(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public List<Dojo> findAll(){
		return dojoRepo.findAll();
	}
	

	
	
	
	
}
