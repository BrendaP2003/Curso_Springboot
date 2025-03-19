package com.example.Curso_SpringBoot.MetodosExtencion;

import com.example.Curso_SpringBoot.Dto.Request.EmpleadoRequest;
import com.example.Curso_SpringBoot.Dto.Request.UsuarioRequest;
import com.example.Curso_SpringBoot.Entidades.EmpleadoModel;
import com.example.Curso_SpringBoot.Entidades.Usuariomodel;

public class DtoExtensions {

    //convertir Dto(UsuarioRequest) a entidad (UsuarioModel)

    public static Usuariomodel toEntityUsuario (UsuarioRequest usuarioRequest){
      if(usuarioRequest== null){
          return null;
      }
      return new Usuariomodel(usuarioRequest.Nombre(),usuarioRequest.Email(),usuarioRequest.Rol(), usuarioRequest.Password());

    }
    //convertir Dto (EmpleadoRequest) a entidad (EmpleadoModel)
    public static EmpleadoModel toEntityEmpleado (EmpleadoRequest empleadoRequest){
        if (empleadoRequest== null){
            return null;
        }
        return new EmpleadoModel( empleadoRequest.Nombre(),empleadoRequest.Puesto(), empleadoRequest.Salario());
    }
}
