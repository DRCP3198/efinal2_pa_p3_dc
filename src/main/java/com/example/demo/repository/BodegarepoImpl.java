package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class BodegarepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public List<Bodega> buscarTodos() {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("select b from Bodega b");		
				
		return query.getResultList();
	}

}
