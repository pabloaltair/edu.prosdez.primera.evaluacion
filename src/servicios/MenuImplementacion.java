/**
 * 
 */
package servicios;

import java.util.Scanner;

/**
 * Servicio que gestione el menu principal	
 * @author prosdez
 * 10/10/2024
 */
public class MenuImplementacion implements MenuInterfaz {
	boolean esCerrado=false;
	OperativaInterfaz op=new OperativaImplementacion();
	@Override
 	/**
	 * Menu principal que hace de acceso entre menus secundarios MenuEmpleado y MenuGerencia
	 * @return
	 * @author prosdez
	 * 10/10/2024
	 */
	public byte MostrarMenuYOpcion() {
		// TODO Auto-generated method stub
		System.out.println("----MENU PRINCIPAL----");
		System.out.println("¿Que desea realizar?");
		System.out.println("0. Cerrar Apicacion");
		System.out.println("1. Acceder menu empleado");
		System.out.println("2. Acceder menu gerencia");
		
		/**
		 * Escaner que recoge la opcion seleccionada por el usuario, y se le devuelve
		 * @return
		 * @author prosdez
		 * 10/10/2024
		 */
		Scanner scanner = new Scanner(System.in);
		byte control=scanner.nextByte();
		return control;
	}
	//MENU PRINCIPAL QUE ACCEDE A OTROS MENUS

	@Override
	public byte MenuEmpleado() {
		// TODO Auto-generated method stub
		System.out.println("----MENU EMPLEADO----");
		System.out.println("¿Que desea realizar?");
		System.out.println("0. Volver Menu Principal");
		System.out.println("1. Calculo total de ventas mensual");
		System.out.println("2. Añadir compras a un cliente");
		
		/**
		 * Escaner que recoge la opcion seleccionada por el usuario, y se le devuelve
		 * @return
		 * @author prosdez
		 * 10/10/2024
		 */
		Scanner scanner = new Scanner(System.in);
		byte control=scanner.nextByte();
			//control errores
			try {
				//menu opciones
				switch(control) {
				
					case 0:
						System.out.println("Volviendo al menu principal");
						esCerrado = true;
						
						break;
					case 1:
						System.out.println("Calculo total de ventas mensual");
						op.CalculoTotalVentasMensual();
						break;
					case 2:
						System.out.println("Añadir compras a un cliente");
						op.AñadirCompraCliente();
						break;	
						
					default:
						
						System.out.println("ERROR: Seleccione una opción valida");
						break;
				
				}
			}
			catch(Exception e) {
			System.out.println("Ha habido un error en el sistema");	
			}
		
		return control;
		
	}

	@Override
	public byte MenuGerencia() {
		
		// TODO Auto-generated method stub
		System.out.println("----MENU GERENCIA----");
		System.out.println("¿Que desea realizar?");
		System.out.println("0. Volver al menu principal");
		System.out.println("1. Crear nuevo cliente");
		
		/**
		 * Escaner que recoge la opcion seleccionada por el usuario, y se le devuelve
		 * @return
		 * @author prosdez
		 * 10/10/2024
		 */
		Scanner scanner = new Scanner(System.in);
		byte control=scanner.nextByte();
		//control errores
		try {
			//menu opciones
			switch(control) {
			
				case 0:
					System.out.println("Volviendo al menu principal");
					esCerrado = true;
					
					break;
				case 1:
					System.out.println("Creacion nuevo cliente");
					op.CrearNuevoCliente();
					break;

					
				default:
					
					System.out.println("ERROR: Seleccione una opción valida");
					break;
			
			}
		}
		catch(Exception e) {
		System.out.println("Ha habido un error en el sistema");	
		}
		return control;
	}

	
}
