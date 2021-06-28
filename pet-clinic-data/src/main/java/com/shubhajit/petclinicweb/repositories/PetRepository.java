package com.shubhajit.petclinicweb.repositories;

import com.shubhajit.petclinicweb.entities.Pet;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
