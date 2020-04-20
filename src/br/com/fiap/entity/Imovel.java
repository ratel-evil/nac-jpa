package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.dao.enums.TipoImovel;

@Entity
@Table(name = "Imovel")
@SequenceGenerator(name = "imovel", sequenceName = "SQ_Imovel", allocationSize = 1)
public class Imovel {
	
	@Id
	@Column(name = "idImovel", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imovel")
	private int id;
	
	@Column(name = "tipoImovel", nullable = false, length = 30)
	@Enumerated(EnumType.STRING)
	private TipoImovel tipoImovel;
	
	@Column(name = "numeroQuartos", nullable = false)
	private int numeroQuartos;
	
	@Column(name = "numeroBanheiros", nullable = false)
	private int numeroBanheiros;
	
	@Column(name = "area", nullable = false)
	private double area;
	
	@Column(name = "valor", nullable = false)
	private double valor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}
	
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	
	public void setNumeroBanheiros(int numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
