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
    private BigDecimal Salario;

    public  EmpleadoModel (){

    }

    public EmpleadoModel(String nombre, String puesto, BigDecimal salario) {
        this.Nombre = nombre;
        this.Puesto = puesto;
        this.Salario = salario;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public BigDecimal getSalario() {
        return Salario;
    }

    public void setSalario(BigDecimal salario) {
        Salario = salario;
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
