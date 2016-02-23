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

/**
 * Barrios generated by hbm2java
 */
@Entity
@Table(name = "Barrios", schema = "geo", catalog = "Tactic")
public class Barrios implements java.io.Serializable {

	private Integer id;
	private Ciudades ciudades;
	private Localidades localidades;
	private Zonas zonas;
	private String codigo;
	private String nombre;
	private BigDecimal longitud;
	private BigDecimal latitud;
	private Integer ordinal;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<Direcciones> direccioneses = new HashSet<Direcciones>(0);
	private Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses = new HashSet<PedidosDestinosDireccionesOriginales>(
			0);

	public Barrios() {
	}

	public Barrios(Integer id, Ciudades ciudades, String codigo, String nombre, Integer ordinal, Boolean activo,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.ciudades = ciudades;
		this.codigo = codigo;
		this.nombre = nombre;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public Barrios(Integer id, Ciudades ciudades, Localidades localidades, Zonas zonas, String codigo, String nombre,
			BigDecimal longitud, BigDecimal latitud, Integer ordinal, Boolean activo, Date fechaActualizacion,
			String usuarioActualizacion, Set<Direcciones> direccioneses,
			Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses) {
		this.id = id;
		this.ciudades = ciudades;
		this.localidades = localidades;
		this.zonas = zonas;
		this.codigo = codigo;
		this.nombre = nombre;
		this.longitud = longitud;
		this.latitud = latitud;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.direccioneses = direccioneses;
		this.pedidosDestinosDireccionesOriginaleses = pedidosDestinosDireccionesOriginaleses;
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
	@JoinColumn(name = "Id_Ciudad", nullable = false)
	public Ciudades getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_Localidad")
	public Localidades getLocalidades() {
		return this.localidades;
	}

	public void setLocalidades(Localidades localidades) {
		this.localidades = localidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_Zona")
	public Zonas getZonas() {
		return this.zonas;
	}

	public void setZonas(Zonas zonas) {
		this.zonas = zonas;
	}

	@Column(name = "Codigo", nullable = false, length = 20)
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

	@Column(name = "Longitud", precision = 18, scale = 15)
	public BigDecimal getLongitud() {
		return this.longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	@Column(name = "Latitud", precision = 18, scale = 15)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "barrios")
	public Set<Direcciones> getDireccioneses() {
		return this.direccioneses;
	}

	public void setDireccioneses(Set<Direcciones> direccioneses) {
		this.direccioneses = direccioneses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "barrios")
	public Set<PedidosDestinosDireccionesOriginales> getPedidosDestinosDireccionesOriginaleses() {
		return this.pedidosDestinosDireccionesOriginaleses;
	}

	public void setPedidosDestinosDireccionesOriginaleses(
			Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses) {
		this.pedidosDestinosDireccionesOriginaleses = pedidosDestinosDireccionesOriginaleses;
	}

}