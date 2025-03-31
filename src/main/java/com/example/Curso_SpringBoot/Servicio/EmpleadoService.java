package com.example.Curso_SpringBoot.Servicio;

import com.example.Curso_SpringBoot.Dto.Request.EmpleadoRequest;
import com.example.Curso_SpringBoot.Dto.Response.EmpleadoResponse;
import com.example.Curso_SpringBoot.Entidades.EmpleadoModel;
import com.example.Curso_SpringBoot.MetodosExtencion.DtoExtensions;
import com.example.Curso_SpringBoot.MetodosExtencion.EntityExtensions;
import com.example.Curso_SpringBoot.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
//Obtener Empleados
    public ArrayList<EmpleadoResponse> ObtenerEmpleados (){
        ArrayList<EmpleadoResponse> ListaEmpleados = new ArrayList<>();

        var empleados= empleadoRepository.findAll();
        for (EmpleadoModel empleadomodel: empleados){
            ListaEmpleados.add(EntityExtensions.toDtoEmpleadoResponse(empleadomodel));

        }
        return ListaEmpleados;
    }
    //obtener mediante Id
    public Optional<EmpleadoResponse> ObtenerPorIdEmpleado(long id){
        Optional<EmpleadoModel>empleado = empleadoRepository.findById(id);

        return empleado.map(EntityExtensions::toDtoEmpleadoResponse);
    }
    //Guardar Empleados

    public  EmpleadoResponse GuadarEmpleados (EmpleadoRequest empleadoRequest) {
        // converti Dto a entidad
    EmpleadoModel Empleado = DtoExtensions.toEntityEmpleado(empleadoRequest);
    EmpleadoModel EmpleadoGuardar = empleadoRepository.save(Empleado);

    //retornar un Dto
        return  EntityExtensions.toDtoEmpleadoResponse(EmpleadoGuardar);
    }

    //Eliminar Empleado

    public boolean EliminarEmpleados (Long id){
        if ((empleadoRepository.existsById(id))){
            empleadoRepository.deleteById(id);

            return  true;
        }else {
            return  false;
        }
    }
}
