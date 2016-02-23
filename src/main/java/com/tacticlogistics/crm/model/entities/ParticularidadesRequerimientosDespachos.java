package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ParticularidadesRequerimientosDespachos generated by hbm2java
 */
@Entity
@Table(name = "Particularidades_Requerimientos_Despachos", schema = "tms", catalog = "Tactic")
public class ParticularidadesRequerimientosDespachos implements java.io.Serializable {

	private Integer id;
	private Integer idParticularidad;
	private Integer idRequerimientoDespacho;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public ParticularidadesRequerimientosDespachos() {
	}

	public ParticularidadesRequerimientosDespachos(Integer id, Integer idParticularidad,
			Integer idRequerimientoDespacho, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.idParticularidad = idParticularidad;
		this.idRequerimientoDespacho = idRequerimientoDespacho;
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

	@Column(name = "Id_Particularidad", nullable = false)
	public Integer getIdParticularidad() {
		return this.idParticularidad;
	}

	public void setIdParticularidad(Integer idParticularidad) {
		this.idParticularidad = idParticularidad;
	}

	@Column(name = "Id_Requerimiento_Despacho", nullable = false)
	public Integer getIdRequerimientoDespacho() {
		return this.idRequerimientoDespacho;
	}

	public void setIdRequerimientoDespacho(Integer idRequerimientoDespacho) {
		this.idRequerimientoDespacho = idRequerimientoDespacho;
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

}