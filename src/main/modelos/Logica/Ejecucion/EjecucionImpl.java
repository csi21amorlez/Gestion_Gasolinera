package main.modelos.Logica.Ejecucion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import main.modelos.DTOs.DtoToImpl;
import main.modelos.DTOs.FacturaDTO;
import main.modelos.DTOs.LlenadoDTO;
import main.modelos.DTOs.RepostajeNormalDTO;
import main.modelos.DTOs.ToDtoImpl;
import main.modelos.Logica.Consultas;
import main.modelos.Logica.Recursos.RecursosService;

@Service
public class EjecucionImpl implements EjecucionService {

	@Autowired
	Consultas c;
	@Autowired
	RecursosService r;
	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	ToDtoImpl toDto;

	Scanner sc = new Scanner(System.in);

	@Override
	public void repostajeSimple() {
		try{
			System.out.println("[REPOSTAJE NORMAL]");
		System.out.println("Cantidad a repostar? [EUROS]");
		c.insertarFactura(toDto.toRespostajeNormal(new RepostajeNormalDTO(Calendar.getInstance(), sc.nextDouble())));
		System.out.println("Pulse para continuar...");
		sc.next();
		} catch (Exception e){
			System.out.println("[INFO] -- Error de formato en algun campo, por favor, pruebe de nuevo");
		}
		
	}

	@Override
	public void repostajeFactura() {
		// TODO Auto-generated method stub
		try {
			System.out.println("[FACTURA COMPLETA]");
			System.out.println("Cantidad a repostar? [EUROS]");
			double importe = sc.nextDouble();
			System.out.println("Introduzca su DNI ");
			String dni = sc.next();
			System.out.println("Introduzca la matricula del vehiculo");
			String matricula = sc.next();
			c.insertarFactura(new FacturaDTO(Calendar.getInstance(), importe, dni, matricula));
			System.out.println("Pulse para continuar...");
			sc.next();
		} catch (Exception e) {
			System.out.println("[INFO] -- Error de formato en algun campo, por favor, pruebe de nuevo");
		}

	}

	@Override
	public void mostrarRepostajes() {
		// TODO Auto-generated method stub
		try {
			System.out.println("[MOSTRANDO TODOS LOS REPOSTAJES]");
			ArrayList<FacturaDTO> listFacturas = c.buscarTodos();
			for (FacturaDTO facturaDTO : listFacturas) {
				System.out.println(facturaDTO.toString());
			}
			System.out.println("Pulse para continuar...");
			sc.next();
		} catch (Exception e) {
			System.out.println("[INFO] -- No se tiene informacion de ningun repostaje, intentelo mas tarde");
		}
	}

	@Override
	public void sumarImportes() {
		// TODO Auto-generated method stub
		System.out.println("[SUMA DE TODOS LOS IMPORTES]");
		ArrayList<FacturaDTO> listFactuasDto = c.buscarTodos();
		double suma = 0;
		for (FacturaDTO facturaDTO : listFactuasDto) {
			suma = suma + facturaDTO.getImporte();
		}
		System.out.println("La suma total de los importes es: " + suma + "euros");
		System.out.println("Pulse para continuar...");
		sc.next();

	}

	@Override
	public void llenarDeposito() {
		// TODO Auto-generated method stub
		try {
			System.out.println("[LLENANDO EL DEPOSITO]");
			System.out.println("Tipo de combustible\n 1-Diesel 2-Gasolina-95 3- Gasolina-98");
			int idCombustible = sc.nextInt();
			double precio = c.combustibleById(idCombustible).getPrecio();
			System.out.println(precio);
			System.out.println("Cantidad a repostar");
			double cantidad = sc.nextDouble();
			System.out.println(String.format("Total a pagar [%f]", precio * cantidad));
			c.insertarLlenado(new LlenadoDTO(Calendar.getInstance(), idCombustible, cantidad, cantidad * precio));

			System.out.println("Pulse para continuar...");
			sc.next();
		} catch (Exception e) {
			System.out.println("[INFO] -- Error de formato en algun campo, por favor, pruebe de nuevo");

		}
	}

	@Override
	public void eliminarUltimoLlenado() {
		// TODO Auto-generated method stub
		try {
			System.out.println("[ELIMINANDO ULTIMO LLENADO]");
			c.eliminarUltimoLlenado();
			System.out.println("Pulse para continuar...");
			sc.next();
		} catch (Exception e) {
			System.out.println("[INFO] -- No se tiene constancia de ningun llenado, pruebe de nuevo mas tarde");
		}
	}

	@Override
	public void mostrarLlenados() {
		// TODO Auto-generated method stub
		try {
			ArrayList<LlenadoDTO> listLlenadosDto = c.buscarLlenados();
			for (LlenadoDTO llenado : listLlenadosDto) {
				System.out.println(llenado.toString());
			}
			System.out.println("Pulse para continuar...");
			sc.next();

		} catch (Exception e) {
			System.out.println("[INFO] -- No se tiene constancia de ningun llenado, pruebe de nuevo mas tarde");
		}
		System.out.println("Case 7");

	}

}
