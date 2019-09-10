package com.corporativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corporativo.model.Usuario;
import com.corporativo.repository.Usuarios;


@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private Usuarios usuarios;
	
	@GetMapping
	public List<Usuario> listar(){
		return this.usuarios.findAll();
	}
	
}
