package main.modelos.DAL.Llenado;

import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import main.modelos.DAL.TipoCombustible.TipoCombustible;

// TODO: Auto-generated Javadoc
/**
 * The Class Llenado.
 */
@Entity
@Table(name = "dlk_gga_llenado", schema = "sc_gga_repostajes")
public class Llenado {

	/** The md uuid. */
	@Id
	@Column(name = "md_uuid")
	private String mdUuid;

	/** The md date. */
	@Column(name = "md_date")
	private Calendar mdDate;

	/** The cantidad litros. */
	@Column(name = "cantidad_litros")
	private double cantidadLitros;

	/** The tipo combustible. */
	@Column(name = "tipo_combustible")
	private int tipoCombustible;

	/** The importe total. */
	@Column(name = "importe_total")
	private double importeTotal;

	/**
	 * Gets the md uuid.
	 *
	 * @return the md uuid
	 */
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
	 * Gets the cantidad litros.
	 *
	 * @return the cantidad litros
	 */
	public double getCantidadLitros() {
		return cantidadLitros;
	}

	/**
	 * Sets the cantidad litros.
	 *
	 * @param cantidadLitros the new cantidad litros
	 */
	public void setCantidadLitros(long cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
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
	 * Gets the importe total.
	 *
	 * @return the importe total
	 */
	public double getImporteTotal() {
		return importeTotal;
	}

	/**
	 * Sets the importe total.
	 *
	 * @param importeTotal the new importe total
	 */
	public void setImporteTotal(long importeTotal) {
		this.importeTotal = importeTotal;
	}

	/**
	 * Instantiates a new llenado.
	 *
	 * @param mdUuid          the md uuid
	 * @param mdDate          the md date
	 * @param cantidadLitros  the cantidad litros
	 * @param tipoCombustible the tipo combustible
	 * @param importeTotal    the importe total
	 */
	public Llenado(String mdUuid, Calendar mdDate, double cantidadLitros, int tipoCombustible, double importeTotal) {
		super();
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
		this.cantidadLitros = cantidadLitros;
		this.tipoCombustible = tipoCombustible;
		this.importeTotal = importeTotal;
	}

	/**
	 * Instantiates a new llenado.
	 */
	public Llenado() {
		super();
	}

}
