package com.upsjb.sesion2.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String correo_electronico;
    @Column
    private String telefono;
    @Column
    private String direccion;
    @Column
    private String ciudad;
    @Column
    private String estado;
    @Column
    private String codigo_postal;
    @Column
    private String fecha_nacimiento;
    @Column
    private String fecha_registro;
    @Column
    private String tipo_usuario;
    @Column
    private String estado_cuenta;
    @Column
    private String ultimo_login;
    @Column
    private String activo;

}
