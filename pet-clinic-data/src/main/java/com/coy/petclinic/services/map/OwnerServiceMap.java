package com.coy.petclinic.services.map;

import com.coy.petclinic.model.Owner;
import com.coy.petclinic.services.CrudeService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements CrudeService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
