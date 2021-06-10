package com.shubhajit.petclinicweb.services.map;

import com.shubhajit.petclinicweb.entities.Speciality;
import com.shubhajit.petclinicweb.entities.Vet;
import com.shubhajit.petclinicweb.services.SpecialityService;
import com.shubhajit.petclinicweb.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object != null) {
            if (object.getSpecialities().size() > 0) {
                object.getSpecialities().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        final Speciality savedSpecialty = specialityService.save(speciality);
                        speciality.setId(savedSpecialty.getId());
                    }
                });
            }
            return super.save(object);
        }
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
