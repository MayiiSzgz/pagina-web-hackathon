package com.control.Control.de.Gastos.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.control.Control.de.Gastos.services.AdministradorService;
import com.control.Control.de.Gastos.models.AdministradorModel;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
AdministradorService administradorService;

    @GetMapping()
    public ArrayList<AdministradorModel> obtenerAdministrador(){
        return administradorService.obtenerAdministrador();
    }

    @PostMapping()
    public AdministradorModel guardarAdministrador(@RequestBody AdministradorModel administrador){
        return this.administradorService.guardarAdministrador(administrador);
    }

    @GetMapping( path = "/{id}")
    public String elmininarPorId(@PathVariable("id") Long id){
        boolean ok = this.administradorService.eliminarAdministrador(id);
        if (ok){
            return "Se elimino el administrador con id " + id;
        }else{
            return "no se puedo eliminar el administrador con el id" + id;
        }
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorPriorId(@PathVariable("id")Long id){
        boolean ok= this.administradorService.eliminarAdministrador(id);
        if (ok){
            return "Se elimino el administrador con id " + id;
        }else{
            return "no se puedo eliminar el administrador con el id" + id;
        }
    }
}
