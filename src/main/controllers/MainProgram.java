package main.controllers;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import main.modelos.Logica.Ejecucion.EjecucionImpl;
import main.modelos.Logica.Ejecucion.EjecucionService;
import main.modelos.Logica.Recursos.RecursosImpl;
import main.modelos.Logica.Recursos.RecursosService;

@Controller
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		RecursosService recursos = (RecursosImpl) ac.getBean(RecursosImpl.class);
		EjecucionService ejecucion = (EjecucionImpl) ac.getBean(EjecucionImpl.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Test");
		int key;

		do {
			recursos.menu();
			key = sc.nextInt();
			switch (key) {
				case 1: // Realiza un repostaje simple
					ejecucion.repostajeSimple();
					break;
				case 2: // Realiza un repostaje con factura completa
					ejecucion.repostajeFactura();
					break;
				case 3: // Muestra todos los repostajes
					ejecucion.mostrarRepostajes();
					break;
				case 4:// Muestra la suma de todos los importes registrados en base de datos
					ejecucion.sumarImportes();
					break;
				case 5:// Llena el deposito de la gasolinera
					ejecucion.llenarDeposito();
					break;
				case 6:// Elimina el ultimo registro de llenado de gasolinera
					ejecucion.eliminarUltimoLlenado();
					break;
				case 7: // Muestra todos los llenados de deposito
					ejecucion.mostrarLlenados();
				case 0:
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}

		} while (key != 0);
		System.out.println("Cerrando el programa");
		sc.close();
	}

}
