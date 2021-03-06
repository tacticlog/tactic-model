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

/**
 * Direcciones generated by hbm2java
 */
@Entity
@Table(name = "Direcciones", schema = "geo", catalog = "Tactic")
public class Direcciones implements java.io.Serializable {

    private Integer id;
    private Terceros terceros;
    private Barrios barrios;
    private Ciudades ciudades;
    private Localidades localidades;
    private TiposUsoDireccion tiposUsoDireccion;
    private Zonas zonas;
    private Boolean urbana;
    private String direccionOriginal;
    private Boolean estandarizada;
    private String direccionEstandarizada;
    private Integer idAbreviaturaVialViaPrincipal;
    private String viaPrincipal;
    private String viaGeneradora;
    private String numeroPlaca;
    private String indicaciones;
    private Boolean georeferenciada;
    private BigDecimal latitud;
    private BigDecimal longitud;
    private Integer idNivelSocioEconomico;
    private Integer idTipoFuenteDireccion;
    private String direccionAlterna;
    private String codigoPostal;
    private String nombreContacto;
    private String cargoContacto;
    private String telefonoFijo;
    private String telefonoMovil;
    private String telefonoFax;
    private String email;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;
    private Set<Despachos> despachosesForIdDireccionDestino = new HashSet<>(0);
    private Set<PedidosDestinos> pedidosDestinoses = new HashSet<>(0);
    private Set<CentrosDistribucion> centrosDistribucions = new HashSet<>(0);
    private Set<PuntosEntrega> puntosEntregas = new HashSet<>(0);
    private Set<Despachos> despachosesForIdDireccionOrigen = new HashSet<Despachos>(0);

    public Direcciones() {
    }

