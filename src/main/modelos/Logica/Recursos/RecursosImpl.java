package main.modelos.Logica.Recursos;

import org.springframework.stereotype.Service;

@Service
public class RecursosImpl implements RecursosService {

	public void menu() {
		System.out.println("\n\n\n\n\n\n\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║ Opciones de la Gasolinera                  ║");
		System.out.println("\t\t\t╠════════════════════════════════════════════╣");
		System.out.println("\t\t\t║ 1) Respostaje con simple                   ║");
		System.out.println("\t\t\t║ 2) Repostaje con Factura                   ║");
		System.out.println("\t\t\t║ 3) Ver todos los repostajes                ║");
		System.out.println("\t\t\t║ 4) Importe total del combustible vendido   ║");
		System.out.println("\t\t\t║ 5) Llenado de deposito                     ║");
		System.out.println("\t\t\t║ 6) Eliminar el ultimo llenado de deposito  ║");
		System.out.println("\t\t\t║ 7) Ver todos los llenados de deposito      ║");
		System.out.println("\t\t\t║                                            ║");
		System.out.println("\t\t\t║ 0) Salir                                   ║");
		System.out.println("\t\t\t║                                            ║");
		System.out.println("\t\t\t╚════════════════════════════════════════════╝");
	}

}
