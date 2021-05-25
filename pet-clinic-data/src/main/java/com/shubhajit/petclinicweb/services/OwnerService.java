package com.shubhajit.petclinicweb.services;

import com.shubhajit.petclinicweb.entities.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
