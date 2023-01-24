package main.modelos.DAL.TipoCombustible;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface TipoCombustibleService.
 */

public interface TipoCombustibleService {

	/**
	 * Insertar registro.
	 *
	 * @param TipoCombustible tipo
	 */
	public void insertarRegistro(TipoCombustible tc);

	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<TipoCombustible> buscarTodos();

	/**
	 * Find by id.
	 *
	 * @return TipoCombustible tipo
	 */
	public TipoCombustible findById(int id);

}
