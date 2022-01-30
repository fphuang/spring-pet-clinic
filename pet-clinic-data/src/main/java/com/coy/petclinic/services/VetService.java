package com.coy.petclinic.services;

import com.coy.petclinic.model.Owner;
import com.coy.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
