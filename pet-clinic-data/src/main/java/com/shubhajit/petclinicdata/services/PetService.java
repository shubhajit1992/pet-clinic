package com.shubhajit.petclinicdata.services;

import com.shubhajit.petclinicdata.entities.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
