package com.corporativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corporativo.model.Usuario;


public interface Usuarios extends JpaRepository<Usuario, Long>{

}