    public Direcciones(Integer id, Terceros terceros, Ciudades ciudades, TiposUsoDireccion tiposUsoDireccion,
            Boolean urbana, String direccionOriginal, Boolean estandarizada, String direccionEstandarizada,
            String viaPrincipal, String viaGeneradora, String numeroPlaca, String indicaciones, Boolean georeferenciada,
            BigDecimal latitud, BigDecimal longitud, String direccionAlterna, String codigoPostal,
            String nombreContacto, String cargoContacto, String telefonoFijo, String telefonoMovil, String telefonoFax,
            String email, Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
        this.id = id;
        this.terceros = terceros;
        this.ciudades = ciudades;
        this.tiposUsoDireccion = tiposUsoDireccion;
        this.urbana = urbana;
        this.direccionOriginal = direccionOriginal;
        this.estandarizada = estandarizada;
        this.direccionEstandarizada = direccionEstandarizada;
        this.viaPrincipal = viaPrincipal;
        this.viaGeneradora = viaGeneradora;
        this.numeroPlaca = numeroPlaca;
        this.indicaciones = indicaciones;
        this.georeferenciada = georeferenciada;
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccionAlterna = direccionAlterna;
        this.codigoPostal = codigoPostal;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.telefonoFax = telefonoFax;
        this.email = email;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Direcciones(Integer id, Terceros terceros, Barrios barrios, Ciudades ciudades, Localidades localidades,
            TiposUsoDireccion tiposUsoDireccion, Zonas zonas, Boolean urbana, String direccionOriginal,
            Boolean estandarizada, String direccionEstandarizada, Integer idAbreviaturaVialViaPrincipal,
            String viaPrincipal, String viaGeneradora, String numeroPlaca, String indicaciones, Boolean georeferenciada,
            BigDecimal latitud, BigDecimal longitud, Integer idNivelSocioEconomico, Integer idTipoFuenteDireccion,
            String direccionAlterna, String codigoPostal, String nombreContacto, String cargoContacto,
            String telefonoFijo, String telefonoMovil, String telefonoFax, String email, Boolean activo,
            Date fechaActualizacion, String usuarioActualizacion, Set<Despachos> despachosesForIdDireccionDestino,
            Set<PedidosDestinos> pedidosDestinoses, Set<CentrosDistribucion> centrosDistribucions,
            Set<PuntosEntrega> puntosEntregas, Set<Despachos> despachosesForIdDireccionOrigen) {
        this.id = id;
        this.terceros = terceros;
        this.barrios = barrios;
        this.ciudades = ciudades;
        this.localidades = localidades;
        this.tiposUsoDireccion = tiposUsoDireccion;
        this.zonas = zonas;
        this.urbana = urbana;
        this.direccionOriginal = direccionOriginal;
        this.estandarizada = estandarizada;
        this.direccionEstandarizada = direccionEstandarizada;
        this.idAbreviaturaVialViaPrincipal = idAbreviaturaVialViaPrincipal;
        this.viaPrincipal = viaPrincipal;
        this.viaGeneradora = viaGeneradora;
        this.numeroPlaca = numeroPlaca;
        this.indicaciones = indicaciones;
        this.georeferenciada = georeferenciada;
        this.latitud = latitud;
        this.longitud = longitud;
        this.idNivelSocioEconomico = idNivelSocioEconomico;
        this.idTipoFuenteDireccion = idTipoFuenteDireccion;
        this.direccionAlterna = direccionAlterna;
        this.codigoPostal = codigoPostal;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.telefonoFax = telefonoFax;
        this.email = email;
        this.activo = activo;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.despachosesForIdDireccionDestino = despachosesForIdDireccionDestino;
        this.pedidosDestinoses = pedidosDestinoses;
        this.centrosDistribucions = centrosDistribucions;
        this.puntosEntregas = puntosEntregas;
        this.despachosesForIdDireccionOrigen = despachosesForIdDireccionOrigen;
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
    @JoinColumn(name = "Id_Tercero_Propietario", nullable = false)
    public Terceros getTerceros() {
        return this.terceros;
    }

    public void setTerceros(Terceros terceros) {
        this.terceros = terceros;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Barrio")
    public Barrios getBarrios() {
        return this.barrios;
    }

    public void setBarrios(Barrios barrios) {
        this.barrios = barrios;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Ciudad", nullable = false)
    public Ciudades getCiudades() {
        return this.ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Localidad")
    public Localidades getLocalidades() {
        return this.localidades;
    }

    public void setLocalidades(Localidades localidades) {
        this.localidades = localidades;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Tipo_Uso_Direccion", nullable = false)
    public TiposUsoDireccion getTiposUsoDireccion() {
        return this.tiposUsoDireccion;
    }

    public void setTiposUsoDireccion(TiposUsoDireccion tiposUsoDireccion) {
        this.tiposUsoDireccion = tiposUsoDireccion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Zona")
    public Zonas getZonas() {
        return this.zonas;
    }

    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
    }

    @Column(name = "Urbana", nullable = false)
    public Boolean getUrbana() {
        return this.urbana;
    }

    public void setUrbana(Boolean urbana) {
        this.urbana = urbana;
    }

    @Column(name = "Direccion_Original", nullable = false, length = 150)
    public String getDireccionOriginal() {
        return this.direccionOriginal;
    }

    public void setDireccionOriginal(String direccionOriginal) {
        this.direccionOriginal = direccionOriginal;
    }

    @Column(name = "Estandarizada", nullable = false)
    public Boolean getEstandarizada() {
        return this.estandarizada;
    }

    public void setEstandarizada(Boolean estandarizada) {
        this.estandarizada = estandarizada;
    }

    @Column(name = "Direccion_Estandarizada", nullable = false, length = 150)
    public String getDireccionEstandarizada() {
        return this.direccionEstandarizada;
    }

    public void setDireccionEstandarizada(String direccionEstandarizada) {
        this.direccionEstandarizada = direccionEstandarizada;
    }

    @Column(name = "Id_Abreviatura_Vial_Via_Principal")
    public Integer getIdAbreviaturaVialViaPrincipal() {
        return this.idAbreviaturaVialViaPrincipal;
    }

    public void setIdAbreviaturaVialViaPrincipal(Integer idAbreviaturaVialViaPrincipal) {
        this.idAbreviaturaVialViaPrincipal = idAbreviaturaVialViaPrincipal;
    }

    @Column(name = "Via_Principal", nullable = false, length = 50)
    public String getViaPrincipal() {
        return this.viaPrincipal;
    }

    public void setViaPrincipal(String viaPrincipal) {
        this.viaPrincipal = viaPrincipal;
    }

    @Column(name = "Via_Generadora", nullable = false, length = 50)
    public String getViaGeneradora() {
        return this.viaGeneradora;
    }

    public void setViaGeneradora(String viaGeneradora) {
        this.viaGeneradora = viaGeneradora;
    }

    @Column(name = "Numero_Placa", nullable = false, length = 50)
    public String getNumeroPlaca() {
        return this.numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Column(name = "Indicaciones", nullable = false, length = 150)
    public String getIndicaciones() {
        return this.indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    @Column(name = "Georeferenciada", nullable = false)
    public Boolean getGeoreferenciada() {
        return this.georeferenciada;
    }

    public void setGeoreferenciada(Boolean georeferenciada) {
        this.georeferenciada = georeferenciada;
    }

    @Column(name = "Latitud", nullable = false, precision = 18, scale = 15)
    public BigDecimal getLatitud() {
        return this.latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    @Column(name = "Longitud", nullable = false, precision = 18, scale = 15)
    public BigDecimal getLongitud() {
        return this.longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    @Column(name = "Id_Nivel_Socio_Economico")
    public Integer getIdNivelSocioEconomico() {
        return this.idNivelSocioEconomico;
    }

    public void setIdNivelSocioEconomico(Integer idNivelSocioEconomico) {
        this.idNivelSocioEconomico = idNivelSocioEconomico;
    }

    @Column(name = "Id_Tipo_Fuente_Direccion")
    public Integer getIdTipoFuenteDireccion() {
        return this.idTipoFuenteDireccion;
    }

    public void setIdTipoFuenteDireccion(Integer idTipoFuenteDireccion) {
        this.idTipoFuenteDireccion = idTipoFuenteDireccion;
    }

    @Column(name = "Direccion_Alterna", nullable = false, length = 150)
    public String getDireccionAlterna() {
        return this.direccionAlterna;
    }

    public void setDireccionAlterna(String direccionAlterna) {
        this.direccionAlterna = direccionAlterna;
    }

    @Column(name = "Codigo_Postal", nullable = false, length = 10)
    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Column(name = "Nombre_Contacto", nullable = false, length = 100)
    public String getNombreContacto() {
        return this.nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Column(name = "Cargo_Contacto", nullable = false, length = 50)
    public String getCargoContacto() {
        return this.cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    @Column(name = "Telefono_Fijo", nullable = false, length = 20)
    public String getTelefonoFijo() {
        return this.telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Column(name = "Telefono_Movil", nullable = false, length = 20)
    public String getTelefonoMovil() {
        return this.telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Column(name = "Telefono_Fax", nullable = false, length = 20)
    public String getTelefonoFax() {
        return this.telefonoFax;
    }

    public void setTelefonoFax(String telefonoFax) {
        this.telefonoFax = telefonoFax;
    }

    @Column(name = "Email", nullable = false, length = 200)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionesByIdDireccionDestino")
    public Set<Despachos> getDespachosesForIdDireccionDestino() {
        return this.despachosesForIdDireccionDestino;
    }

    public void setDespachosesForIdDireccionDestino(Set<Despachos> despachosesForIdDireccionDestino) {
        this.despachosesForIdDireccionDestino = despachosesForIdDireccionDestino;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direcciones")
    public Set<PedidosDestinos> getPedidosDestinoses() {
        return this.pedidosDestinoses;
    }

    public void setPedidosDestinoses(Set<PedidosDestinos> pedidosDestinoses) {
        this.pedidosDestinoses = pedidosDestinoses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direcciones")
    public Set<CentrosDistribucion> getCentrosDistribucions() {
        return this.centrosDistribucions;
    }

    public void setCentrosDistribucions(Set<CentrosDistribucion> centrosDistribucions) {
        this.centrosDistribucions = centrosDistribucions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direcciones")
    public Set<PuntosEntrega> getPuntosEntregas() {
        return this.puntosEntregas;
    }

    public void setPuntosEntregas(Set<PuntosEntrega> puntosEntregas) {
        this.puntosEntregas = puntosEntregas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "direccionesByIdDireccionOrigen")
    public Set<Despachos> getDespachosesForIdDireccionOrigen() {
        return this.despachosesForIdDireccionOrigen;
    }

    public void setDespachosesForIdDireccionOrigen(Set<Despachos> despachosesForIdDireccionOrigen) {
        this.despachosesForIdDireccionOrigen = despachosesForIdDireccionOrigen;
    }

}
