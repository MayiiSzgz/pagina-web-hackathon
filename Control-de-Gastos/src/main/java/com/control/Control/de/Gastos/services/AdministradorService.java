package com.control.Control.de.Gastos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.control.Control.de.Gastos.models.AdministradorModel;
import com.control.Control.de.Gastos.repositories.AdministradorRepository;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class AdministradorService {

    @Autowired
    AdministradorRepository administradorRepository;

    public ArrayList<AdministradorModel> obtenerAdministradores() {
        return (ArrayList<AdministradorModel>) administrasdorRepository.findAll();
    }

    public AdministradorModel guardarAdministrador(AdministradorModel administrador){
        return administradorRepository.save(administrador);
    }

    public Optional<AdministradorModel> obtenerPorID(Long id){
        return administradorRepository.findById(id);
    }

    public boolean eliminarAdministrador(Long id){
        try{
            administradorRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }



}
