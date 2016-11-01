package br.org.silva.listatelefonica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.org.silva.listatelefonica.model.Operadora;

@Repository
@Transactional
public class OperaoraDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Operadora> getOperadoras(){
		return entityManager.createNativeQuery("select * from operadora", Operadora.class).getResultList(); 
	}
	
}
