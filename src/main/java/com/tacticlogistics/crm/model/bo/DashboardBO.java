/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.Solicitudes;
import com.tacticlogistics.crm.model.util.Util;
import com.tacticlogistics.crm.model.entities.dashboard.Inventario;
import com.tacticlogistics.crm.model.entities.dashboard.Resultados;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author csarmiento
 */
@Service
public class DashboardBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<Resultados> getListResultado(Integer annio, Integer mes) throws Exception {
        return dao.getHQLList("FROM Resultados a WHERE a.annio = " + annio + " and a.mes = " + mes);
    }

    public List<Resultados> getListResultado(String kpi, Integer annio, Integer mes) throws Exception {
        String fechaInicial = "'" + Util.leftPad(String.valueOf(mes - 1), 2, '0') + "/01/" + (annio - 1) + "'";
        String fechaFinal = "'" + Util.leftPad(String.valueOf(mes), 2, '0') + "/01/" + annio + "'";
        String hql = "FROM Resultados a WHERE a.kpi = '" + kpi + "' and fecha BETWEEN " + fechaInicial + " AND "
                + fechaFinal;
        return dao.getHQLList(hql);
    }

    public Resultados getResultadoPorKPI(String kpi, Integer annio, Integer mes) throws Exception {
        List<Resultados> list = dao
                .getHQLList("FROM Resultados a WHERE a.kpi = '" + kpi + "' and a.annio = " + annio + " and a.mes = " + mes);
        if (list.isEmpty()) {
            return new Resultados();
        } else {
            return list.get(0);
        }
    }

    public List<Inventario> getListInventario(Integer annio, Integer mes) throws Exception {
        String hql = "SELECT a.ciudades, a.unitType, SUM(a.maximumCapacity) AS maximumCapacity, SUM(a.usedCapacity) AS usedCapacity "
                + "FROM Inventario a WHERE substring(a.fifoDate,1,4) = '" + annio
                + "' and substring(a.fifoDate,5,2) = '" + mes
                + "' GROUP BY a.ciudades, a.unitType ORDER BY a.ciudades, a.unitType";
        return dao.getHQLList(hql);
    }

    public List<Inventario> getListInventarioDetalle(Integer annio, Integer mes) throws Exception {
        return dao.getHQLList("FROM Inventario a WHERE substring(a.fifoDate,1,4) = '" + annio
                + "' and substring(a.fifoDate,5,2) = '" + mes + "' ORDER BY description, area, fifoDate");
    }

    public List<Solicitudes> getListSolicitudes(String codMuncipio, Integer estado) throws Exception {
        return dao.getHQLList("FROM Solicitudes a WHERE a.direccion IS NOT NULL AND a.estado = " + estado
                + " AND a.codigoMunicipio = '" + codMuncipio + "' ORDER BY direccion");
    }

}
