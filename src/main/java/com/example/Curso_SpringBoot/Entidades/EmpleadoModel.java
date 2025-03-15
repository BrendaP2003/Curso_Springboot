package com.example.Curso_SpringBoot.Entidades;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Empleado")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nombre;
    private  String Puesto;
    private BigDecimal Salariko;

    public  EmpleadoModel (){

    }
    public EmpleadoModel(Long id, BigDecimal salariko, String puesto, String nombre) {
        Id = id;
        Salariko = salariko;
        Puesto = puesto;
        Nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public BigDecimal getSalariko() {
        return Salariko;
    }

    public void setSalariko(BigDecimal salariko) {
        Salariko = salariko;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
