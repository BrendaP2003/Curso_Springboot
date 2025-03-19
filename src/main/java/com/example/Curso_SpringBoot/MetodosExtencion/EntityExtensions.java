package com.example.Curso_SpringBoot.MetodosExtencion;

import com.example.Curso_SpringBoot.Dto.Response.EmpleadoResponse;
import com.example.Curso_SpringBoot.Dto.Response.UsuarioResponse;
import com.example.Curso_SpringBoot.Entidades.EmpleadoModel;
import com.example.Curso_SpringBoot.Entidades.Usuariomodel;

public class EntityExtensions {
    //convertir usuario(Entidad) a UsuarioResponse(Dto)
    public  static UsuarioResponse toDtoUsuarioResponse (Usuariomodel usuario){
      if (usuario== null) {

          return null;
      }
       return new UsuarioResponse(usuario.getNombreUser(),usuario.getEmail(), usuario.getRol());
    }
    //convertir Empleado(Entidad) a EmpleadoResponse(Dto)
    public  static EmpleadoResponse toDtoEmpleadoResponse (EmpleadoModel empleado){

        if (empleado == null){
            return  null;
        }
       return  new EmpleadoResponse(empleado.getNombre(), empleado.getPuesto(), empleado.getSalario());
    }
}
