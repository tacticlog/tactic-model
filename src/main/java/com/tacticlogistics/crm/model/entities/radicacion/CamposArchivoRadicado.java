package com.tacticlogistics.crm.model.entities.radicacion;
// Generated 05-feb-2016 6:28:15 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CamposArchivoRadicado generated by hbm2java
 */
@Entity
@Table(name = "Campos_Archivo_Radicado", schema = "radicacion", catalog = "Tactic", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "Id_Tipo_Archivo_Radicado", "Ordinal" }),
		@UniqueConstraint(columnNames = { "Id_Tipo_Archivo_Radicado", "COLUMN_NAME" }) })
public class CamposArchivoRadicado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer idTipoArchivoRadicado;
	private String nombre;
	private String descripcion;
	private Boolean esIdentificadorDeRegistro;
	private Boolean esIdentificadorDeArchivoRadicado;
	private String columnName;
	private String dataType;
	private Integer characterMaximumLength;
	private Integer numericPrecision;
	private Integer numericScale;
	private Boolean isNullable;
	private Integer ordinal;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public CamposArchivoRadicado() {
	}

	public CamposArchivoRadicado(Integer id, Integer idTipoArchivoRadicado, String nombre, String descripcion,
			Boolean esIdentificadorDeRegistro, Boolean esIdentificadorDeArchivoRadicado, String columnName,
			String dataType, Boolean isNullable, Integer ordinal, Boolean activo, Date fechaActualizacion,
			String usuarioActualizacion) {
		this.id = id;
		this.idTipoArchivoRadicado = idTipoArchivoRadicado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.esIdentificadorDeRegistro = esIdentificadorDeRegistro;
		this.esIdentificadorDeArchivoRadicado = esIdentificadorDeArchivoRadicado;
		this.columnName = columnName;
		this.dataType = dataType;
		this.isNullable = isNullable;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public CamposArchivoRadicado(Integer id, Integer idTipoArchivoRadicado, String nombre, String descripcion,
			Boolean esIdentificadorDeRegistro, Boolean esIdentificadorDeArchivoRadicado, String columnName,
			String dataType, Integer characterMaximumLength, Integer numericPrecision, Integer numericScale,
			Boolean isNullable, Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.idTipoArchivoRadicado = idTipoArchivoRadicado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.esIdentificadorDeRegistro = esIdentificadorDeRegistro;
		this.esIdentificadorDeArchivoRadicado = esIdentificadorDeArchivoRadicado;
		this.columnName = columnName;
		this.dataType = dataType;
		this.characterMaximumLength = characterMaximumLength;
		this.numericPrecision = numericPrecision;
		this.numericScale = numericScale;
		this.isNullable = isNullable;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Id_Tipo_Archivo_Radicado", nullable = false)
	public Integer getIdTipoArchivoRadicado() {
		return this.idTipoArchivoRadicado;
	}

	public void setIdTipoArchivoRadicado(Integer idTipoArchivoRadicado) {
		this.idTipoArchivoRadicado = idTipoArchivoRadicado;
	}

	@Column(name = "Nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Descripcion", nullable = false, length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "Es_Identificador_De_Registro", nullable = false)
	public Boolean getEsIdentificadorDeRegistro() {
		return this.esIdentificadorDeRegistro;
	}

	public void setEsIdentificadorDeRegistro(Boolean esIdentificadorDeRegistro) {
		this.esIdentificadorDeRegistro = esIdentificadorDeRegistro;
	}

	@Column(name = "Es_Identificador_De_Archivo_Radicado", nullable = false)
	public Boolean getEsIdentificadorDeArchivoRadicado() {
		return this.esIdentificadorDeArchivoRadicado;
	}

	public void setEsIdentificadorDeArchivoRadicado(Boolean esIdentificadorDeArchivoRadicado) {
		this.esIdentificadorDeArchivoRadicado = esIdentificadorDeArchivoRadicado;
	}

	@Column(name = "COLUMN_NAME", nullable = false, length = 256)
	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Column(name = "DATA_TYPE", nullable = false, length = 256)
	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Column(name = "CHARACTER_MAXIMUM_LENGTH")
	public Integer getCharacterMaximumLength() {
		return this.characterMaximumLength;
	}

	public void setCharacterMaximumLength(Integer characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	@Column(name = "NUMERIC_PRECISION")
	public Integer getNumericPrecision() {
		return this.numericPrecision;
	}

	public void setNumericPrecision(Integer numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	@Column(name = "NUMERIC_SCALE")
	public Integer getNumericScale() {
		return this.numericScale;
	}

	public void setNumericScale(Integer numericScale) {
		this.numericScale = numericScale;
	}

	@Column(name = "IS_NULLABLE", nullable = false)
	public Boolean getIsNullable() {
		return this.isNullable;
	}

	public void setIsNullable(Boolean isNullable) {
		this.isNullable = isNullable;
	}

	@Column(name = "Ordinal", nullable = false)
	public Integer getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	@Column(name = "Activo", nullable = false)
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Fecha_Actualizacion", nullable = false, length = 22)
	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Column(name = "Usuario_Actualizacion", nullable = false, length = 50)
	public String getUsuarioActualizacion() {
		return this.usuarioActualizacion;
	}

	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}

}
