package main.modelos.DTOs;

import java.util.ArrayList;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

// TODO: Auto-generated Javadoc
/**
 * The Interface DtoToService.
 */
public interface DtoToService {

	/**
	 * Método convertidor de DTO a DAO para la entidad Llenado.
	 *
	 * @param LlenadoDTO dto
	 * @return Llenado dao
	 */
	public Llenado LlenadoToDao(LlenadoDTO llenadoDto);

	/**
	 * Método convertidor de listas de DTO a listas de DAO para la entidad Llenado.
	 *
	 * @param ArrayList<LlenadoDTO> listDto
	 * @return ArrayList<Llenado> listDao
	 */
	public ArrayList<Llenado> LlenadoListToDao(ArrayList<LlenadoDTO> listDto);

	/**
	 * Método convertidor de DTO a DAO para la entidad Factura.
	 *
	 * @param FacturaDTO dto
	 * @return Factura Dao
	 */
	public Factura FacturaToDao(FacturaDTO facturaDto);

	/**
	 * Método convertidor de listas de DTO a listas de DAO para la entidad Factura.
	 *
	 * @param ArrayList<FacturaDTO> listDto
	 * @return ArrayList<Factura> listDao
	 */
	public ArrayList<Factura> FacturaListToDao(ArrayList<FacturaDTO> listDto);

	/**
	 * Método convertidor de listas de DTO a listas de DAO para la entidad
	 * TipoCombustible.
	 *
	 * @param ArrayList<TipoCombustibleDTO> listDto
	 * @return ArrayList<TipoCombustible> listDao
	 */
	public ArrayList<TipoCombustible> dtoListToDao(ArrayList<TipoCombustibleDTO> listDto);

	/**
	 * Método convertidor de DTO a DAO para la entidad TipoCombustible.
	 *
	 * @param tipoCombustibleDTO dto
	 * @return tipoCombustible dao
	 */
	public TipoCombustible tipoCombustibleToDao(TipoCombustibleDTO tipo);

}
