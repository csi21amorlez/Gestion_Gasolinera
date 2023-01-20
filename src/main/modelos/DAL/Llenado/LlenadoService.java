package main.modelos.DAL.Llenado;

import java.util.ArrayList;

import main.modelos.DTOs.LlenadoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface LlenadoService.
 */
public interface LlenadoService {

	/**
	 * Insertar registro.
	 *
	 * @param llenado the llenado
	 */
	public void insertarRegistro(Llenado llenado);

	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<Llenado> buscarTodos();

	/**
	 * Eliminar ultimo registro.
	 */
	public void eliminarUltimoRegistro();

}
