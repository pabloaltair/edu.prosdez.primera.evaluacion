/**
 * 
 */
package dto;

import java.time.LocalDateTime;

/**
 * Dto Compras, contiene getters y setters del mismo	
 * @author prosdez
 * 10/10/2024
 */
public class CompraDto {
	//ATRIBUTOS
	long idVenta;
	double importeCompra;
	LocalDateTime fechaCompra;
	
	/**
	 * @param idVenta
	 * @param importeCompra
	 * @param fechaCompra
	 */
	
	//CONSTRUCTOR
	public CompraDto(long idVenta, double importeCompra, LocalDateTime fechaCompra) {
		super();
		this.idVenta = idVenta;
		this.importeCompra = importeCompra;
		this.fechaCompra = fechaCompra;
	}
	//GETTERS AND SETTERS
	/**
	 * @return the idVenta
	 */
	public long getIdVenta() {
		return idVenta;
	}
	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	/**
	 * @return the importeCompra
	 */
	public double getImporteCompra() {
		return importeCompra;
	}
	/**
	 * @param importeCompra the importeCompra to set
	 */
	public void setImporteCompra(double importeCompra) {
		this.importeCompra = importeCompra;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
}
