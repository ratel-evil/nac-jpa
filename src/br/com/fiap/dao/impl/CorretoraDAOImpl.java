package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CorretoraDAO;

public class CorretoraDAOImpl extends GenericDAOImpl<Corretora, Integer> implements CorretoraDAO{

	public CorretoraDAOImpl(EntityManager em) {
		super(em);
	}

	
}
