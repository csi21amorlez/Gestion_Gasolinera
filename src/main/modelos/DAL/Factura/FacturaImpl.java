package main.modelos.DAL.Factura;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import main.modelos.DTOs.FacturaDTO;
import main.modelos.DTOs.RepostajeNormalDTO;

/*
 * FacturaImpl --> Clase que implementa la interfaz FacturaService
 */

@Component
public class FacturaImpl implements FacturaService {

	@PersistenceContext
	EntityManager em;

	public void insertarRegistro(Factura fac) {
		em.persist(fac);

	}

	@Override
	public ArrayList<Factura> buscarTodos() {
		String sql = "FROM Factura e";
		return (ArrayList<Factura>) em.createQuery(sql).getResultList();
	}
	
}
