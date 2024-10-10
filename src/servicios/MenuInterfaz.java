package servicios;
/**
 * Servicio que gestione el menu principal	
 * @author prosdez
 * 10/10/2024
 */


public interface MenuInterfaz {
		
	/**
	 * Servicio que gestione el menu principal para acceder a menus secundarios
	 * @return opcion del usuario de tipo byte
	 * 10/10/2024
	 * @author prosdez
	 */
		public byte MostrarMenuYOpcion();
		public byte MenuEmpleado();
		public byte MenuGerencia();
		
}


