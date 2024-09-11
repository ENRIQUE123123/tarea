package com.upsjb.sesion2.repository;

import com.upsjb.sesion2.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Usuario, Long> {
}
