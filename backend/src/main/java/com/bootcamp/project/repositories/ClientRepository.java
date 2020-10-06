package com.bootcamp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.project.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}