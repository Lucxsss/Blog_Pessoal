package org.generation.blogPessoal.model;

public class UserLogin {

	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;
	
	private String foto;
	
	private String tipos;
	
	
	
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setId(long id) {
		
	}

	public void setFoto(Object foto) {
		
	}

	public void setTipo(Object tipo) {
	
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	
}
