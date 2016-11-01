package br.org.silva.listatelefonica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.org.silva.listatelefonica.model.Contato;

@Repository
@Transactional
public class ContatoDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Contato contato){
		entityManager.persist(contato);
	}
	
	public void update(Contato contato){
		entityManager.merge(contato);
	}
	
	public void delete(Contato contato){
		entityManager.remove(contato);
	}
	
	@SuppressWarnings("unchecked")
	public List<Contato> getContacts(){
		return entityManager.createNativeQuery("select * from contato", Contato.class).getResultList();
	}
	
	public Contato getById(Long id) {
		return entityManager.find(Contato.class, id);
	}
	
}
