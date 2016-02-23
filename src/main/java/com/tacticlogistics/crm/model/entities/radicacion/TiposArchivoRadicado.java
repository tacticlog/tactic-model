package com.tacticlogistics.crm.model.entities.radicacion;
// Generated 05-feb-2016 6:28:15 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TiposArchivoRadicado generated by hbm2java
 */
@Entity
@Table(name = "Tipos_Archivo_Radicado", schema = "radicacion", catalog = "Tactic", uniqueConstraints = @UniqueConstraint(columnNames = "Codigo"))
public class TiposArchivoRadicado implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer idGrupoArchivoRadicado;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String extensionArchivo;
    private String separadorRegistro;
    private String separadorCampo;
    private Integer numeroCampos;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private Integer ordinal;
    private Boolean activo;
    private Date fechaActualizacion;
    private String usuarioActualizacion;

    public TiposArchivoRadicado() {
    }

    public TiposArchivoRadicado(Integer id, Integer idGrupoArchivoRadicado, String codigo, String nombre,
            String descripcion, String extensionArchivo, String separadorRegistro, String separadorCampo,
            Integer numeroCampos, String tableCatalog, String tableSchema, String tableName, Integer ordinal,
            Boolean activo, Date fechaActualizacion, String usuarioActualizacion) {
        this.id = id;
        this.idGrupoArchivoRadicado = idGrupoArchivoRadicado;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.extensionArchivo = extensionArchivo;
        this.separadorRegistro = separadorRegistro;
        this.separadorCampo = separadorCampo;
        this.numeroCampos = numeroCampos;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.ordinal = ordinal;
        this.activo = activo;
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

    @Column(name = "Id_Grupo_Archivo_Radicado", nullable = false)
    public Integer getIdGrupoArchivoRadicado() {
        return this.idGrupoArchivoRadicado;
    }

    public void setIdGrupoArchivoRadicado(Integer idGrupoArchivoRadicado) {
        this.idGrupoArchivoRadicado = idGrupoArchivoRadicado;
    }

    @Column(name = "Codigo", unique = true, nullable = false, length = 20)
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

    @Column(name = "Extension_Archivo", nullable = false, length = 20)
    public String getExtensionArchivo() {
        return this.extensionArchivo;
    }

    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionArchivo = extensionArchivo;
    }

    @Column(name = "Separador_Registro", nullable = false, length = 2)
    public String getSeparadorRegistro() {
        return this.separadorRegistro;
    }

    public void setSeparadorRegistro(String separadorRegistro) {
        this.separadorRegistro = separadorRegistro;
    }

    @Column(name = "Separador_Campo", nullable = false, length = 2)
    public String getSeparadorCampo() {
        return this.separadorCampo;
    }

    public void setSeparadorCampo(String separadorCampo) {
        this.separadorCampo = separadorCampo;
    }

    @Column(name = "Numero_Campos", nullable = false)
    public Integer getNumeroCampos() {
        return this.numeroCampos;
    }

    public void setNumeroCampos(Integer numeroCampos) {
        this.numeroCampos = numeroCampos;
    }

    @Column(name = "TABLE_CATALOG", nullable = false, length = 256)
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Column(name = "TABLE_SCHEMA", nullable = false, length = 256)
    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Column(name = "TABLE_NAME", nullable = false, length = 256)
    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    @Override
    public String toString() {
        return nombre;
    }

}