package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Corretora")
@SequenceGenerator(name = "corretora", sequenceName = "SQ_Corretora", allocationSize = 1)
public class Corretora {
	
	@Id
	@Column(name = "idCorretora", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "corretora")
	private int id;
	
	@Column(name = "CNPJ", nullable = false, length = 18)
	private String cnpj;
	
	@Column(name = "razaoSocial", nullable = false, length = 100)
	private String razaoSocial;
	
	@Column(name = "nomeFantasia", nullable = false, length = 100)
	private String nomeFantasia;
	
	@Column(name = "telefone", nullable = false, length = 14)
	private String telefone;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@OneToMany(mappedBy="corretora", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Corretor> corretores;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
}
