package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CentrosDistribucionProductos generated by hbm2java
 */
@Entity
@Table(name = "Centros_Distribucion_Productos", schema = "wms", catalog = "Tactic")
public class CentrosDistribucionProductos implements java.io.Serializable {

	private Integer id;
	private CentrosDistribucion centrosDistribucion;
	private Productos productos;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public CentrosDistribucionProductos() {
	}

	public CentrosDistribucionProductos(Integer id, CentrosDistribucion centrosDistribucion, Productos productos,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.centrosDistribucion = centrosDistribucion;
		this.productos = productos;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_Centro_Distribucion", nullable = false)
	public CentrosDistribucion getCentrosDistribucion() {
		return this.centrosDistribucion;
	}

	public void setCentrosDistribucion(CentrosDistribucion centrosDistribucion) {
		this.centrosDistribucion = centrosDistribucion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_Producto", nullable = false)
	public Productos getProductos() {
		return this.productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
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
