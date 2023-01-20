package main.modelos.DAL.TipoCombustible;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import main.modelos.DTOs.TipoCombustibleDTO;

@Component
public class TipoCombustibleImpl implements TipoCombustibleService {

	@PersistenceContext
	EntityManager em;

	public void insertarRegistro(TipoCombustible tc) {
		em.persist(tc);

	}

	@Override
	public ArrayList<TipoCombustible> buscarTodos() {
		String sql = "SELECT e FROM TipoCombustible e";
		return (ArrayList<TipoCombustible>) em.createQuery(sql).getResultList();
	}

	@Override
	public TipoCombustible findById(int id) {
		String sql = "FROM TipoCombustible tc WHERE tc.id = " + id;
		return (TipoCombustible) em.createQuery(sql).getSingleResult();
	}

}
