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
 * PrioridadesPedidos generated by hbm2java
 */
@Entity
@Table(name = "Prioridades_Pedidos", schema = "crm", catalog = "Tactic")
public class PrioridadesPedidos implements java.io.Serializable {

    private Integer id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Boolean pedeterminado;
    private Integer ordinal;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private Set<Despachos> despachoses = new HashSet<>(0);
    private Set<Pedidos> pedidoses = new HashSet<>(0);

    public PrioridadesPedidos() {
    }

    public PrioridadesPedidos(Integer id) {
        this.id = id;
    }

    public PrioridadesPedidos(Integer id, String codigo, String nombre, String descripcion, Boolean pedeterminado,
            Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pedeterminado = pedeterminado;
        this.ordinal = ordinal;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public PrioridadesPedidos(Integer id, String codigo, String nombre, String descripcion, Boolean pedeterminado,
            Integer ordinal, Boolean activo, Date fechaActualizacion, String usuarioActualizacion,
            Set<Despachos> despachoses, Set<Pedidos> pedidoses) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pedeterminado = pedeterminado;
        this.ordinal = ordinal;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.despachoses = despachoses;
        this.pedidoses = pedidoses;
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

    @Column(name = "Pedeterminado", nullable = false)
    public Boolean getPedeterminado() {
        return this.pedeterminado;
    }

    public void setPedeterminado(Boolean pedeterminado) {
        this.pedeterminado = pedeterminado;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "prioridadesPedidos")
    public Set<Despachos> getDespachoses() {
        return this.despachoses;
    }

    public void setDespachoses(Set<Despachos> despachoses) {
        this.despachoses = despachoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "prioridadesPedidos")
    public Set<Pedidos> getPedidoses() {
        return this.pedidoses;
    }

    public void setPedidoses(Set<Pedidos> pedidoses) {
        this.pedidoses = pedidoses;
    }

}
