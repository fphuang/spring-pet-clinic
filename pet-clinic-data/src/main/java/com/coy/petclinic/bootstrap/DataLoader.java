package com.coy.petclinic.bootstrap;

import com.coy.petclinic.model.Owner;
import com.coy.petclinic.model.Pet;
import com.coy.petclinic.model.Vet;
import com.coy.petclinic.services.OwnerService;
import com.coy.petclinic.services.VetService;
import com.coy.petclinic.services.map.OwnerServiceMap;
import com.coy.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Mike");
        owner.setLastName("Wanton");
        ownerService.save(owner);

        owner = new Owner();
        owner.setId(2L);
        owner.setFirstName("Nadal");
        owner.setLastName("Juan");
        ownerService.save(owner);

        System.out.println("Loaded owners...");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Avenue");
        vetService.save(vet);

        vet = new Vet();
        vet.setId(2L);
        vet.setFirstName("Jessie");
        vet.setLastName("Porter");
        vetService.save(vet);

        System.out.println("Loaded vets...");
    }
}
