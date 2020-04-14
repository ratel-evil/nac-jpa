package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.KeyNotFoundException;

public class GenericDAOImpl<E, Integer> implements GenericDAO<E, Integer>{

	EntityManager em = null;
	private Class<E> clazz;

	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em; 
		this.clazz = (Class<E>) ((ParameterizedType)getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}
	
	
	@Override
	public void cadastrar(E entidade) {
		em.persist(entidade);
	}

	@Override
	public void atualizar(E entidade) throws KeyNotFoundException {
		em.merge(entidade);
	}

	@Override
	public void deletar(Integer codigo) throws KeyNotFoundException {
		em.remove(codigo);
	}

	@Override
	public E pesquisa(Integer codigo) throws KeyNotFoundException {
		E entidade = em.find(clazz, codigo);
		return entidade;
	}

	@Override
	public void commit() throws CommitException {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
