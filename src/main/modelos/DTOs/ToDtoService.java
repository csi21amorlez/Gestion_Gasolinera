package main.modelos.DTOs;

import java.util.ArrayList;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

public interface ToDtoService {

	public ArrayList<LlenadoDTO> LlenadoListToDTo(ArrayList<Llenado> listLlenados);
	
	public LlenadoDTO LlenadoToDto(Llenado llenado);
	
	public FacturaDTO FacturaToDto(Factura factura);
	
	public ArrayList<FacturaDTO> FacturaListToDao(ArrayList<Factura> listDao) ;
	
	public FacturaDTO toRespostajeNormal(RepostajeNormalDTO repostajeDto);
	
	public TipoCombustibleDTO TipoCombustibleToDto(TipoCombustible tipoCombustible);
	
	public ArrayList<TipoCombustibleDTO> daoListToDto(ArrayList<TipoCombustible> listTipoCombustible);
	
	
}
