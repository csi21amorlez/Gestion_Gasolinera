package main.modelos.DTOs;

import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class LlenadoDTO.
 */
public class LlenadoDTO {

	/** The fecha hora. */
	private Calendar fechaHora;

	/** The tipo combustible. */
	private int tipoCombustible;

	/** The cantidad combustible. */
	private double cantidadCombustible;

	/** The importe combustible. */
	private double importeCombustible;

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
	 * Gets the tipo combustible.
	 *
	 * @return the tipo combustible
	 */
	public int getTipoCombustible() {
		return tipoCombustible;
	}

	/**
	 * Sets the tipo combustible.
	 *
	 * @param tipoCombustible the new tipo combustible
	 */
	public void setTipoCombustible(int tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	/**
	 * Gets the cantidad combustible.
	 *
	 * @return the cantidad combustible
	 */
	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	/**
	 * Sets the cantidad combustible.
	 *
	 * @param cantidadCombustible the new cantidad combustible
	 */
	public void setCantidadCombustible(long cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	/**
	 * Gets the importe combustible.
	 *
	 * @return the importe combustible
	 */
	public double getImporteCombustible() {
		return importeCombustible;
	}

	/**
	 * Sets the importe combustible.
	 *
	 * @param importeCombustible the new importe combustible
	 */
	public void setImporteCombustible(double importeCombustible) {
		this.importeCombustible = importeCombustible;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "LlenadoDTO [fechaHora=" + fechaHora.getTime() + ", tipoCombustible=" + tipoCombustible + ", cantidadCombustible="
				+ cantidadCombustible + ", importeCombustible=" + importeCombustible + "]";
	}

	/**
	 * Instantiates a new llenado DTO.
	 *
	 * @param fechaHora           the fecha hora
	 * @param tipoCombustible     the tipo combustible
	 * @param cantidadCombustible the cantidad combustible
	 * @param importeCombustible  the importe combustible
	 */
	public LlenadoDTO(Calendar fechaHora, int tipoCombustible, double cantidadCombustible, double importeCombustible) {
		super();
		this.fechaHora = fechaHora;
		this.tipoCombustible = tipoCombustible;
		this.cantidadCombustible = cantidadCombustible;
		this.importeCombustible = importeCombustible;
	}

	/**
	 * Instantiates a new llenado DTO.
	 */
	public LlenadoDTO() {
		super();
	}

}
