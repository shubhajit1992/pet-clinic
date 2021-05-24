package com.shubhajit.petclinicdata.services;

import com.shubhajit.petclinicdata.entities.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
