package main.modelos.DTOs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.stereotype.Service;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

@Service
public class DtoToImpl implements DtoToService {

	@Override
	public Llenado LlenadoToDao(LlenadoDTO llenadoDto) {

		Llenado llenado = new Llenado(UUID.randomUUID().toString(), Calendar.getInstance(),
				llenadoDto.getCantidadCombustible(), llenadoDto.getTipoCombustible(),
				llenadoDto.getImporteCombustible());

		return llenado;
	}

	@Override
	public ArrayList<Llenado> LlenadoListToDao(ArrayList<LlenadoDTO> listDto) {
		ArrayList<Llenado> listDao = new ArrayList<Llenado>();

		for (LlenadoDTO llenado : listDto) {
			listDao.add(LlenadoToDao(llenado));
		}

		return listDao;
	}

	@Override
	public Factura FacturaToDao(FacturaDTO facturaDto) {

		UUID uuid = UUID.randomUUID();
		Calendar fechaHora = Calendar.getInstance();
		Factura factura = new Factura(uuid.toString(), fechaHora, facturaDto.getImporte(), facturaDto.getDniCliente(),
				facturaDto.getMatriculaVehiculo());
		return factura;
	}

	@Override
	public ArrayList<Factura> FacturaListToDao(ArrayList<FacturaDTO> listDto) {
		ArrayList<Factura> listFacturas = new ArrayList<Factura>();
		for (FacturaDTO factura : listDto) {
			listFacturas.add(FacturaToDao(factura));
		}
		return listFacturas;
	}

	@Override
	public ArrayList<TipoCombustible> dtoListToDao(ArrayList<TipoCombustibleDTO> listDto) {
		ArrayList<TipoCombustible> listDao = new ArrayList<TipoCombustible>();

		for (TipoCombustibleDTO tipoCombustible : listDto) {
			listDao.add(tipoCombustibleToDao(tipoCombustible));
		}

		return listDao;

	}

	@Override
	public TipoCombustible tipoCombustibleToDao(TipoCombustibleDTO tipo) {
		TipoCombustible tipoDao = new TipoCombustible(tipo.getTipo(), tipo.getDesc(), tipo.getPrecio());
		return tipoDao;
	}

}
