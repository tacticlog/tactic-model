package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacticlogistics.crm.model.entities.Pedidos;
import com.tacticlogistics.crm.model.entities.PedidosDestinos;
import com.tacticlogistics.crm.model.entities.PedidosProductos;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import java.util.LinkedList;

@Service
public class PedidosBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<Pedidos> getListPedidos(Pedidos pedidos, List<HibernateRestriction> conditionCriteriaList) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("fechaSolicitudPedido", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);
        List<Pedidos> list = dao.getRQLList(pedidos, conditionCriteriaList, conditionOrderList);
        return list;
    }

    public List<PedidosDestinos> getListPedidosDestinos(Pedidos pedidos) throws Exception {
        PedidosDestinos object = new PedidosDestinos();
        object.setPedidos(pedidos);
        List<PedidosDestinos> list = dao.getRQLList(object);
        return list;
    }

    public List<PedidosProductos> getListPedidosProductos(Pedidos pedidos) throws Exception {
        PedidosDestinos filter = new PedidosDestinos();
        filter.setPedidos(pedidos);

        PedidosProductos object = new PedidosProductos();
        object.setPedidosDestinos(filter);

        List<PedidosProductos> list = dao.getRQLList(object);
        return list;
    }

}
