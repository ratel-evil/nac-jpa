package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ImovelDAO;

public class ImovelDAOImpl extends GenericDAOImpl<Imovel, Integer> implements ImovelDAO{

	public ImovelDAOImpl(EntityManager em) {
		super(em);
	}

}
