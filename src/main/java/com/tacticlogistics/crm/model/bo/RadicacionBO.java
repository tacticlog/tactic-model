/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateRestrictionEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.radicacion.ArchivosRadicados;
import com.tacticlogistics.crm.model.entities.radicacion.CamposArchivoRadicado;
import com.tacticlogistics.crm.model.entities.radicacion.EstadosArchivoRadicado;
import com.tacticlogistics.crm.model.entities.radicacion.GruposArchivosRadicados;
import com.tacticlogistics.crm.model.entities.radicacion.OrdenesVentasSecundariaLog;
import com.tacticlogistics.crm.model.entities.radicacion.TiposArchivoRadicado;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author csarmiento
 */
@Service
public class RadicacionBO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;
    
    public List<GruposArchivosRadicados> getListGruposArchivosRadicados() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        
        GruposArchivosRadicados object = new GruposArchivosRadicados();
        object.setActivo(Boolean.TRUE);
        
        List<GruposArchivosRadicados> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }
    
    public List<TiposArchivoRadicado> getListTiposArchivoRadicado(Integer idGrupoArchivoRadicado) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        
        TiposArchivoRadicado object = new TiposArchivoRadicado();
        object.setIdGrupoArchivoRadicado(idGrupoArchivoRadicado);
        object.setActivo(Boolean.TRUE);
        
        List<TiposArchivoRadicado> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }
    
    public List<EstadosArchivoRadicado> getListEstadosArchivoRadicado() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        
        EstadosArchivoRadicado object = new EstadosArchivoRadicado();
        object.setActivo(Boolean.TRUE);
        
        List<EstadosArchivoRadicado> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }
    
    public EstadosArchivoRadicado getListEstadosArchivoRadicado(Integer id) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        
        EstadosArchivoRadicado object = new EstadosArchivoRadicado();
        object.setId(id);
        object.setActivo(Boolean.TRUE);
        
        List<EstadosArchivoRadicado> list = dao.getRQLList(object, conditionOrderList);
        return list.get(0);
    }
    
    public List<CamposArchivoRadicado> getListCamposArchivoRadicado(Integer idTipoArchivoRadicado) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("ordinal", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        
        CamposArchivoRadicado object = new CamposArchivoRadicado();
        object.setIdTipoArchivoRadicado(idTipoArchivoRadicado);
        object.setActivo(Boolean.TRUE);
        
        List<HibernateRestriction> listHibernateRestriction = new LinkedList<>();
        
        HibernateRestriction hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setExpression(HibernateRestrictionEnum.EQUALS);
        hibernateRestriction.setField("esIdentificadorDeRegistro");
        hibernateRestriction.setValue(false);
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        listHibernateRestriction.add(hibernateRestriction);
        
        hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setExpression(HibernateRestrictionEnum.EQUALS);
        hibernateRestriction.setField("esIdentificadorDeArchivoRadicado");
        hibernateRestriction.setValue(false);
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        listHibernateRestriction.add(hibernateRestriction);
        
        List<CamposArchivoRadicado> list = dao.getRQLList(object, listHibernateRestriction,
                conditionOrderList);
        return list;
    }
    
    public List<ArchivosRadicados> getListArchivosRadicados(Integer idEstadoArchivoRadicado, String fechaInicial,
            String fechaFinal) throws Exception {
        String criterios = "a.fechaRadicacion BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";
        if (idEstadoArchivoRadicado > 0) {
            criterios += " AND a.idEstadoArchivoRadicado = " + idEstadoArchivoRadicado;
        }
        return dao.getHQLList("FROM ArchivosRadicados a WHERE " + criterios + " ORDER BY a.fechaRadicacion");
    }
    
    public List<OrdenesVentasSecundariaLog> getListOrdenesVentasSecundariaLog(Integer idArchivoRadicado) throws Exception {
        OrdenesVentasSecundariaLog log = new OrdenesVentasSecundariaLog();
        log.setIdArchivoRadicado(idArchivoRadicado);
        return dao.getRQLList(log);
    }
    
    public void save(Object entity) throws RuntimeException, Exception {
        dao.saveOrUpdate(entity);
    }
    
}
