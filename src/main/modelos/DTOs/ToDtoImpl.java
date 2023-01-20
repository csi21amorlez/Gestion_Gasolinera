package main.modelos.DTOs;

import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Service;

import main.modelos.DAL.Factura.Factura;
import main.modelos.DAL.Llenado.Llenado;
import main.modelos.DAL.TipoCombustible.TipoCombustible;

@Service
public class ToDtoImpl implements ToDtoService {

	@Override
	public ArrayList<LlenadoDTO> LlenadoListToDTo(ArrayList<Llenado> listLlenados) {
		ArrayList<LlenadoDTO> listDto = new ArrayList<LlenadoDTO>();

		for (Llenado llenado : listLlenados) {
			listDto.add(LlenadoToDto(llenado));
		}

		return listDto;
	}

	@Override
	public LlenadoDTO LlenadoToDto(Llenado llenado) {
		LlenadoDTO dto = new LlenadoDTO(llenado.getMdDate(), llenado.getTipoCombustible(), llenado.getCantidadLitros(),
				llenado.getCantidadLitros());

		return dto;
	}

	@Override
	public FacturaDTO FacturaToDto(Factura factura) {
		FacturaDTO dto = new FacturaDTO(factura.getMdDate(), factura.getImporte(), factura.getDniCliente(),
				factura.getMatriculaVehiculo());

		return dto;

	}

	@Override
	public ArrayList<FacturaDTO> FacturaListToDao(ArrayList<Factura> listDao) {
		ArrayList<FacturaDTO> listDto = new ArrayList<FacturaDTO>();

		for (Factura factura : listDao) {
			listDto.add(FacturaToDto(factura));
		}

		return listDto;
	}

	@Override
	public FacturaDTO toRespostajeNormal(RepostajeNormalDTO repostajeDto) {

		FacturaDTO fac = new FacturaDTO(Calendar.getInstance(), repostajeDto.getImporte(), "Sin informacion",
				"Sin informacion");

		return fac;
	}

	@Override
	public TipoCombustibleDTO TipoCombustibleToDto(TipoCombustible tipoCombustible) {

		TipoCombustibleDTO dto = new TipoCombustibleDTO(tipoCombustible.getId(), tipoCombustible.getPrecio(),
				tipoCombustible.getDes_combustible());
		return dto;
	}

	@Override
	public ArrayList<TipoCombustibleDTO> daoListToDto(ArrayList<TipoCombustible> listTipoCombustible) {
		ArrayList<TipoCombustibleDTO> listDto = new ArrayList<TipoCombustibleDTO>();

		for (TipoCombustible tipoCombustible : listTipoCombustible) {
			listDto.add(TipoCombustibleToDto(tipoCombustible));
		}

		return listDto;
	}

}
