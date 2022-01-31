package com.coy.petclinic.services.map;

import com.coy.petclinic.model.Pet;
import com.coy.petclinic.model.Vet;
import com.coy.petclinic.services.CrudeService;
import com.coy.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet dao) {
        return super.save(dao.getId(), dao);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet dao) {
        super.delete(dao);
    }
}
