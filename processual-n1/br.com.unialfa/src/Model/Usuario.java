package Model;

import java.util.ArrayList;

public class Usuario {
	private int Id;
	private String usuario;
	private String senha;
	private String email; 
	public ArrayList< String > cargo = new ArrayList< String >();
	
	
	public Usuario() {
		cargo.add(null);
		cargo.add("Diretor");
		cargo.add("Gerente");
		cargo.add("Vendedor");
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
