package main.modelos.DAL.Llenado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import main.modelos.DTOs.LlenadoDTO;


@Component
public class LlenadoImpl implements LlenadoService {

	@PersistenceContext
	EntityManager em;

	public void insertarRegistro(Llenado llenado) {
		em.persist(llenado);

	}

	@Override
	public ArrayList<Llenado> buscarTodos() {
		String sql = "Select e from Llenado e";
		return (ArrayList<Llenado>) em.createQuery(sql).getResultList();
	}
	
	
	@Override
	public void eliminarUltimoRegistro() {
		ArrayList<Llenado> listLlenado = buscarTodos();

		em.remove(listLlenado.get(listLlenado.size() - 1));

	}

}
