/**
 * This class is generated by jOOQ
 */
package persistencia.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tipomovimiento extends org.jooq.impl.TableImpl<persistencia.tables.records.TipomovimientoRecord> {

	private static final long serialVersionUID = -680936059;

	/**
	 * The singleton instance of <code>modulo_contable_smartwork.tipomovimiento</code>
	 */
	public static final persistencia.tables.Tipomovimiento TIPOMOVIMIENTO = new persistencia.tables.Tipomovimiento();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<persistencia.tables.records.TipomovimientoRecord> getRecordType() {
		return persistencia.tables.records.TipomovimientoRecord.class;
	}

	/**
	 * The column <code>modulo_contable_smartwork.tipomovimiento.TIPOMOVIMIENTOID</code>.
	 */
	public final org.jooq.TableField<persistencia.tables.records.TipomovimientoRecord, java.lang.Integer> TIPOMOVIMIENTOID = createField("TIPOMOVIMIENTOID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>modulo_contable_smartwork.tipomovimiento.NOMBRE</code>.
	 */
	public final org.jooq.TableField<persistencia.tables.records.TipomovimientoRecord, java.lang.String> NOMBRE = createField("NOMBRE", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>modulo_contable_smartwork.tipomovimiento.ESTADO</code>.
	 */
	public final org.jooq.TableField<persistencia.tables.records.TipomovimientoRecord, java.lang.Integer> ESTADO = createField("ESTADO", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>modulo_contable_smartwork.tipomovimiento</code> table reference
	 */
	public Tipomovimiento() {
		this("tipomovimiento", null);
	}

	/**
	 * Create an aliased <code>modulo_contable_smartwork.tipomovimiento</code> table reference
	 */
	public Tipomovimiento(java.lang.String alias) {
		this(alias, persistencia.tables.Tipomovimiento.TIPOMOVIMIENTO);
	}

	private Tipomovimiento(java.lang.String alias, org.jooq.Table<persistencia.tables.records.TipomovimientoRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tipomovimiento(java.lang.String alias, org.jooq.Table<persistencia.tables.records.TipomovimientoRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, persistencia.ModuloContableSmartwork.MODULO_CONTABLE_SMARTWORK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<persistencia.tables.records.TipomovimientoRecord> getPrimaryKey() {
		return persistencia.Keys.KEY_TIPOMOVIMIENTO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<persistencia.tables.records.TipomovimientoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<persistencia.tables.records.TipomovimientoRecord>>asList(persistencia.Keys.KEY_TIPOMOVIMIENTO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public persistencia.tables.Tipomovimiento as(java.lang.String alias) {
		return new persistencia.tables.Tipomovimiento(alias, this);
	}

	/**
	 * Rename this table
	 */
	public persistencia.tables.Tipomovimiento rename(java.lang.String name) {
		return new persistencia.tables.Tipomovimiento(name, null);
	}
}
