package main.modelos.Logica;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.modelos.DAL.Factura.FacturaImpl;
import main.modelos.DAL.Llenado.LlenadoImpl;

import main.modelos.DAL.TipoCombustible.TipoCombustibleImpl;
import main.modelos.DTOs.DtoToImpl;
import main.modelos.DTOs.FacturaDTO;
import main.modelos.DTOs.LlenadoDTO;
import main.modelos.DTOs.TipoCombustibleDTO;
import main.modelos.DTOs.ToDtoImpl;

@Component
public class Consultas {

	@Autowired
	FacturaImpl factura;
	@Autowired
	LlenadoImpl llenado;
	@Autowired
	TipoCombustibleImpl tipo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@Transactional
	public void insertarFactura(FacturaDTO registro) {
		factura.insertarRegistro(dtoTo.FacturaToDao(registro));

	}

	@Transactional
	public ArrayList<FacturaDTO> buscarTodos() {
		return toDto.FacturaListToDao(factura.buscarTodos());
	}

	@Transactional
	public void eliminarUltimoLlenado() {
		llenado.eliminarUltimoRegistro();
	}

	@Transactional
	public void insertarLlenado(LlenadoDTO llenadoDTO) {
		llenado.insertarRegistro(dtoTo.LlenadoToDao(llenadoDTO));
	}

	@Transactional
	public ArrayList<TipoCombustibleDTO> buscarTipoCombustible() {
		return toDto.daoListToDto(tipo.buscarTodos());
	}

	@Transactional
	public TipoCombustibleDTO combustibleById(int id) {
		return toDto.TipoCombustibleToDto(tipo.findById(id));
	}

	@Transactional
	public ArrayList<LlenadoDTO> buscarLlenados() {
		return toDto.LlenadoListToDTo(llenado.buscarTodos());
	}

}
