package com.tacticlogistics.crm.model.entities.radicacion;
// Generated 05-feb-2016 6:28:15 by Hibernate Tools 4.3.1.Final

import com.tacticlogistics.crm.model.entities.EntityId;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrdenesVentasSecundaria generated by hbm2java
 */
@Entity
@Table(name = "Ordenes_Ventas_Secundaria", schema = "radicacion", catalog = "Tactic")
public class OrdenesVentasSecundaria implements java.io.Serializable, EntityId {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer idArchivoRadicado;
    private String codigoCliente;
    private String numeroIdentificacionDestinatario;
    private String billToNombre;
    private String billToTelefonos;
    private String billToEmail;
    private String codigoCiudad;
    private String direccion;
    private String indicacionesDireccion;
    private String shipToNombre;
    private String shipToTelefonos;
    private String shipToEmail;
    private String numeroDocumentoCliente;
    private Date fechaEntregaPreferidaMinima;
    private Date fechaEntregaPreferidaMaxima;
    private Date horaEntregaPreferidaMinima;
    private Date horaEntregaPreferidaMaxima;
    private Integer valorDeclarado;
    private String codigoFormaDePago;
    private Boolean requiereMaquila;
    private String notasOrden;
    private String codigoProducto;
    private Integer cantidad;
    private String codigoUnidad;
    private String numeroDeLote;
    private String notasItemOrden;

    public OrdenesVentasSecundaria() {
    }

    public OrdenesVentasSecundaria(Integer id, Integer idArchivoRadicado, String codigoCliente,
            String numeroIdentificacionDestinatario, String billToNombre, String billToTelefonos, String billToEmail,
            String codigoCiudad, String direccion, String indicacionesDireccion, String shipToNombre,
            String shipToTelefonos, String shipToEmail, String numeroDocumentoCliente, Date fechaEntregaPreferidaMinima,
            Date fechaEntregaPreferidaMaxima, Date horaEntregaPreferidaMinima, Date horaEntregaPreferidaMaxima,
            String codigoFormaDePago, Boolean requiereMaquila, String notasOrden, String codigoProducto,
            Integer cantidad, String codigoUnidad, String numeroDeLote, String notasItemOrden) {
        this.id = id;
        this.idArchivoRadicado = idArchivoRadicado;
        this.codigoCliente = codigoCliente;
        this.numeroIdentificacionDestinatario = numeroIdentificacionDestinatario;
        this.billToNombre = billToNombre;
        this.billToTelefonos = billToTelefonos;
        this.billToEmail = billToEmail;
        this.codigoCiudad = codigoCiudad;
        this.direccion = direccion;
        this.indicacionesDireccion = indicacionesDireccion;
        this.shipToNombre = shipToNombre;
        this.shipToTelefonos = shipToTelefonos;
        this.shipToEmail = shipToEmail;
        this.numeroDocumentoCliente = numeroDocumentoCliente;
        this.fechaEntregaPreferidaMinima = fechaEntregaPreferidaMinima;
        this.fechaEntregaPreferidaMaxima = fechaEntregaPreferidaMaxima;
        this.horaEntregaPreferidaMinima = horaEntregaPreferidaMinima;
        this.horaEntregaPreferidaMaxima = horaEntregaPreferidaMaxima;
        this.codigoFormaDePago = codigoFormaDePago;
        this.requiereMaquila = requiereMaquila;
        this.notasOrden = notasOrden;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.codigoUnidad = codigoUnidad;
        this.numeroDeLote = numeroDeLote;
        this.notasItemOrden = notasItemOrden;
    }

