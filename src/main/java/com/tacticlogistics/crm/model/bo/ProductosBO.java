/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateRestrictionEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.Clientes;
import com.tacticlogistics.crm.model.entities.Productos;
import com.tacticlogistics.crm.model.entities.ProductosUoM;
import com.tacticlogistics.crm.model.entities.TiposFormaPago;
import com.tacticlogistics.crm.model.entities.UoM;
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
public class ProductosBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<ProductosUoM> getListProductosUoMPorClientes(Integer idCliente, String parametro) throws Exception {
        String criterios = "a.unidadDespachoPredeterminada is true AND (UPPER(a.productos.codigo) like '%"
                + parametro.toUpperCase() + "%' OR UPPER(a.productos.nombreLargo) like '%"
                + parametro.toUpperCase() + "%' OR UPPER(a.productos.nombreCorto) like '%"
                + parametro.toUpperCase() + "%') AND a.productos.clientes.id = " + idCliente;
        return dao.getHQLList("FROM ProductosUoM a WHERE " + criterios);
    }

    public List<Productos> getListProductosPorNombre(Integer idClientes, String nombre) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        List<HibernateRestriction> hibernateRestrictionList = new LinkedList<>();
        HibernateRestriction hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        hibernateRestriction.setExpression(HibernateRestrictionEnum.LIKE_ANYWHERE);
        hibernateRestriction.setField("nombre");
        hibernateRestriction.setValue(nombre);
        hibernateRestrictionList.add(hibernateRestriction);

        Clientes filter = new Clientes();
        filter.setId(idClientes);

        Productos object = new Productos();
        object.setClientes(filter);
        object.setActivo(Boolean.TRUE);

        List<Productos> list = dao.getRQLList(object, hibernateRestrictionList, conditionOrderList);
        return list;
    }

    public List<Productos> getListProductosPorCliente(Integer idClientes) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombreCorto", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Clientes filter = new Clientes();
        filter.setId(idClientes);

        Productos object = new Productos();
        object.setClientes(filter);
        object.setActivo(Boolean.TRUE);

        List<Productos> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public List<UoM> getListUoMPorProductos(Integer idProductos) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nivel", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Productos filter = new Productos();
        filter.setId(idProductos);

        ProductosUoM object = new ProductosUoM();
        object.setProductos(filter);
        object.setActivo(Boolean.TRUE);

        List<UoM> result = new LinkedList<>();
        List<ProductosUoM> list = dao.getRQLList(object, conditionOrderList);
        list.stream().forEach((row) -> {
            result.add(row.getUoM());
        });
        return result;
    }

}
