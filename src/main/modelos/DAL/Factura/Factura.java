package main.modelos.DAL.Factura;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class Factura.
 */
@Entity
@Table(name = "dlk_gga_repostajes", schema = "sc_gga_repostajes")
public class Factura {

	
/** The md uuid. */
//	ATRIBUTOS
	@Id
	@Column(name = "md_uuid")
	private String mdUuid;
	
	/** The md date. */
	@Column(name = "md_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar mdDate;
	
	/** The importe. */
	@Column(name="importe")
	private double importe;
	
	/** The dni cliente. */
	@Column(name="dni_cliente")
	private String dniCliente;
	
	/** The matricula vehiculo. */
	@Column(name="matricula_vehiculo")
	private String matriculaVehiculo;
	
	
/**
 * Gets the md uuid.
 *
 * @return the md uuid
 */
//	GETTERS Y SETTERS 
	public String getMdUuid() {
		return mdUuid;
	}
	
	/**
	 * Sets the md uuid.
	 *
	 * @param mdUuid the new md uuid
	 */
	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
	}
	
	/**
	 * Gets the md date.
	 *
	 * @return the md date
	 */
	public Calendar getMdDate() {
		return mdDate;
	}
	
	/**
	 * Sets the md date.
	 *
	 * @param mdDate the new md date
	 */
	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
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
	public void setImporte(long importe) {
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
	 * Gets the matricula vehiculo.
	 *
	 * @return the matricula vehiculo
	 */
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}
	
	/**
	 * Sets the matricula vehiculo.
	 *
	 * @param matriculaVehiculo the new matricula vehiculo
	 */
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
/**
 * Instantiates a new factura.
 *
 * @param mdUuid the md uuid
 * @param mdDate the md date
 * @param importe the importe
 * @param dniCliente the dni cliente
 * @param matriculaVehiculo the matricula vehiculo
 */
//	CONSTRUCTORES
	public Factura(String mdUuid, Calendar mdDate, double importe, String dniCliente, String matriculaVehiculo) {
		super();
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
		this.importe = importe;
		this.dniCliente = dniCliente;
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	/**
	 * Instantiates a new factura.
	 */
	public Factura() {
		super();
	}
	
	
	

}
