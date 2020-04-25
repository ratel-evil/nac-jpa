package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CorretorDAO;
import br.com.fiap.entity.Corretor;

public class CorretorDAOImpl extends GenericDAOImpl<Corretor, Integer> implements CorretorDAO{

	public CorretorDAOImpl(EntityManager em) {
		super(em);
	}

}
