package com.coy.petclinic.services;

import com.coy.petclinic.model.Owner;

public interface OwnerService extends CrudeService<Owner, Long> {
    Owner findByLastName(String lastName);
}
