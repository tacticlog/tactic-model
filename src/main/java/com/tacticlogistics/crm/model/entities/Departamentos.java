package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Departamentos generated by hbm2java
 */
@Entity
@Table(name = "Departamentos", schema = "geo", catalog = "Tactic", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "Id_Pais", "Codigo" }),
		@UniqueConstraint(columnNames = { "Id_Pais", "Nombre" }) })
public class Departamentos implements java.io.Serializable {

	private Integer id;
	private Paises paises;
	private String codigo;
	private String nombre;
	private BigDecimal longitud;
	private BigDecimal latitud;
	private Integer ordinal;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<Ciudades> ciudadeses = new HashSet<Ciudades>(0);

	public Departamentos() {
	}

	public Departamentos(Integer id, Paises paises, String codigo, String nombre, BigDecimal longitud,
			BigDecimal latitud, Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.paises = paises;
		this.codigo = codigo;
		this.nombre = nombre;
		this.longitud = longitud;
		this.latitud = latitud;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public Departamentos(Integer id, Paises paises, String codigo, String nombre, BigDecimal longitud,
			BigDecimal latitud, Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion,
			Set<Ciudades> ciudadeses) {
		this.id = id;
		this.paises = paises;
		this.codigo = codigo;
		this.nombre = nombre;
		this.longitud = longitud;
		this.latitud = latitud;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.ciudadeses = ciudadeses;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_Pais", nullable = false)
	public Paises getPaises() {
		return this.paises;
	}

	public void setPaises(Paises paises) {
		this.paises = paises;
	}

	@Column(name = "Codigo", nullable = false, length = 3)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Longitud", nullable = false, precision = 18, scale = 15)
	public BigDecimal getLongitud() {
		return this.longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	@Column(name = "Latitud", nullable = false, precision = 18, scale = 15)
	public BigDecimal getLatitud() {
		return this.latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
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
	@Column(name = "Fecha_Actualizacion", nullable = false, length = 19)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamentos")
	public Set<Ciudades> getCiudadeses() {
		return this.ciudadeses;
	}

	public void setCiudadeses(Set<Ciudades> ciudadeses) {
		this.ciudadeses = ciudadeses;
	}

}
