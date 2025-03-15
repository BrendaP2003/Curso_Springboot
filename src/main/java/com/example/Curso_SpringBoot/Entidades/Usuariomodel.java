package com.example.Curso_SpringBoot.Entidades;


import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuariomodel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long  ID;
    public String NombreUser;
    public String Email;
    public String Rol;
    public String Password;

    public Usuariomodel (){

    }

    public Usuariomodel(String password, String rol, String nombreUser, String email) {

        Password = password;
        Rol = rol;
        NombreUser = nombreUser;
        Email = email;
    }



    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNombreUser() {
        return NombreUser;
    }

    public void setNombreUser(String nombreUser) {
        NombreUser = nombreUser;
    }
}
