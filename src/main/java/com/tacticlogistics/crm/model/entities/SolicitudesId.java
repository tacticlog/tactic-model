package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SolicitudesId generated by hbm2java
 */
@Embeddable
public class SolicitudesId implements java.io.Serializable {

	private Integer idSolicitud;
	private Date fechaSolicitud;
	private String codigoMunicipio;
	private String nombreMunicipio;
	private String direccion;
	private BigDecimal cx;
	private BigDecimal cy;
	private String estado;
	private String direccionEstandarizada;
	private String fuenteDireccion;
	private String direccionAlterna;
	private String nivelSocioEconomico;
	private String codigoBarrio;
	private String nombreBarrio;
	private String codigoLocalidad;
	private String nombreLocalidad;
	private Date fechaActualizacion;

	public SolicitudesId() {
	}

	public SolicitudesId(Integer idSolicitud, Date fechaSolicitud, String codigoMunicipio, String nombreMunicipio,
			String direccion) {
		this.idSolicitud = idSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.codigoMunicipio = codigoMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.direccion = direccion;
	}

	public SolicitudesId(Integer idSolicitud, Date fechaSolicitud, String codigoMunicipio, String nombreMunicipio,
			String direccion, BigDecimal cx, BigDecimal cy, String estado, String direccionEstandarizada,
			String fuenteDireccion, String direccionAlterna, String nivelSocioEconomico, String codigoBarrio,
			String nombreBarrio, String codigoLocalidad, String nombreLocalidad, Date fechaActualizacion) {
		this.idSolicitud = idSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.codigoMunicipio = codigoMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.direccion = direccion;
		this.cx = cx;
		this.cy = cy;
		this.estado = estado;
		this.direccionEstandarizada = direccionEstandarizada;
		this.fuenteDireccion = fuenteDireccion;
		this.direccionAlterna = direccionAlterna;
		this.nivelSocioEconomico = nivelSocioEconomico;
		this.codigoBarrio = codigoBarrio;
		this.nombreBarrio = nombreBarrio;
		this.codigoLocalidad = codigoLocalidad;
		this.nombreLocalidad = nombreLocalidad;
		this.fechaActualizacion = fechaActualizacion;
	}

