package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContratoDAO;
import br.com.fiap.entity.Contrato;

public class ContratoDAOImpl extends GenericDAOImpl<Contrato, Integer> implements ContratoDAO {

	public ContratoDAOImpl(EntityManager em) {
		super(em);
	}

}
