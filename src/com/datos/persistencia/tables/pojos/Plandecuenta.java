/**
 * This class is generated by jOOQ
 */
package persistencia.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plandecuenta implements java.io.Serializable {

	private static final long serialVersionUID = -1594866871;

	private java.lang.Integer id;
	private java.lang.Integer plaId;
	private java.lang.String  codigocontable;
	private java.lang.String  nombrecuenta;
	private java.lang.Integer tipocuenta;
	private java.lang.Integer estado;

	public Plandecuenta() {}

	public Plandecuenta(
		java.lang.Integer id,
		java.lang.Integer plaId,
		java.lang.String  codigocontable,
		java.lang.String  nombrecuenta,
		java.lang.Integer tipocuenta,
		java.lang.Integer estado
	) {
		this.id = id;
		this.plaId = plaId;
		this.codigocontable = codigocontable;
		this.nombrecuenta = nombrecuenta;
		this.tipocuenta = tipocuenta;
		this.estado = estado;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getPlaId() {
		return this.plaId;
	}

	public void setPlaId(java.lang.Integer plaId) {
		this.plaId = plaId;
	}

	public java.lang.String getCodigocontable() {
		return this.codigocontable;
	}

	public void setCodigocontable(java.lang.String codigocontable) {
		this.codigocontable = codigocontable;
	}

	public java.lang.String getNombrecuenta() {
		return this.nombrecuenta;
	}

	public void setNombrecuenta(java.lang.String nombrecuenta) {
		this.nombrecuenta = nombrecuenta;
	}

	public java.lang.Integer getTipocuenta() {
		return this.tipocuenta;
	}

	public void setTipocuenta(java.lang.Integer tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	public java.lang.Integer getEstado() {
		return this.estado;
	}

	public void setEstado(java.lang.Integer estado) {
		this.estado = estado;
	}
}
