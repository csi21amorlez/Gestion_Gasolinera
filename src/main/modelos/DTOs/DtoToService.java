package main.modelos.DTOs;

import java.util.ArrayList;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

public interface DtoToService {
	
	public Llenado LlenadoToDao(LlenadoDTO llenadoDto);
	
	public ArrayList<Llenado> LlenadoListToDao(ArrayList<LlenadoDTO> listDto);
	
	public Factura FacturaToDao(FacturaDTO facturaDto);
	
	public ArrayList<Factura> FacturaListToDao(ArrayList<FacturaDTO> listDto);
	
	public ArrayList<TipoCombustible> dtoListToDao(ArrayList<TipoCombustibleDTO> listDto);
	
	public TipoCombustible  tipoCombustibleToDao(TipoCombustibleDTO tipo);

}
