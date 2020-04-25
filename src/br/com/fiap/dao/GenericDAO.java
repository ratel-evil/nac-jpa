package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.KeyNotFoundException;

public interface GenericDAO<E, K> {

	public void cadastrar(E entidade);
	public void atualizar(E entidade) throws KeyNotFoundException;
	public void deletar(K codigo) throws KeyNotFoundException;
	public E pesquisa(K codigo) throws KeyNotFoundException;
	public void commit() throws CommitException;
	
}