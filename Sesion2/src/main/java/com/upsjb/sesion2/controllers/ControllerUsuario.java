package com.upsjb.sesion2.controllers;

import com.upsjb.sesion2.models.Usuario;
import com.upsjb.sesion2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




    @RestController
    public class ControllerUsuario {
        @Autowired
        private Repository repo;

        @GetMapping
        public String index() {
            return "conectado";
        }

        @GetMapping("Usuario")
        public List<Usuario> getUsuario() {
            return repo.findAll();
        }

        @PostMapping("grabar")
        public String post(@RequestBody Usuario usuario) {
            repo.save(usuario);
            return "grabado";
        }

        @DeleteMapping("delete/{idUsuario}")
        public String delete(@PathVariable Long idUsuario) {
            repo.deleteById(idUsuario);
            return "Eliminado";
        }

        @PutMapping("editar/{idUsuario}")
        public String update(@PathVariable Long idUsuario, @RequestBody Usuario usuario) {
            Usuario updateUsuario;
            updateUsuario = repo.findById(idUsuario).get();
            updateUsuario.setNombre(usuario.getNombre());
            updateUsuario.setApellido(usuario.getApellido());
            updateUsuario.setCorreo_electronico(usuario.getCorreo_electronico());
            updateUsuario.setTelefono(usuario.getTelefono());
            updateUsuario.setDireccion(usuario.getDireccion());
            updateUsuario.setCiudad(usuario.getCiudad());
            updateUsuario.setEstado(usuario.getEstado());
            updateUsuario.setCodigo_postal(usuario.getCodigo_postal());
            updateUsuario.setFecha_nacimiento(usuario.getFecha_nacimiento());
            updateUsuario.setFecha_registro(usuario.getFecha_registro());
            updateUsuario.setTipo_usuario(usuario.getTipo_usuario());
            updateUsuario.setEstado_cuenta(usuario.getEstado_cuenta());
            updateUsuario.setUltimo_login(usuario.getUltimo_login());
            updateUsuario.setActivo(usuario.getActivo());
            repo.save(updateUsuario);
            return "Editado Correctamente";


        }


    }
