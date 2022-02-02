package org.generation.blogPessoal.model;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 110)
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 110)
	private String usuario;
	
	
	@NotNull
	@Size(min = 5, max = 110)
	private String senha;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Object getFoto() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getTipo() {
		// TODO Auto-generated method stub
		return null;
	}


	public Optional<UserLogin> cadastrarUsuario(@Valid Usuario usuario2) {
		// TODO Auto-generated method stub
		return null;
	}
}