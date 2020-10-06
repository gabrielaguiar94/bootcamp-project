package com.bootcamp.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.project.dto.ClientDTO;
import com.bootcamp.project.entities.Client;
import com.bootcamp.project.exceptions.ResourceNotFoundException;
import com.bootcamp.project.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	public ClientRepository repository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		
		return list.map(x -> new ClientDTO(x));
		
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException ("Entity not found"));
		return new ClientDTO(entity);
		
	}
	
	

}
