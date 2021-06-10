package com.shubhajit.petclinicweb.bootstrap;

import com.shubhajit.petclinicweb.entities.Owner;
import com.shubhajit.petclinicweb.entities.Pet;
import com.shubhajit.petclinicweb.entities.PetType;
import com.shubhajit.petclinicweb.entities.Vet;
import com.shubhajit.petclinicweb.services.OwnerService;
import com.shubhajit.petclinicweb.services.PetTypeService;
import com.shubhajit.petclinicweb.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("UB City");
        owner1.setCity("Bangalore");
        owner1.setTelephone("1234567890");

        Pet mikesDog = new Pet();
        mikesDog.setName("Doggie");
        mikesDog.setPetType(savedDogPetType);
        mikesDog.setOwner(owner1);
        mikesDog.setBirthDate(LocalDate.now());

        owner1.getPets().add(mikesDog);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("UB City");
        owner2.setCity("Bangalore");
        owner2.setTelephone("1234567890");

        Pet fionasCat = new Pet();
        fionasCat.setName("Cattie");
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());

        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
