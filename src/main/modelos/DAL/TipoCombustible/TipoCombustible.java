package main.modelos.DAL.TipoCombustible;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoCombustible. Esta clase es tan solo un catalogo
 */
@Entity
@Table(name = "dlk_gga_tipo_combustible", schema = "sc_gga_repostajes")
public class TipoCombustible {

	/** The id. */
	@Id
	@Column(name = "id")
	private int id;

	/** The des combustible. */
	@Column(name = "des_combustible")
	private String des_combustible;

	/** The precio. */
	@Column(name = "precio")
	private double precio;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the des combustible.
	 *
	 * @return the des combustible
	 */
	public String getDes_combustible() {
		return des_combustible;
	}

	/**
	 * Sets the des combustible.
	 *
	 * @param des_combustible the new des combustible
	 */
	public void setDes_combustible(String des_combustible) {
		this.des_combustible = des_combustible;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(long precio) {
		this.precio = precio;
	}

	/**
	 * Instantiates a new tipo combustible.
	 *
	 * @param id              the id
	 * @param des_combustible the des combustible
	 * @param precio          the precio
	 */
	public TipoCombustible(int id, String des_combustible, double precio) {
		super();
		this.id = id;
		this.des_combustible = des_combustible;
		this.precio = precio;
	}

	/**
	 * Instantiates a new tipo combustible.
	 */
	public TipoCombustible() {
		super();
	}

}