    public OrdenesVentasSecundaria(Integer id, Integer idArchivoRadicado, String codigoCliente,
            String numeroIdentificacionDestinatario, String billToNombre, String billToTelefonos, String billToEmail,
            String codigoCiudad, String direccion, String indicacionesDireccion, String shipToNombre,
            String shipToTelefonos, String shipToEmail, String numeroDocumentoCliente, Date fechaEntregaPreferidaMinima,
            Date fechaEntregaPreferidaMaxima, Date horaEntregaPreferidaMinima, Date horaEntregaPreferidaMaxima,
            Integer valorDeclarado, String codigoFormaDePago, Boolean requiereMaquila, String notasOrden,
            String codigoProducto, Integer cantidad, String codigoUnidad, String numeroDeLote, String notasItemOrden) {
        this.id = id;
        this.idArchivoRadicado = idArchivoRadicado;
        this.codigoCliente = codigoCliente;
        this.numeroIdentificacionDestinatario = numeroIdentificacionDestinatario;
        this.billToNombre = billToNombre;
        this.billToTelefonos = billToTelefonos;
        this.billToEmail = billToEmail;
        this.codigoCiudad = codigoCiudad;
        this.direccion = direccion;
        this.indicacionesDireccion = indicacionesDireccion;
        this.shipToNombre = shipToNombre;
        this.shipToTelefonos = shipToTelefonos;
        this.shipToEmail = shipToEmail;
        this.numeroDocumentoCliente = numeroDocumentoCliente;
        this.fechaEntregaPreferidaMinima = fechaEntregaPreferidaMinima;
        this.fechaEntregaPreferidaMaxima = fechaEntregaPreferidaMaxima;
        this.horaEntregaPreferidaMinima = horaEntregaPreferidaMinima;
        this.horaEntregaPreferidaMaxima = horaEntregaPreferidaMaxima;
        this.valorDeclarado = valorDeclarado;
        this.codigoFormaDePago = codigoFormaDePago;
        this.requiereMaquila = requiereMaquila;
        this.notasOrden = notasOrden;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.codigoUnidad = codigoUnidad;
        this.numeroDeLote = numeroDeLote;
        this.notasItemOrden = notasItemOrden;
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

    @Column(name = "Id_Archivo_Radicado", nullable = false)
    public Integer getIdArchivoRadicado() {
        return this.idArchivoRadicado;
    }

    public void setIdArchivoRadicado(Integer idArchivoRadicado) {
        this.idArchivoRadicado = idArchivoRadicado;
    }

    @Column(name = "Codigo_Cliente", nullable = true, length = 20)
    public String getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Column(name = "Numero_Identificacion_Destinatario", nullable = true, length = 20)
    public String getNumeroIdentificacionDestinatario() {
        return this.numeroIdentificacionDestinatario;
    }

    public void setNumeroIdentificacionDestinatario(String numeroIdentificacionDestinatario) {
        this.numeroIdentificacionDestinatario = numeroIdentificacionDestinatario;
    }

    @Column(name = "Bill_To_Nombre", nullable = true, length = 100)
    public String getBillToNombre() {
        return this.billToNombre;
    }

    public void setBillToNombre(String billToNombre) {
        this.billToNombre = billToNombre;
    }

    @Column(name = "Bill_To_Telefonos", nullable = true, length = 50)
    public String getBillToTelefonos() {
        return this.billToTelefonos;
    }

    public void setBillToTelefonos(String billToTelefonos) {
        this.billToTelefonos = billToTelefonos;
    }

    @Column(name = "Bill_To_Email", nullable = true, length = 50)
    public String getBillToEmail() {
        return this.billToEmail;
    }

    public void setBillToEmail(String billToEmail) {
        this.billToEmail = billToEmail;
    }

    @Column(name = "Codigo_Ciudad", nullable = true, length = 100)
    public String getCodigoCiudad() {
        return this.codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    @Column(name = "Direccion", nullable = true, length = 150)
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "Indicaciones_Direccion", nullable = true, length = 150)
    public String getIndicacionesDireccion() {
        return this.indicacionesDireccion;
    }

    public void setIndicacionesDireccion(String indicacionesDireccion) {
        this.indicacionesDireccion = indicacionesDireccion;
    }

    @Column(name = "Ship_To_Nombre", nullable = true, length = 100)
    public String getShipToNombre() {
        return this.shipToNombre;
    }

    public void setShipToNombre(String shipToNombre) {
        this.shipToNombre = shipToNombre;
    }

    @Column(name = "Ship_To_Telefonos", nullable = true, length = 50)
    public String getShipToTelefonos() {
        return this.shipToTelefonos;
    }

    public void setShipToTelefonos(String shipToTelefonos) {
        this.shipToTelefonos = shipToTelefonos;
    }

    @Column(name = "Ship_To_Email", nullable = true, length = 50)
    public String getShipToEmail() {
        return this.shipToEmail;
    }

    public void setShipToEmail(String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }

    @Column(name = "Numero_Documento_Cliente", nullable = true, length = 30)
    public String getNumeroDocumentoCliente() {
        return this.numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Entrega_Preferida_Minima", nullable = true, length = 10)
    public Date getFechaEntregaPreferidaMinima() {
        return this.fechaEntregaPreferidaMinima;
    }

    public void setFechaEntregaPreferidaMinima(Date fechaEntregaPreferidaMinima) {
        this.fechaEntregaPreferidaMinima = fechaEntregaPreferidaMinima;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Entrega_Preferida_Maxima", nullable = true, length = 10)
    public Date getFechaEntregaPreferidaMaxima() {
        return this.fechaEntregaPreferidaMaxima;
    }

    public void setFechaEntregaPreferidaMaxima(Date fechaEntregaPreferidaMaxima) {
        this.fechaEntregaPreferidaMaxima = fechaEntregaPreferidaMaxima;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "Hora_Entrega_Preferida_Minima", nullable = true, length = 8)
    public Date getHoraEntregaPreferidaMinima() {
        return this.horaEntregaPreferidaMinima;
    }

    public void setHoraEntregaPreferidaMinima(Date horaEntregaPreferidaMinima) {
        this.horaEntregaPreferidaMinima = horaEntregaPreferidaMinima;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "Hora_Entrega_Preferida_Maxima", nullable = true, length = 8)
    public Date getHoraEntregaPreferidaMaxima() {
        return this.horaEntregaPreferidaMaxima;
    }

    public void setHoraEntregaPreferidaMaxima(Date horaEntregaPreferidaMaxima) {
        this.horaEntregaPreferidaMaxima = horaEntregaPreferidaMaxima;
    }

    @Column(name = "Valor_Declarado")
    public Integer getValorDeclarado() {
        return this.valorDeclarado;
    }

    public void setValorDeclarado(Integer valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Column(name = "Codigo_Forma_De_Pago", nullable = true, length = 20)
    public String getCodigoFormaDePago() {
        return this.codigoFormaDePago;
    }

    public void setCodigoFormaDePago(String codigoFormaDePago) {
        this.codigoFormaDePago = codigoFormaDePago;
    }

    @Column(name = "Requiere_Maquila", nullable = true)
    public Boolean getRequiereMaquila() {
        return this.requiereMaquila;
    }

    public void setRequiereMaquila(Boolean requiereMaquila) {
        this.requiereMaquila = requiereMaquila;
    }

    @Column(name = "Notas_Orden", nullable = true, length = 200)
    public String getNotasOrden() {
        return this.notasOrden;
    }

    public void setNotasOrden(String notasOrden) {
        this.notasOrden = notasOrden;
    }

    @Column(name = "Codigo_Producto", nullable = true, length = 20)
    public String getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Column(name = "Cantidad", nullable = true)
    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "Codigo_Unidad", nullable = true, length = 20)
    public String getCodigoUnidad() {
        return this.codigoUnidad;
    }

    public void setCodigoUnidad(String codigoUnidad) {
        this.codigoUnidad = codigoUnidad;
    }

    @Column(name = "Numero_De_Lote", nullable = true, length = 30)
    public String getNumeroDeLote() {
        return this.numeroDeLote;
    }

    public void setNumeroDeLote(String numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    @Column(name = "Notas_Item_Orden", nullable = true, length = 200)
    public String getNotasItemOrden() {
        return this.notasItemOrden;
    }

    public void setNotasItemOrden(String notasItemOrden) {
        this.notasItemOrden = notasItemOrden;
    }

}
