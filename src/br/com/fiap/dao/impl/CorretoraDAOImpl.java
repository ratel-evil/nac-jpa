package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CorretoraDAO;
import br.com.fiap.entity.Corretora;

public class CorretoraDAOImpl extends GenericDAOImpl<Corretora, Integer> implements CorretoraDAO{

	public CorretoraDAOImpl(EntityManager em) {
		super(em);
	}

	
}
