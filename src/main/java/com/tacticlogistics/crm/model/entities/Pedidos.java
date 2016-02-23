package com.tacticlogistics.crm.model.entities;
// Generated 28-nov-2015 7:36:03 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name = "Pedidos", schema = "crm", catalog = "Tactic")
public class Pedidos implements java.io.Serializable, EntityId {

    private Integer id;
    private Clientes clientes;
    private Destinatarios destinatarios;
    private String numeroDocumento;
    private TiposPedido tiposPedido;
    private PrioridadesPedidos prioridadesPedidos;
    private TiposFormaPago tiposFormaPago;
    private Date fechaSolicitudPedido;
    private String usuarioSolicitudPedido;
    private String nombreContacto;
    private String telefonosContacto;
    private String emailsContacto;
    private Date fechaEntrega;
    private Date horaInicioEntrega;
    private Date horaFinEntrega;
    private String observacionSolicitud;
    private String observacionInterna;
    private Date fechaConfirmacion;
    private String usuarioConfirmacion;
    private EstadosPedidos estadosPedidos;
    private CausalesAnulacionPedido causalesAnulacionPedido;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private List<PedidosDestinos> pedidosDestinoses = new LinkedList<>();

    public Pedidos() {
    }

    public Pedidos(Integer id, Clientes clientes, Destinatarios destinatarios, String numeroDocumento, TiposPedido tiposPedido, PrioridadesPedidos prioridadesPedidos, TiposFormaPago tiposFormaPago, Date fechaSolicitudPedido, String usuarioSolicitudPedido, String nombreContacto, String telefonosContacto, String emailsContacto, Date fechaEntrega, Date horaInicioEntrega, Date horaFinEntrega, String observacionSolicitud, String observacionInterna, Date fechaConfirmacion, String usuarioConfirmacion, EstadosPedidos estadosPedidos, CausalesAnulacionPedido causalesAnulacionPedido, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
        this.id = id;
        this.clientes = clientes;
        this.destinatarios = destinatarios;
        this.numeroDocumento = numeroDocumento;
        this.tiposPedido = tiposPedido;
        this.prioridadesPedidos = prioridadesPedidos;
        this.tiposFormaPago = tiposFormaPago;
        this.fechaSolicitudPedido = fechaSolicitudPedido;
        this.usuarioSolicitudPedido = usuarioSolicitudPedido;
        this.nombreContacto = nombreContacto;
        this.telefonosContacto = telefonosContacto;
        this.emailsContacto = emailsContacto;
        this.fechaEntrega = fechaEntrega;
        this.horaInicioEntrega = horaInicioEntrega;
        this.horaFinEntrega = horaFinEntrega;
        this.observacionSolicitud = observacionSolicitud;
        this.observacionInterna = observacionInterna;
        this.fechaConfirmacion = fechaConfirmacion;
        this.usuarioConfirmacion = usuarioConfirmacion;
        this.estadosPedidos = estadosPedidos;
        this.causalesAnulacionPedido = causalesAnulacionPedido;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Pedidos(Integer id, Clientes clientes, Destinatarios destinatarios, String numeroDocumento, TiposPedido tiposPedido, PrioridadesPedidos prioridadesPedidos, TiposFormaPago tiposFormaPago, Date fechaSolicitudPedido, String usuarioSolicitudPedido, String nombreContacto, String telefonosContacto, String emailsContacto, Date fechaEntrega, Date horaInicioEntrega, Date horaFinEntrega, String observacionSolicitud, String observacionInterna, Date fechaConfirmacion, String usuarioConfirmacion, EstadosPedidos estadosPedidos, CausalesAnulacionPedido causalesAnulacionPedido, Boolean activo, Date fechaActualizacion, String usuarioActualizacion, List<PedidosDestinos> pedidosDestinoses) {
        this.id = id;
        this.clientes = clientes;
        this.destinatarios = destinatarios;
        this.numeroDocumento = numeroDocumento;
        this.tiposPedido = tiposPedido;
        this.prioridadesPedidos = prioridadesPedidos;
        this.tiposFormaPago = tiposFormaPago;
        this.fechaSolicitudPedido = fechaSolicitudPedido;
        this.usuarioSolicitudPedido = usuarioSolicitudPedido;
        this.nombreContacto = nombreContacto;
        this.telefonosContacto = telefonosContacto;
        this.emailsContacto = emailsContacto;
        this.fechaEntrega = fechaEntrega;
        this.horaInicioEntrega = horaInicioEntrega;
        this.horaFinEntrega = horaFinEntrega;
        this.observacionSolicitud = observacionSolicitud;
        this.observacionInterna = observacionInterna;
        this.fechaConfirmacion = fechaConfirmacion;
        this.usuarioConfirmacion = usuarioConfirmacion;
        this.estadosPedidos = estadosPedidos;
        this.causalesAnulacionPedido = causalesAnulacionPedido;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;

        this.pedidosDestinoses = pedidosDestinoses;
    }

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Cliente", nullable = false)
    public Clientes getClientes() {
        return this.clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Destinatario", nullable = false)
    public Destinatarios getDestinatarios() {
        return this.destinatarios;
    }

    public void setDestinatarios(Destinatarios destinatarios) {
        this.destinatarios = destinatarios;
    }

    @Column(name = "Numero_Documento", nullable = false, length = 30)
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Tipo_Pedido", nullable = false)
    public TiposPedido getTiposPedido() {
        return this.tiposPedido;
    }

    public void setTiposPedido(TiposPedido tiposPedido) {
        this.tiposPedido = tiposPedido;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Prioridad_Pedido", nullable = false)
    public PrioridadesPedidos getPrioridadesPedidos() {
        return this.prioridadesPedidos;
    }

    public void setPrioridadesPedidos(PrioridadesPedidos prioridadesPedidos) {
        this.prioridadesPedidos = prioridadesPedidos;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Tipo_Forma_Pago", nullable = false)
    public TiposFormaPago getTiposFormaPago() {
        return this.tiposFormaPago;
    }

    public void setTiposFormaPago(TiposFormaPago tiposFormaPago) {
        this.tiposFormaPago = tiposFormaPago;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Solicitud_Pedido", nullable = false, length = 19)
    public Date getFechaSolicitudPedido() {
        return this.fechaSolicitudPedido;
    }

    public void setFechaSolicitudPedido(Date fechaSolicitudPedido) {
        this.fechaSolicitudPedido = fechaSolicitudPedido;
    }

    @Column(name = "Usuario_Solicitud_Pedido", length = 50)
    public String getUsuarioSolicitudPedido() {
        return this.usuarioSolicitudPedido;
    }

    public void setUsuarioSolicitudPedido(String usuarioSolicitudPedido) {
        this.usuarioSolicitudPedido = usuarioSolicitudPedido;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Entrega", nullable = false, length = 19)
    public Date getFechaEntrega() {
        return this.fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Hora_Inicio_Entrega", nullable = false, length = 19)
    public Date getHoraInicioEntrega() {
        return this.horaInicioEntrega;
    }

    public void setHoraInicioEntrega(Date horaInicioEntrega) {
        this.horaInicioEntrega = horaInicioEntrega;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Hora_Fin_Entrega", nullable = false, length = 19)
    public Date getHoraFinEntrega() {
        return this.horaFinEntrega;
    }

    public void setHoraFinEntrega(Date horaFinEntrega) {
        this.horaFinEntrega = horaFinEntrega;
    }

    @Column(name = "Observacion_Solicitud", nullable = false, length = 200)
    public String getObservacionSolicitud() {
        return this.observacionSolicitud;
    }

    public void setObservacionSolicitud(String observacionSolicitud) {
        this.observacionSolicitud = observacionSolicitud;
    }

    @Column(name = "Observacion_Interna", nullable = false, length = 200)
    public String getObservacionInterna() {
        return this.observacionInterna;
    }

    public void setObservacionInterna(String observacionInterna) {
        this.observacionInterna = observacionInterna;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Fecha_Confirmacion", length = 19)
    public Date getFechaConfirmacion() {
        return this.fechaConfirmacion;
    }

    public void setFechaConfirmacion(Date fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }

    @Column(name = "Usuario_Confirmacion", length = 50)
    public String getUsuarioConfirmacion() {
        return this.usuarioConfirmacion;
    }

    public void setUsuarioConfirmacion(String usuarioConfirmacion) {
        this.usuarioConfirmacion = usuarioConfirmacion;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Estado_Pedido", nullable = false)
    public EstadosPedidos getEstadosPedidos() {
        return this.estadosPedidos;
    }

    public void setEstadosPedidos(EstadosPedidos estadosPedidos) {
        this.estadosPedidos = estadosPedidos;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Causal_Anulacion_Pedido")
    public CausalesAnulacionPedido getCausalesAnulacionPedido() {
        return this.causalesAnulacionPedido;
    }

    public void setCausalesAnulacionPedido(CausalesAnulacionPedido causalesAnulacionPedido) {
        this.causalesAnulacionPedido = causalesAnulacionPedido;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos", cascade = CascadeType.ALL)
    public List<PedidosDestinos> getPedidosDestinoses() {
        return this.pedidosDestinoses;
    }

    public void setPedidosDestinoses(List<PedidosDestinos> pedidosDestinoses) {
        this.pedidosDestinoses = pedidosDestinoses;
    }
    
}
