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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * DestinatariosFinales generated by hbm2java
 */
@Entity
@Table(name = "Destinatarios_Finales", schema = "crm", catalog = "Tactic")
public class DestinatariosFinales implements java.io.Serializable, EntityId {

    private Integer id;
    private Destinatarios destinatarios;
    private Terceros terceros;
    private String codigo;
    private String nombreContacto;
    private String telefonosContacto;
    private String emailsContacto;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private Set<Despachos> despachoses = new HashSet<Despachos>(0);
    private Set<PuntosEntrega> puntosEntregas = new HashSet<PuntosEntrega>(0);
    private Set<PedidosDestinos> pedidosDestinoses = new HashSet<PedidosDestinos>(0);

    public DestinatariosFinales() {
    }

    public DestinatariosFinales(Destinatarios destinatarios, Terceros terceros, String codigo, String nombreContacto, String telefonosContacto, String emailsContacto, Boolean activo,
            Date fechaActualizacion, String usuarioActualizacion) {
        this.destinatarios = destinatarios;
        this.terceros = terceros;
        this.codigo = codigo;
        this.nombreContacto = nombreContacto;
        this.telefonosContacto = telefonosContacto;
        this.emailsContacto = emailsContacto;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public DestinatariosFinales(Destinatarios destinatarios, Terceros terceros, String codigo, String nombreContacto, String telefonosContacto, String emailsContacto, Boolean activo,
            Date fechaActualizacion, String usuarioActualizacion, Set<Despachos> despachoses,
            Set<PuntosEntrega> puntosEntregas, Set<PedidosDestinos> pedidosDestinoses) {
        this.destinatarios = destinatarios;
        this.terceros = terceros;
        this.codigo = codigo;
        this.nombreContacto = nombreContacto;
        this.telefonosContacto = telefonosContacto;
        this.emailsContacto = emailsContacto;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.despachoses = despachoses;
        this.puntosEntregas = puntosEntregas;
        this.pedidosDestinoses = pedidosDestinoses;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Destinatario", nullable = false)
    public Destinatarios getDestinatarios() {
        return this.destinatarios;
    }

    public void setDestinatarios(Destinatarios destinatarios) {
        this.destinatarios = destinatarios;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    public Terceros getTerceros() {
        return this.terceros;
    }

    public void setTerceros(Terceros terceros) {
        this.terceros = terceros;
    }

    @Column(name = "Codigo", nullable = false, length = 20)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name = "Nombre_Contacto", nullable = false, length = 100)
    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Column(name = "Telefonos_Contacto", nullable = false, length = 50)
    public String getTelefonosContacto() {
        return telefonosContacto;
    }

    public void setTelefonosContacto(String telefonosContacto) {
        this.telefonosContacto = telefonosContacto;
    }

    @Column(name = "Emails_Cotacto", nullable = false, length = 50)
    public String getEmailsContacto() {
        return emailsContacto;
    }

    public void setEmailsContacto(String emailsContacto) {
        this.emailsContacto = emailsContacto;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "destinatariosFinales")
    public Set<Despachos> getDespachoses() {
        return this.despachoses;
    }

    public void setDespachoses(Set<Despachos> despachoses) {
        this.despachoses = despachoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "destinatariosFinales")
    public Set<PuntosEntrega> getPuntosEntregas() {
        return this.puntosEntregas;
    }

    public void setPuntosEntregas(Set<PuntosEntrega> puntosEntregas) {
        this.puntosEntregas = puntosEntregas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "destinatariosFinales")
    public Set<PedidosDestinos> getPedidosDestinoses() {
        return this.pedidosDestinoses;
    }

    public void setPedidosDestinoses(Set<PedidosDestinos> pedidosDestinoses) {
        this.pedidosDestinoses = pedidosDestinoses;
    }

}
