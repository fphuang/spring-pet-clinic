package com.coy.petclinic.services.map;

import com.coy.petclinic.model.Pet;
import com.coy.petclinic.services.CrudeService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long>
        implements CrudeService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
