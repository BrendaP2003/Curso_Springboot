package com.example.Curso_SpringBoot.Repository;

import com.example.Curso_SpringBoot.Entidades.Usuariomodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuariomodel, Long> {

}
