package com.assignments.driverLicense.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.driverLicense.models.License;
import com.assignments.driverLicense.models.Person;
import com.assignments.driverLicense.repositories.LicenseRepository;
import com.assignments.driverLicense.repositories.PersonRepository;

@Service
public class PersonAndlicenseService {
	
	@Autowired
	private LicenseRepository licenseRepo;
	
	@Autowired
	private PersonRepository personRepo;
	
	public void savePerson(Person person) {
		personRepo.save(person);
		
	}
	
	public Optional<Person> getPerson(Long id) {
		return personRepo.findById(id);
	}
	
	public void saveLicense(License license ) {
		licenseRepo.save(license);
	}
	public Optional<License> getLicense(Long id) {
		return licenseRepo.findById(id);
	}

}
