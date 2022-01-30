package com.coy.petclinic.services;

import java.util.Set;

public interface CrudeService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T dao);

    void deleteById(ID id);

    void delete(T dao);
}
