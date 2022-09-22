package com.control.Control.de.Gastos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.control.Control.de.Gastos.models.AdministradorModel;

@Repository
public interface AdministradorRepository extends CrudRepository<AdministradorModel, Long> {
    //buscar por id
    public AdministradorModel findById(long id);
}

