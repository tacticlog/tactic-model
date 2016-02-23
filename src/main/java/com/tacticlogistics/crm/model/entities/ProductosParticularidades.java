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
 * ProductosParticularidades generated by hbm2java
 */
@Entity
@Table(name = "Productos_Particularidades", schema = "wms", catalog = "Tactic")
public class ProductosParticularidades implements java.io.Serializable {

	private Integer id;
	private Integer idProducto;
	private Integer idParticularidad;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public ProductosParticularidades() {
	}

	public ProductosParticularidades(Integer id, Integer idProducto, Integer idParticularidad, Boolean activo,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.idProducto = idProducto;
		this.idParticularidad = idParticularidad;
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

	@Column(name = "Id_Producto", nullable = false)
	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "Id_Particularidad", nullable = false)
	public Integer getIdParticularidad() {
		return this.idParticularidad;
	}

	public void setIdParticularidad(Integer idParticularidad) {
		this.idParticularidad = idParticularidad;
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
