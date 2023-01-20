package main.modelos.DTOs;

import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class RepostajeNormalDTO.
 */
public class RepostajeNormalDTO {

	/** The fecha hora. */
	private Calendar fechaHora;

	/** The importe. */
	private double importe;

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
	public void setImporte(long importe) {
		this.importe = importe;
	}

	/**
	 * Instantiates a new repostaje normal DTO.
	 *
	 * @param fechaHora the fecha hora
	 * @param importe   the importe
	 */
	public RepostajeNormalDTO(Calendar fechaHora, double importe) {
		super();
		this.fechaHora = fechaHora;
		this.importe = importe;
	}

	/**
	 * Instantiates a new repostaje normal DTO.
	 */
	public RepostajeNormalDTO() {
		super();
	}

}
