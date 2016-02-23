package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DespachosProductos generated by hbm2java
 */
@Entity
@Table(name = "Despachos_Productos", schema = "tms", catalog = "Tactic")
public class DespachosProductos implements java.io.Serializable {

	private Integer id;
	private Integer idDespacho;
	private Short numeroLinea;
	private Integer idProducto;
	private Integer cantidad;
	private Integer idUoM;
	private BigDecimal valorPorUoMDespachada;
	private Date fechaActualizacion;
	private String usuarioActualizacion;

	public DespachosProductos() {
	}

	public DespachosProductos(Integer id, Integer idDespacho, Short numeroLinea, Integer idProducto, Integer cantidad,
			Integer idUoM, BigDecimal valorPorUoMDespachada, Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.idDespacho = idDespacho;
		this.numeroLinea = numeroLinea;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.idUoM = idUoM;
		this.valorPorUoMDespachada = valorPorUoMDespachada;
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

	@Column(name = "Id_Despacho", nullable = false)
	public Integer getIdDespacho() {
		return this.idDespacho;
	}

	public void setIdDespacho(Integer idDespacho) {
		this.idDespacho = idDespacho;
	}

	@Column(name = "Numero_Linea", nullable = false)
	public Short getNumeroLinea() {
		return this.numeroLinea;
	}

	public void setNumeroLinea(Short numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	@Column(name = "Id_Producto", nullable = false)
	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "Cantidad", nullable = false)
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "Id_UoM", nullable = false)
	public Integer getIdUoM() {
		return this.idUoM;
	}

	public void setIdUoM(Integer idUoM) {
		this.idUoM = idUoM;
	}

	@Column(name = "Valor_Por_UoM_Despachada", nullable = false, scale = 4)
	public BigDecimal getValorPorUoMDespachada() {
		return this.valorPorUoMDespachada;
	}

	public void setValorPorUoMDespachada(BigDecimal valorPorUoMDespachada) {
		this.valorPorUoMDespachada = valorPorUoMDespachada;
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