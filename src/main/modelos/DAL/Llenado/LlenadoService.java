package main.modelos.DAL.Llenado;

import java.util.ArrayList;

import main.modelos.DTOs.LlenadoDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface LlenadoService.
 */
public interface LlenadoService {

	/**
	 * Método de insercion de Llenados en base de datos.
	 *
	 * @param Llenado llenado
	 */
	public void insertarRegistro(Llenado llenado);

	/**
	 * Método de obtencion de todos los registros en base de datos.
	 *
	 * @return ArrayList<Llenado>
	 */
	public ArrayList<Llenado> buscarTodos();

	/**
	 * Método de eliminacion del ultimo registro insertado en base de datos.
	 */
	public void eliminarUltimoRegistro();

}
