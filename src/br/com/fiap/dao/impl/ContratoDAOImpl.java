package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContratoDAO;

public class ContratoDAOImpl extends GenericDAOImpl<Contrato, Integer> implements ContratoDAO {

	public ContratoDAOImpl(EntityManager em) {
		super(em);
	}

}
