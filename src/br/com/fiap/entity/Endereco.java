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
@Table(name = "Endereco")
@SequenceGenerator(name = "endereco", sequenceName = "SQ_Endereco", allocationSize = 1)
public class Endereco {
	
	@Id
	@Column(name = "idEndereco", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco")
	private int id;
	
	@Column(name = "cep", nullable = false, length = 10)
	private String cep;
	
	@Column(name = "logradouro", nullable = false, length = 50)
	private String logradouro;
	
	@Column(name = "numero", nullable = false)
	private int numero;
	
	@Column(name = "complemento", nullable = false, length = 50)
	private String complemento;
	
	@Column(name = "bairro", nullable = false, length = 100)
	private String bairro;
	
	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;
	
	@Column(name = "uf", nullable = false, length = 2)
	private String uf;
	
	@OneToMany(mappedBy="endereco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="endereco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Imovel> imoveis;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
}
