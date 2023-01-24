package main.modelos.Logica.Ejecucion;

// TODO: Auto-generated Javadoc
/**
 * Interfaz de ejecucion.
 */
public interface EjecucionService {

	/**
	 * Metodo el cual ejecuta toda la lógica necesaría para insertar un repostaje
	 * simple en base de datos.
	 */
	public void repostajeSimple();

	/**
	 * Método el cual ejecuta toda la lógica necesaria para insertar un repostaje
	 * con factura en base de datos.
	 */
	public void repostajeFactura();

	/**
	 * Método que se encarga de mostrar todos los repostajes almacenados en base de
	 * datos.
	 */
	public void mostrarRepostajes();

	/**
	 * Método que suma los importes de todos los respotajes almacenados en base de
	 * datos.
	 */
	public void sumarImportes();

	/**
	 * Método el cual ejecuta toda la lógica necesaría para insertar un llenado de
	 * deposito en base de datos.
	 */
	public void llenarDeposito();

	/**
	 * Método el cual, en caso de fallo en la inserción de datos por parte del
	 * operario, permite eliminar el ultimo registro de llenado de deposito.
	 */
	public void eliminarUltimoLlenado();

	/**
	 * Método el cual muestra todos los llenados de deposito almacenados en base de
	 * datos.
	 */
	public void mostrarLlenados();

}
