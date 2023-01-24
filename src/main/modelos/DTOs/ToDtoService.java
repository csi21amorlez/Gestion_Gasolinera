package main.modelos.DTOs;

import java.util.ArrayList;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

// TODO: Auto-generated Javadoc
/**
 * The Interface ToDtoService.
 */
public interface ToDtoService {

	/**
	 * Método convertidor de listas de DAO a listas de DTO para la clase LlenadoDTO.
	 *
	 * @param ArrayList<Llenado> listDAO
	 * @return ArrayList<LlenadoDTO> listDTO
	 */
	public ArrayList<LlenadoDTO> LlenadoListToDTo(ArrayList<Llenado> listLlenados);

	/**
	 * Método convertidor de DAO a DTO para la clase LlenadoDTo.
	 *
	 * @param Llenado dao
	 * @return LlenadoDTO dto
	 */
	public LlenadoDTO LlenadoToDto(Llenado llenado);

	/**
	 * Método convertidor de DTO a DAO para la clase FacturaDTO.
	 *
	 * @param Factura dao
	 * @return FacturaDTO dto
	 */
	public FacturaDTO FacturaToDto(Factura factura);

	/**
	 * Método convertiro de listas de DAO a listas de DTO para la clase FacturaDTO.
	 *
	 * @param listDao the list dao
	 * @return the array list
	 */
	public ArrayList<FacturaDTO> FacturaListToDao(ArrayList<Factura> listDao);

	/**
	 * Método convertidor de listas de repostasjes sin factura a listas de DTO
	 * convencionales.
	 *
	 * @param RepostajeNormalDTO dto
	 * @return FacturaDTO facDto
	 */
	public FacturaDTO toRespostajeNormal(RepostajeNormalDTO repostajeDto);

	/**
	 * Método convertidor de DAO a DTO para la clase TipoCombustibleDTO.
	 *
	 * @param tipoCombustible the tipo combustible
	 * @return the tipo combustible DTO
	 */
	public TipoCombustibleDTO TipoCombustibleToDto(TipoCombustible tipoCombustible);

	/**
	 * Método convertidor de listas de DAO a listas de DTO para la clase
	 * TipoCombustible.
	 *
	 * @param listTipoCombustible the list tipo combustible
	 * @return ArrayList<TipoCombustibleDTO> listDTO
	 */
	public ArrayList<TipoCombustibleDTO> daoListToDto(ArrayList<TipoCombustible> listTipoCombustible);

}
