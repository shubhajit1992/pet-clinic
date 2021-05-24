package com.shubhajit.petclinicdata.services;

import com.shubhajit.petclinicdata.entities.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
