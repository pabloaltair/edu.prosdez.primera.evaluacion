package controladores;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase de acceso aplicacion
 * 10/10/2024
 * @author prosdez
 */
public class Main {
	
	
	//COMIENZO CLASE METODO MAIN
	public static void main(String[] args) {
		
		//IMPLEMENTACION INTERFAZ
		MenuInterfaz mi = new MenuImplementacion();
		/**Crear boolean para abrir y cerrar menu */
		boolean esCerrado = false;
		
		/**Utilizamos byte ya que ocupa menos memoria que int, bite ocupa menos de 128 y 127 */
		/**Control reserva el maximo espacio para byte */
		
		byte control;
		
		//CREAR Y ESTABLECER LA CONEXION
		do {
			control = mi.MostrarMenuYOpcion();
			try {
				switch(control) {
				
					case 0:
						System.out.println("La aplicacion se cerro con exito");
						esCerrado = true;
						
						break;
					case 1:
						System.out.println("Accediendo a menu Empleado...");
						control = mi.MenuEmpleado();
						break;
					case 2:
						System.out.println("Accediendo a menu Gerencia");
						control =  mi.MenuGerencia();
						break;	
						
					default:
						
						System.out.println("ERROR: Seleccione una opción valida");
						break;
				
				}
			}
			catch(Exception e) {
			System.out.println("Ha habido un error en el sistema");	
			}
		
			
		}while(!esCerrado);
		
	}

}
