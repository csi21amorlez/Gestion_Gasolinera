package main.modelos.DTOs;

import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class FacturaDTO.
 */
public class FacturaDTO {

	/** The fecha hora. */
	private Calendar fechaHora;

	/** The importe. */
	private double importe;

	/** The dni cliente. */
	private String dniCliente;

	/** The matricula vehiculo. */
	private String matriculaVehiculo;

	/**
	 * Gets the fecha hora.
	 *
	 * @return the fecha hora
	 */
	public Calendar getFechaHora() {
		return fechaHora;
	}

	/**
	 * Sets the fecha hora.
	 *
	 * @param fechaHora the new fecha hora
	 */
	public void setFechaHora(Calendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * Gets the importe.
	 *
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * Sets the importe.
	 *
	 * @param importe the new importe
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}

	/**
	 * Gets the dni cliente.
	 *
	 * @return the dni cliente
	 */
	public String getDniCliente() {
		return dniCliente;
	}

	/**
	 * Sets the dni cliente.
	 *
	 * @param dniCliente the new dni cliente
	 */
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	/**
	 * Obtiene la matricula de un vehiculo registrado en la base de datos.
	 *
	 * @return matricula vehiculo
	 */
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	/**
	 * Establece la matricula de un vehiculo.
	 *
	 * @param matriculaVehiculo the new matricula vehiculo
	 */
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}

	/**
	 * Instantiates a new factura DTO.
	 *
	 * @param fechaHora         the fecha hora
	 * @param importe           the importe
	 * @param dniCliente        the dni cliente
	 * @param matriculaVehiculo the matricula vehiculo
	 */
	public FacturaDTO(Calendar fechaHora, double importe, String dniCliente, String matriculaVehiculo) {
		super();
		this.fechaHora = fechaHora;
		this.importe = importe;
		this.dniCliente = dniCliente;
		this.matriculaVehiculo = matriculaVehiculo;
	}

	@Override
	public String toString() {
		return "[fechaHora=" + fechaHora.getTime() + ", importe=" + importe + ", dniCliente=" + dniCliente
				+ ", matriculaVehiculo=" + matriculaVehiculo + "]";
	}

	/**
	 * Instantiates a new factura DTO.
	 */
	public FacturaDTO() {
		super();
	}

}
