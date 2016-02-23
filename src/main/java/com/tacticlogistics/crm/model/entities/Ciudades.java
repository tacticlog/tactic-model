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
 * Ciudades generated by hbm2java
 */
@Entity
@Table(name = "Ciudades", schema = "geo", catalog = "Tactic", uniqueConstraints = @UniqueConstraint(columnNames = {
    "Id_Departamento", "Nombre"}))
public class Ciudades implements java.io.Serializable {

    private Integer id;
    private Departamentos departamentos;
    private String codigo;
    private String nombre;
    private BigDecimal longitud;
    private BigDecimal latitud;
    private Integer ordinal;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private Set<Localidades> localidadeses = new HashSet<>(0);
    private Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses = new HashSet<>(
            0);
    private Set<Barrios> barrioses = new HashSet<>(0);
    private Set<Direcciones> direccioneses = new HashSet<>(0);

    public Ciudades() {
    }

    public Ciudades(Integer id, Departamentos departamentos, String codigo, String nombre, Integer ordinal,
            Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
        this.id = id;
        this.departamentos = departamentos;
        this.codigo = codigo;
        this.nombre = nombre;
        this.ordinal = ordinal;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Ciudades(Integer id, Departamentos departamentos, String codigo, String nombre, BigDecimal longitud,
            BigDecimal latitud, Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion,
            Set<Localidades> localidadeses,
            Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses, Set<Barrios> barrioses,
            Set<Direcciones> direccioneses) {
        this.id = id;
        this.departamentos = departamentos;
        this.codigo = codigo;
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
        this.ordinal = ordinal;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.localidadeses = localidadeses;
        this.pedidosDestinosDireccionesOriginaleses = pedidosDestinosDireccionesOriginaleses;
        this.barrioses = barrioses;
        this.direccioneses = direccioneses;
    }

    @Id
    @Column(name = "Id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Departamento", nullable = false)
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @Column(name = "Codigo", nullable = false, length = 10)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudades")
    public Set<Localidades> getLocalidadeses() {
        return this.localidadeses;
    }

    public void setLocalidadeses(Set<Localidades> localidadeses) {
        this.localidadeses = localidadeses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudades")
    public Set<PedidosDestinosDireccionesOriginales> getPedidosDestinosDireccionesOriginaleses() {
        return this.pedidosDestinosDireccionesOriginaleses;
    }

    public void setPedidosDestinosDireccionesOriginaleses(
            Set<PedidosDestinosDireccionesOriginales> pedidosDestinosDireccionesOriginaleses) {
        this.pedidosDestinosDireccionesOriginaleses = pedidosDestinosDireccionesOriginaleses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudades")
    public Set<Barrios> getBarrioses() {
        return this.barrioses;
    }

    public void setBarrioses(Set<Barrios> barrioses) {
        this.barrioses = barrioses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudades")
    public Set<Direcciones> getDireccioneses() {
        return this.direccioneses;
    }

    public void setDireccioneses(Set<Direcciones> direccioneses) {
        this.direccioneses = direccioneses;
    }

}
