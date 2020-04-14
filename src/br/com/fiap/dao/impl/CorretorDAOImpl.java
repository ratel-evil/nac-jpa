package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CorretoraDAO;

public class CorretorDAOImpl extends GenericDAOImpl<Corretor, Integer> implements CorretoraDAO{

	public CorretorDAOImpl(EntityManager em) {
		super(em);
	}

}
