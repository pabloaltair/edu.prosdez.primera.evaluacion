/**
 * 
 */
package dto;

/**
 * Contendra los atributos, getters y setters del cliente	
 * @author prosdez
 * 10/10/2024
 */
public class ClienteDto {
	//ATRIBUTOS
	long idCliente;
	String nombreCliente;
	String apellidosCliente;
	/**
	 * @param idCliente
	 * @param nombreCliente
	 * @param apellidosCliente
	 */
	//CONSTRUCTOR
	public ClienteDto(long idCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}
	/**
	 * @return the idCliente
	 */
	//GETTERS Y SETTERS
	public long getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the apellidosCliente
	 */
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	/**
	 * @param apellidosCliente the apellidosCliente to set
	 */
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
}
