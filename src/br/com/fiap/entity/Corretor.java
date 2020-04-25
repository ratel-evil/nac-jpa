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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Corretor")
@SequenceGenerator(name = "corretor", sequenceName = "SQ_Corretor", allocationSize = 1)
public class Corretor {
	
	@Id
	@Column(name = "idCorretor", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "corretor")
	private int id;
	
	@Column(name = "CPF", nullable = false, length = 14)
	private String cpf;
	
	@Column(name = "nomeCorretor", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "telefone", nullable = false, length = 14)
	private String telefone;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idCorretora")
	private Corretora corretora;
	
	@OneToMany(mappedBy="corretor", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<Contrato> contratos;
	
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
	
	public String getNomeCorretor() {
		return nome;
	}
	
	public void setNomeCorretor(String nome) {
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
	
	public Corretora getCorretora() {
		return corretora;
	}
	
	public void setCorretora(Corretora corretora) {
		this.corretora = corretora;
	}
}
