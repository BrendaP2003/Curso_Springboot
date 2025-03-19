package com.example.Curso_SpringBoot.Repository;

import com.example.Curso_SpringBoot.Entidades.EmpleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  EmpleadoRepository extends JpaRepository <EmpleadoModel,Long> {

}