	@Column(name = "Id_Solicitud", nullable = false)
	public Integer getIdSolicitud() {
		return this.idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	@Column(name = "Fecha_Solicitud", nullable = false, length = 19)
	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	@Column(name = "Codigo_Municipio", nullable = false, length = 5)
	public String getCodigoMunicipio() {
		return this.codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@Column(name = "Nombre_Municipio", nullable = false, length = 200)
	public String getNombreMunicipio() {
		return this.nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	@Column(name = "Direccion", nullable = false, length = 150)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "CX", precision = 18, scale = 15)
	public BigDecimal getCx() {
		return this.cx;
	}

	public void setCx(BigDecimal cx) {
		this.cx = cx;
	}

	@Column(name = "CY", precision = 18, scale = 15)
	public BigDecimal getCy() {
		return this.cy;
	}

	public void setCy(BigDecimal cy) {
		this.cy = cy;
	}

	@Column(name = "Estado", length = 2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "Direccion_Estandarizada", length = 150)
	public String getDireccionEstandarizada() {
		return this.direccionEstandarizada;
	}

	public void setDireccionEstandarizada(String direccionEstandarizada) {
		this.direccionEstandarizada = direccionEstandarizada;
	}

	@Column(name = "Fuente_Direccion", length = 150)
	public String getFuenteDireccion() {
		return this.fuenteDireccion;
	}

	public void setFuenteDireccion(String fuenteDireccion) {
		this.fuenteDireccion = fuenteDireccion;
	}

	@Column(name = "Direccion_Alterna", length = 150)
	public String getDireccionAlterna() {
		return this.direccionAlterna;
	}

	public void setDireccionAlterna(String direccionAlterna) {
		this.direccionAlterna = direccionAlterna;
	}

	@Column(name = "Nivel_Socio_Economico", length = 2)
	public String getNivelSocioEconomico() {
		return this.nivelSocioEconomico;
	}

	public void setNivelSocioEconomico(String nivelSocioEconomico) {
		this.nivelSocioEconomico = nivelSocioEconomico;
	}

	@Column(name = "Codigo_Barrio", length = 10)
	public String getCodigoBarrio() {
		return this.codigoBarrio;
	}

	public void setCodigoBarrio(String codigoBarrio) {
		this.codigoBarrio = codigoBarrio;
	}

	@Column(name = "Nombre_Barrio", length = 60)
	public String getNombreBarrio() {
		return this.nombreBarrio;
	}

	public void setNombreBarrio(String nombreBarrio) {
		this.nombreBarrio = nombreBarrio;
	}

	@Column(name = "Codigo_Localidad", length = 10)
	public String getCodigoLocalidad() {
		return this.codigoLocalidad;
	}

	public void setCodigoLocalidad(String codigoLocalidad) {
		this.codigoLocalidad = codigoLocalidad;
	}

	@Column(name = "Nombre_Localidad", length = 50)
	public String getNombreLocalidad() {
		return this.nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	@Column(name = "Fecha_Actualizacion", length = 19)
	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SolicitudesId))
			return false;
		SolicitudesId castOther = (SolicitudesId) other;

		return ((this.getIdSolicitud() == castOther.getIdSolicitud()) || (this.getIdSolicitud() != null
				&& castOther.getIdSolicitud() != null && this.getIdSolicitud().equals(castOther.getIdSolicitud())))
				&& ((this.getFechaSolicitud() == castOther.getFechaSolicitud())
						|| (this.getFechaSolicitud() != null && castOther.getFechaSolicitud() != null
								&& this.getFechaSolicitud().equals(castOther.getFechaSolicitud())))
				&& ((this.getCodigoMunicipio() == castOther.getCodigoMunicipio())
						|| (this.getCodigoMunicipio() != null && castOther.getCodigoMunicipio() != null
								&& this.getCodigoMunicipio().equals(castOther.getCodigoMunicipio())))
				&& ((this.getNombreMunicipio() == castOther.getNombreMunicipio())
						|| (this.getNombreMunicipio() != null && castOther.getNombreMunicipio() != null
								&& this.getNombreMunicipio().equals(castOther.getNombreMunicipio())))
				&& ((this.getDireccion() == castOther.getDireccion()) || (this.getDireccion() != null
						&& castOther.getDireccion() != null && this.getDireccion().equals(castOther.getDireccion())))
				&& ((this.getCx() == castOther.getCx()) || (this.getCx() != null && castOther.getCx() != null
						&& this.getCx().equals(castOther.getCx())))
				&& ((this.getCy() == castOther.getCy()) || (this.getCy() != null && castOther.getCy() != null
						&& this.getCy().equals(castOther.getCy())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getDireccionEstandarizada() == castOther.getDireccionEstandarizada())
						|| (this.getDireccionEstandarizada() != null && castOther.getDireccionEstandarizada() != null
								&& this.getDireccionEstandarizada().equals(castOther.getDireccionEstandarizada())))
				&& ((this.getFuenteDireccion() == castOther.getFuenteDireccion())
						|| (this.getFuenteDireccion() != null && castOther.getFuenteDireccion() != null
								&& this.getFuenteDireccion().equals(castOther.getFuenteDireccion())))
				&& ((this.getDireccionAlterna() == castOther.getDireccionAlterna())
						|| (this.getDireccionAlterna() != null && castOther.getDireccionAlterna() != null
								&& this.getDireccionAlterna().equals(castOther.getDireccionAlterna())))
				&& ((this.getNivelSocioEconomico() == castOther.getNivelSocioEconomico())
						|| (this.getNivelSocioEconomico() != null && castOther.getNivelSocioEconomico() != null
								&& this.getNivelSocioEconomico().equals(castOther.getNivelSocioEconomico())))
				&& ((this.getCodigoBarrio() == castOther.getCodigoBarrio())
						|| (this.getCodigoBarrio() != null && castOther.getCodigoBarrio() != null
								&& this.getCodigoBarrio().equals(castOther.getCodigoBarrio())))
				&& ((this.getNombreBarrio() == castOther.getNombreBarrio())
						|| (this.getNombreBarrio() != null && castOther.getNombreBarrio() != null
								&& this.getNombreBarrio().equals(castOther.getNombreBarrio())))
				&& ((this.getCodigoLocalidad() == castOther.getCodigoLocalidad())
						|| (this.getCodigoLocalidad() != null && castOther.getCodigoLocalidad() != null
								&& this.getCodigoLocalidad().equals(castOther.getCodigoLocalidad())))
				&& ((this.getNombreLocalidad() == castOther.getNombreLocalidad())
						|| (this.getNombreLocalidad() != null && castOther.getNombreLocalidad() != null
								&& this.getNombreLocalidad().equals(castOther.getNombreLocalidad())))
				&& ((this.getFechaActualizacion() == castOther.getFechaActualizacion())
						|| (this.getFechaActualizacion() != null && castOther.getFechaActualizacion() != null
								&& this.getFechaActualizacion().equals(castOther.getFechaActualizacion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdSolicitud() == null ? 0 : this.getIdSolicitud().hashCode());
		result = 37 * result + (getFechaSolicitud() == null ? 0 : this.getFechaSolicitud().hashCode());
		result = 37 * result + (getCodigoMunicipio() == null ? 0 : this.getCodigoMunicipio().hashCode());
		result = 37 * result + (getNombreMunicipio() == null ? 0 : this.getNombreMunicipio().hashCode());
		result = 37 * result + (getDireccion() == null ? 0 : this.getDireccion().hashCode());
		result = 37 * result + (getCx() == null ? 0 : this.getCx().hashCode());
		result = 37 * result + (getCy() == null ? 0 : this.getCy().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getDireccionEstandarizada() == null ? 0 : this.getDireccionEstandarizada().hashCode());
		result = 37 * result + (getFuenteDireccion() == null ? 0 : this.getFuenteDireccion().hashCode());
		result = 37 * result + (getDireccionAlterna() == null ? 0 : this.getDireccionAlterna().hashCode());
		result = 37 * result + (getNivelSocioEconomico() == null ? 0 : this.getNivelSocioEconomico().hashCode());
		result = 37 * result + (getCodigoBarrio() == null ? 0 : this.getCodigoBarrio().hashCode());
		result = 37 * result + (getNombreBarrio() == null ? 0 : this.getNombreBarrio().hashCode());
		result = 37 * result + (getCodigoLocalidad() == null ? 0 : this.getCodigoLocalidad().hashCode());
		result = 37 * result + (getNombreLocalidad() == null ? 0 : this.getNombreLocalidad().hashCode());
		result = 37 * result + (getFechaActualizacion() == null ? 0 : this.getFechaActualizacion().hashCode());
		return result;
	}

}
