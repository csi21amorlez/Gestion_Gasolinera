package main.modelos.DTOs;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoCombustibleDTO.
 */
public class TipoCombustibleDTO {

	/** The tipo. */
	private int tipo;

	/** The precio. */
	private double precio;

	/** The desc. */
	private String desc;

	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	 * Gets the desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the desc.
	 *
	 * @param desc the new desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Instantiates a new tipo combustible DTO.
	 *
	 * @param tipo   Tipo del combustible, hace referencia a la id
	 * @param precio Precio del combustible
	 * @param desc   Nombre comercial de combustible
	 */
	public TipoCombustibleDTO(int tipo, double precio, String desc) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.desc = desc;
	}

	/**
	 * Instantiates a new tipo combustible DTO.
	 */
	public TipoCombustibleDTO() {

	}

}
