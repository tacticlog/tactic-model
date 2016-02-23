/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.CentrosDistribucion;
import com.tacticlogistics.crm.model.entities.Clientes;
import com.tacticlogistics.crm.model.entities.Destinatarios;
import com.tacticlogistics.crm.model.entities.PuntosEntrega;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
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
public class ClientesBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<Clientes> getListClientesActivos() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("codigo", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Clientes object = new Clientes();
        object.setActivo(Boolean.TRUE);

        List<Clientes> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public List<Destinatarios> getListDestinatarioPorCliente(Integer idClientes) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("codigo", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Clientes clientes = new Clientes();
        clientes.setId(idClientes);

        Destinatarios object = new Destinatarios();
        object.setClientes(clientes);
        object.setActivo(Boolean.TRUE);

        List<Destinatarios> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }
    
    public List<PuntosEntrega> getListPuntosEntregaPorDestinatario(Integer idDestinatarios) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Destinatarios filter = new Destinatarios();
        filter.setId(idDestinatarios);

        PuntosEntrega object = new PuntosEntrega();
        object.setDestinatarios(filter);
        object.setActivo(Boolean.TRUE);

        List<PuntosEntrega> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }
    
    public List<CentrosDistribucion> getListCentrosDistribucion() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        CentrosDistribucion object = new CentrosDistribucion();
        object.setActivo(Boolean.TRUE);

        List<CentrosDistribucion> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

}
