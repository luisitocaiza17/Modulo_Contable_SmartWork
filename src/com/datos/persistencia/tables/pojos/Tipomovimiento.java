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
public class Tipomovimiento implements java.io.Serializable {

	private static final long serialVersionUID = 1471047934;

	private java.lang.Integer tipomovimientoid;
	private java.lang.String  nombre;
	private java.lang.Integer estado;

	public Tipomovimiento() {}

	public Tipomovimiento(
		java.lang.Integer tipomovimientoid,
		java.lang.String  nombre,
		java.lang.Integer estado
	) {
		this.tipomovimientoid = tipomovimientoid;
		this.nombre = nombre;
		this.estado = estado;
	}

	public java.lang.Integer getTipomovimientoid() {
		return this.tipomovimientoid;
	}

	public void setTipomovimientoid(java.lang.Integer tipomovimientoid) {
		this.tipomovimientoid = tipomovimientoid;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.Integer getEstado() {
		return this.estado;
	}

	public void setEstado(java.lang.Integer estado) {
		this.estado = estado;
	}
}
