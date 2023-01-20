package main.modelos.DAL.Factura;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface FacturaService.
 */
public interface FacturaService {

	/**
	 * Insertar registro de facturas en la base de datos.
	 *
	 * @param fac the fac
	 */
	public void insertarRegistro(Factura fac);

	/**
	 * Buscar todos los registros de facturas en la base de datos.
	 *
	 * @return the array list
	 */
	public ArrayList<Factura> buscarTodos();

}
