/**
 * 
 */
package servicios;

import java.util.Scanner;

/**
 * Implementacion de la operativa de la aplicacion, contendra las operaciones que se realicen con los clientes y compras
 * @author prosdez
 * 10/10/2024
 */
public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void CalculoTotalVentasMensual() {
		// TODO Auto-generated method stub
		System.out.println("Calculando");
	}
	//Añadir compra a un cliente
	@Override
	public void AñadirCompraCliente() {
		// TODO Auto-generated method stub
		System.out.println("Compra añadida a Cliente");
		
	}

	@Override
	public void CrearNuevoCliente() {
		// TODO Auto-generated method stub
		//CREAR SCANNER que utilizara el resto de metodos
		Scanner scanner=new Scanner(System.in);
		
		//CREACION DEL USUARIO INTRODUCIENDO PARAMETROS A AÑADIR EN EL MISMO
		System.out.println("----CREAR CLIENTE----");
		System.out.println("Introduce los campos");
		//Id
		
		//Nombre
		System.out.println("Nombre");
		String nombreUsuario=scanner.nextLine();
		//Apellidos
		System.out.println("Apellidos");
		String apellidosUsuario=scanner.nextLine();
		
		System.out.println("Cliente creado con exito");

	}
	
}
