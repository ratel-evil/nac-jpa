package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
@SequenceGenerator(name = "usuario", sequenceName = "SQ_Usuario", allocationSize = 1)
public class Usuario {
	
	@Id
	@Column(name = "idUsuario", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	private int id;
	
	@Column(name = "CPF", nullable = false, length = 14)
	private String cpf;
	
	@Column(name = "nomeUsuario", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "telefone", nullable = false, length = 14)
	private String telefone;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(
		name = "Usuario_Endereco",
		joinColumns = @JoinColumn(name ="idUsuario"),
		inverseJoinColumns = @JoinColumn(name = "idEndereco")
	)
	private List<Endereco> endereco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
}
