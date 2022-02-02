package org.generation.blogPessoal.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController  {

	@Autowired
	private UsuarioService UsuarioService;
	private org.generation.blogPessoal.service.UsuarioService usuarioService2;

	public UsuarioService getUsuarioService() {
		return UsuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		UsuarioService = usuarioService;
	}

	@PostMapping("/logar")
	public ResponseEntity<UserLogin> login(@RequestBody Optional<UserLogin> user) {
		usuarioService2 = null;
		return usuarioService2.autenticarUsuario(user)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<UserLogin> postUsuario(@Valid @RequestBody Usuario usuario) {
		
	return usuario.cadastrarUsuario(usuario)
			.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
 }