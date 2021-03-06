/**
 * This class is generated by jOOQ
 */
package persistencia.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PeriodocontableRecord extends org.jooq.impl.UpdatableRecordImpl<persistencia.tables.records.PeriodocontableRecord> implements org.jooq.Record5<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -227643277;

	/**
	 * Setter for <code>modulo_contable_smartwork.periodocontable.PERIODOCONTABLEID</code>.
	 */
	public void setPeriodocontableid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>modulo_contable_smartwork.periodocontable.PERIODOCONTABLEID</code>.
	 */
	public java.lang.Integer getPeriodocontableid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>modulo_contable_smartwork.periodocontable.FECHAINICIO</code>.
	 */
	public void setFechainicio(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>modulo_contable_smartwork.periodocontable.FECHAINICIO</code>.
	 */
	public java.sql.Timestamp getFechainicio() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>modulo_contable_smartwork.periodocontable.FECHAFINAL</code>.
	 */
	public void setFechafinal(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>modulo_contable_smartwork.periodocontable.FECHAFINAL</code>.
	 */
	public java.sql.Timestamp getFechafinal() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>modulo_contable_smartwork.periodocontable.NOMBREPERIODO</code>.
	 */
	public void setNombreperiodo(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>modulo_contable_smartwork.periodocontable.NOMBREPERIODO</code>.
	 */
	public java.lang.String getNombreperiodo() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>modulo_contable_smartwork.periodocontable.ESTADO</code>.
	 */
	public void setEstado(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>modulo_contable_smartwork.periodocontable.ESTADO</code>.
	 */
	public java.lang.Integer getEstado() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return persistencia.tables.Periodocontable.PERIODOCONTABLE.PERIODOCONTABLEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return persistencia.tables.Periodocontable.PERIODOCONTABLE.FECHAINICIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return persistencia.tables.Periodocontable.PERIODOCONTABLE.FECHAFINAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return persistencia.tables.Periodocontable.PERIODOCONTABLE.NOMBREPERIODO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return persistencia.tables.Periodocontable.PERIODOCONTABLE.ESTADO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPeriodocontableid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getFechainicio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getFechafinal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getNombreperiodo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getEstado();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord value1(java.lang.Integer value) {
		setPeriodocontableid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord value2(java.sql.Timestamp value) {
		setFechainicio(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord value3(java.sql.Timestamp value) {
		setFechafinal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord value4(java.lang.String value) {
		setNombreperiodo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord value5(java.lang.Integer value) {
		setEstado(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PeriodocontableRecord values(java.lang.Integer value1, java.sql.Timestamp value2, java.sql.Timestamp value3, java.lang.String value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PeriodocontableRecord
	 */
	public PeriodocontableRecord() {
		super(persistencia.tables.Periodocontable.PERIODOCONTABLE);
	}

	/**
	 * Create a detached, initialised PeriodocontableRecord
	 */
	public PeriodocontableRecord(java.lang.Integer periodocontableid, java.sql.Timestamp fechainicio, java.sql.Timestamp fechafinal, java.lang.String nombreperiodo, java.lang.Integer estado) {
		super(persistencia.tables.Periodocontable.PERIODOCONTABLE);

		setValue(0, periodocontableid);
		setValue(1, fechainicio);
		setValue(2, fechafinal);
		setValue(3, nombreperiodo);
		setValue(4, estado);
	}
}
