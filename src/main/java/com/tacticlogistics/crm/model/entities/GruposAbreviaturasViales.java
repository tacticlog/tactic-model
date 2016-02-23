package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GruposAbreviaturasViales generated by hbm2java
 */
@Entity
@Table(name = "Grupos_Abreviaturas_Viales", schema = "geo", catalog = "Tactic")
public class GruposAbreviaturasViales implements java.io.Serializable {

	private Integer id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Boolean via;
	private Boolean prefijo;
	private Boolean cuadrante;
	private Boolean complemento;
	private Integer ordinal;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<AbreviaturasViales> abreviaturasVialeses = new HashSet<AbreviaturasViales>(0);

	public GruposAbreviaturasViales() {
	}

	public GruposAbreviaturasViales(Integer id, String codigo, String nombre, String descripcion, Boolean via,
			Boolean prefijo, Boolean cuadrante, Boolean complemento, Integer ordinal, Boolean activo,
			Date fechaActualizacion, String usuarioActualizacion) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.via = via;
		this.prefijo = prefijo;
		this.cuadrante = cuadrante;
		this.complemento = complemento;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public GruposAbreviaturasViales(Integer id, String codigo, String nombre, String descripcion, Boolean via,
			Boolean prefijo, Boolean cuadrante, Boolean complemento, Integer ordinal, Boolean activo,
			Date fechaActualizacion, String usuarioActualizacion, Set<AbreviaturasViales> abreviaturasVialeses) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.via = via;
		this.prefijo = prefijo;
		this.cuadrante = cuadrante;
		this.complemento = complemento;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.abreviaturasVialeses = abreviaturasVialeses;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Column(name = "Descripcion", nullable = false, length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "Via", nullable = false)
	public Boolean getVia() {
		return this.via;
	}

	public void setVia(Boolean via) {
		this.via = via;
	}

	@Column(name = "Prefijo", nullable = false)
	public Boolean getPrefijo() {
		return this.prefijo;
	}

	public void setPrefijo(Boolean prefijo) {
		this.prefijo = prefijo;
	}

	@Column(name = "Cuadrante", nullable = false)
	public Boolean getCuadrante() {
		return this.cuadrante;
	}

	public void setCuadrante(Boolean cuadrante) {
		this.cuadrante = cuadrante;
	}

	@Column(name = "Complemento", nullable = false)
	public Boolean getComplemento() {
		return this.complemento;
	}

	public void setComplemento(Boolean complemento) {
		this.complemento = complemento;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gruposAbreviaturasViales")
	public Set<AbreviaturasViales> getAbreviaturasVialeses() {
		return this.abreviaturasVialeses;
	}

	public void setAbreviaturasVialeses(Set<AbreviaturasViales> abreviaturasVialeses) {
		this.abreviaturasVialeses = abreviaturasVialeses;
	}

}
