package com.control.Control.de.Gastos.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "administrador")
public class AdministradorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        private Long id;
        private String nombre;
        private String telefono;
        private Date fechaNacimiento;
        private String sexo;
        private String email;
        private String password;
        private int id_total;
        private int id_fecha;
        private int id_gastos;
        private int id_movimientos;

            public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId_total() {
        return id_total;
    }
    public void setId_total(int id_total) {
        this.id_total = id_total;
    }
    public int getId_fecha() {
        return id_fecha;
    }
    public void setId_fecha(int id_fecha) {
        this.id_fecha = id_fecha;
    }
    public int getId_gastos() {
        return id_gastos;
    }
    public void setId_gastos(int id_gastos) {
        this.id_gastos = id_gastos;
    }
    public int getId_movimientos() {
        return id_movimientos;
    }
    public void setId_movimientos(int id_movimientos) {
        this.id_movimientos = id_movimientos;
    }


}
