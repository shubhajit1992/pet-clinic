package com.shubhajit.petclinicdata.services;

import com.shubhajit.petclinicdata.entities.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
