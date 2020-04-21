package br.com.fiap.entity;

import java.util.Calendar;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.dao.enums.TipoContrato;

@Entity
@Table(name = "Contrato")
@SequenceGenerator(name = "contrato", sequenceName = "SQ_Contrato", allocationSize = 1)
public class Contrato {
	
	@Id
	@Column(name = "idContrato", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contrato")
	private int id;
	
	@Column(name = "dataAbertura", nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Calendar dataAbertura;
	
	@Column(name = "dataFechamento", nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Calendar dataFechamento;
	
	@Column(name = "tipoContrato", nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCorretor")
	private Corretor corretor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idImovel")
	private Imovel imovel;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Calendar getDataFechamento() {
		return dataFechamento;
	}
	
	public void setDataFechamento(Calendar dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
	public Corretor getCorretor() {
		return corretor;
	}
	
	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Imovel getImovel() {
		return imovel;
	}
	
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
}
