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
 * ZonasCobertura generated by hbm2java
 */
@Entity
@Table(name = "Zonas_Cobertura", schema = "wms", catalog = "Tactic")
public class ZonasCobertura implements java.io.Serializable {

	private Integer id;
	private Integer idCentroDistribucion;
	private Integer idCliente;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public ZonasCobertura() {
	}

	public ZonasCobertura(Integer id, Integer idCentroDistribucion, Integer idCliente, Boolean activo,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.idCentroDistribucion = idCentroDistribucion;
		this.idCliente = idCliente;
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

	@Column(name = "Id_Centro_Distribucion", nullable = false)
	public Integer getIdCentroDistribucion() {
		return this.idCentroDistribucion;
	}

	public void setIdCentroDistribucion(Integer idCentroDistribucion) {
		this.idCentroDistribucion = idCentroDistribucion;
	}

	@Column(name = "Id_Cliente", nullable = false)
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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
