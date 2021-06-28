package com.shubhajit.petclinicweb.repositories;

import com.shubhajit.petclinicweb.entities.PetType;

import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
