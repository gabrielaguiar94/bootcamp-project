package com.bootcamp.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.project.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	public ClientRepository repository;
	
	

}
