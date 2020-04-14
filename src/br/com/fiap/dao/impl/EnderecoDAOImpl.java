package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDAO;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco, Integer> implements EnderecoDAO{

	public EnderecoDAOImpl(EntityManager em) {
		super(em);
	}

}
