package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Clientes generated by hbm2java
 */
@Entity
@Table(name = "Clientes", schema = "crm", catalog = "Tactic", uniqueConstraints = @UniqueConstraint(columnNames = "Codigo"))
public class Clientes implements java.io.Serializable, EntityId {

    private Integer id;
    private Terceros terceros;
    private String codigo;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private Set<Pedidos> pedidoses = new HashSet<>(0);
    private Set<Productos> productoses = new HashSet<>(0);
    private Set<Destinatarios> destinatarioses = new HashSet<>(0);
    private Set<Despachos> despachoses = new HashSet<>(0);
    private Set<TiposHorarioPuntoEntrega> tiposHorarioPuntoEntregas = new HashSet<>(0);

    public Clientes() {
    }

    public Clientes(Terceros terceros, String codigo, Boolean activo, Date fechaActualizacion,
            String usuarioActualizacion) {
        this.terceros = terceros;
        this.codigo = codigo;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Clientes(Terceros terceros, String codigo, Boolean activo, Date fechaActualizacion,
            String usuarioActualizacion, Set<Pedidos> pedidoses, Set<Productos> productoses,
            Set<Destinatarios> destinatarioses, Set<Despachos> despachoses,
            Set<TiposHorarioPuntoEntrega> tiposHorarioPuntoEntregas) {
        this.terceros = terceros;
        this.codigo = codigo;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.pedidoses = pedidoses;
        this.productoses = productoses;
        this.destinatarioses = destinatarioses;
        this.despachoses = despachoses;
        this.tiposHorarioPuntoEntregas = tiposHorarioPuntoEntregas;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "terceros"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", unique = true, nullable = false)
    @Override
    public Integer getId() {

        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    public Terceros getTerceros() {
        return this.terceros;
    }

    public void setTerceros(Terceros terceros) {
        this.terceros = terceros;
    }

    @Column(name = "Codigo", unique = true, nullable = false, length = 20)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
    public Set<Pedidos> getPedidoses() {
        return this.pedidoses;
    }

    public void setPedidoses(Set<Pedidos> pedidoses) {
        this.pedidoses = pedidoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
    public Set<Productos> getProductoses() {
        return this.productoses;
    }

    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
    public Set<Destinatarios> getDestinatarioses() {
        return this.destinatarioses;
    }

    public void setDestinatarioses(Set<Destinatarios> destinatarioses) {
        this.destinatarioses = destinatarioses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
    public Set<Despachos> getDespachoses() {
        return this.despachoses;
    }

    public void setDespachoses(Set<Despachos> despachoses) {
        this.despachoses = despachoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientes")
    public Set<TiposHorarioPuntoEntrega> getTiposHorarioPuntoEntregas() {
        return this.tiposHorarioPuntoEntregas;
    }

    public void setTiposHorarioPuntoEntregas(Set<TiposHorarioPuntoEntrega> tiposHorarioPuntoEntregas) {
        this.tiposHorarioPuntoEntregas = tiposHorarioPuntoEntregas;
    }

}
