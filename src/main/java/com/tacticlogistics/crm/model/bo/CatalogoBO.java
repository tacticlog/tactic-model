package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateRestrictionEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.Ciudades;
import com.tacticlogistics.crm.model.entities.Clientes;
import com.tacticlogistics.crm.model.entities.Departamentos;
import com.tacticlogistics.crm.model.entities.Direcciones;
import com.tacticlogistics.crm.model.entities.EstadosPedidos;
import com.tacticlogistics.crm.model.entities.EstadosSolicitud;
import com.tacticlogistics.crm.model.entities.Paises;
import com.tacticlogistics.crm.model.entities.Pedidos;
import com.tacticlogistics.crm.model.entities.PrioridadesPedidos;
import com.tacticlogistics.crm.model.entities.Solicitudes;
import com.tacticlogistics.crm.model.entities.Terceros;
import com.tacticlogistics.crm.model.entities.TiposFormaPago;
import com.tacticlogistics.crm.model.entities.TiposIdentificacion;
import com.tacticlogistics.crm.model.entities.TiposPedido;
import com.tacticlogistics.crm.model.entities.TiposSolicitud;
import com.tacticlogistics.crm.model.entities.TiposUsoDireccion;
import com.tacticlogistics.crm.model.entities.Zonas;
import com.tacticlogistics.crm.model.entities.app.Menus;
import com.tacticlogistics.crm.model.entities.app.Roles;
import com.tacticlogistics.crm.model.entities.app.RolesMenus;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateOrder;
import com.tacticlogistics.crm.model.hibernate.criteria.HibernateRestriction;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class CatalogoBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<Ciudades> getListCiudades() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Ciudades object = new Ciudades();
        object.setActivo(Boolean.TRUE);

        List<Ciudades> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public Ciudades getObjectCiudadesPorCodigo(String codigo) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        Ciudades object = new Ciudades();
        object.setActivo(Boolean.TRUE);
        object.setCodigo(codigo);

        List<Ciudades> list = dao.getRQLList(object, conditionOrderList);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public List<TiposFormaPago> getListTiposFormaPago() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        TiposFormaPago object = new TiposFormaPago();
        object.setActivo(Boolean.TRUE);

        List<TiposFormaPago> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public List<TiposPedido> getListTiposPedido() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        TiposPedido object = new TiposPedido();
        object.setActivo(Boolean.TRUE);

        List<TiposPedido> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public List<PrioridadesPedidos> getListPrioridadesPedidos() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        PrioridadesPedidos object = new PrioridadesPedidos();
        object.setActivo(Boolean.TRUE);

        List<PrioridadesPedidos> list = dao.getRQLList(object, conditionOrderList);
        return list;
    }

    public List<EstadosPedidos> getListEstadosPedidos() throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        EstadosPedidos estadosPedidos = new EstadosPedidos();
        estadosPedidos.setActivo(Boolean.TRUE);

        List<EstadosPedidos> list = dao.getRQLList(estadosPedidos, conditionOrderList);
        return list;
    }

    public EstadosPedidos getEstadosPedidos(EstadosPedidos estadosPedidos) throws Exception {
        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("nombre", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        List<EstadosPedidos> list = dao.getRQLList(estadosPedidos, conditionOrderList);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public EstadosPedidos getEstadosPedidosMayor(Integer ordinal) throws Exception {
        List<HibernateRestriction> conditionCriteriaList = new LinkedList<>();
        HibernateRestriction hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        hibernateRestriction.setExpression(HibernateRestrictionEnum.GREATER_THAN);
        hibernateRestriction.setField("ordinal");
        hibernateRestriction.setValue(ordinal);
        conditionCriteriaList.add(hibernateRestriction);

        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("ordinal", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        List<EstadosPedidos> list = dao.getRQLList(new EstadosPedidos(), conditionCriteriaList, conditionOrderList);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public EstadosPedidos getEstadosPedidosMenor(Integer ordinal) throws Exception {
        List<HibernateRestriction> conditionCriteriaList = new LinkedList<>();
        HibernateRestriction hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        hibernateRestriction.setExpression(HibernateRestrictionEnum.LESS_THAN);
        hibernateRestriction.setField("ordinal");
        hibernateRestriction.setValue(ordinal);
        conditionCriteriaList.add(hibernateRestriction);

        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("ordinal", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        List<EstadosPedidos> list = dao.getRQLList(new EstadosPedidos(), conditionCriteriaList, conditionOrderList);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public List<Menus> getListMenus() throws Exception {
        List<HibernateRestriction> conditionCriteriaList = new LinkedList<>();

        List<HibernateOrder> conditionOrderList = new LinkedList<>();
        HibernateOrder hibernateOrder = new HibernateOrder("ordinal", HibernateOrderEnum.ASC);
        conditionOrderList.add(hibernateOrder);

        List<Menus> list = dao.getRQLList(new Menus(), conditionCriteriaList, conditionOrderList);
        return list;
    }

    public List<TiposIdentificacion> getListTiposIdentificacionActivo() throws Exception {
        return dao.getHQLList("FROM TiposIdentificacion a WHERE a.activo is true");
    }

    public List<TiposUsoDireccion> getListTiposUsoDireccionActivo() throws Exception {
        return dao.getHQLList("FROM TiposUsoDireccion a WHERE a.activo is true");
    }

    public List<EstadosSolicitud> getListEstadosSolicitudActivo() throws Exception {
        return dao.getHQLList("FROM EstadosSolicitud a WHERE a.activo is true");
    }

    public List<TiposSolicitud> getListTiposSolicitudActivo() throws Exception {
        return dao.getHQLList("FROM TiposSolicitud a WHERE a.activo is true");
    }

    public List<Paises> getListPaisesActivo() throws Exception {
        return dao.getHQLList("FROM Paises a WHERE a.activo is true");
    }

    public List<Departamentos> getListDepartamentosActivoPorPais(Integer paisId) throws Exception {
        return dao.getHQLList("FROM Departamentos a WHERE a.activo is true AND a.paises.id = " + paisId);
    }

    public List<Ciudades> getListCiudadesActivoPorDepartamentos(Integer departamentoId) throws Exception {
        return dao.getHQLList("FROM Ciudades a WHERE a.activo is true AND a.departamentos.id = " + departamentoId);
    }

    public List<Zonas> getListZonasActivo() throws Exception {
        return dao.getHQLList("FROM Zonas a WHERE a.activo is true");
    }

    public List<TiposFormaPago> getTiposFormaPago() throws Exception {
        return dao.getHQLList("FROM TiposFormaPago a WHERE a.activo is true");
    }

    public List<PrioridadesPedidos> getPrioridadesOrdenCompra() throws Exception {
        return dao.getHQLList("FROM PrioridadesPedidos a WHERE a.activo is true ORDER BY ordinal");
    }

    public List<Clientes> getListClientes() throws Exception {
        return dao.getHQLList("FROM Clientes");
    }

    public List<Clientes> getListClientesPorCriterios(String parametro) throws Exception {
        String criterios = "UPPER(a.terceros.numeroIdentificacion) like '%" + parametro.toUpperCase()
                + "%' OR UPPER(a.terceros.razonSocial) like '%" + parametro.toUpperCase()
                + "%' OR UPPER(a.terceros.nombreAlterno) like '%" + parametro.toUpperCase() + "%'";
        return dao.getHQLList("FROM Clientes a WHERE " + criterios);
    }

    public List<Terceros> getListClientesTerceroPorCriterios(String parametro) throws Exception {
        String criterios = "a.tiposClienteTercero.codigo = 'CF' AND (UPPER(a.terceros.numeroIdentificacion) like '%"
                + parametro.toUpperCase() + "%' OR UPPER(a.terceros.razonSocial) like '%" + parametro.toUpperCase()
                + "%' OR UPPER(a.terceros.nombreAlterno) like '%" + parametro.toUpperCase() + "%')";
        return dao.getHQLList("FROM Terceros a WHERE " + criterios);
    }

    public List<Direcciones> getListDireccionesPorClientesTercero(Integer idClientesTercero) throws Exception {
        return dao.getHQLList("SELECT o.direcciones FROM ClientesTerceroDireccion o WHERE o.clientesTercero.id = "
                + idClientesTercero);
    }

    public void save(Object entity) throws RuntimeException, Exception {
        dao.saveOrUpdate(entity);
    }

    public List<Pedidos> getListOrdenCompra(Integer estadosOrdenCompraId, String fechaInicial,
            String fechaFinal) throws Exception {
        String criterios = "a.fechaSolicitud BETWEEN '" + fechaInicial + "' AND '" + fechaFinal + "'";
        if (estadosOrdenCompraId > 0) {
            criterios += " AND a.estadosOrdenCompra.id = " + estadosOrdenCompraId;
        }
        return dao.getHQLList("FROM Pedidos a WHERE " + criterios + " ORDER BY a.fechaSolicitud");
    }

    public List<Solicitudes> getListSolicitudes(String codMuncipio, Integer estado, Integer tipoSolicitud) throws Exception {
        return dao.getHQLList("FROM Solicitudes a WHERE a.direccion IS NOT NULL AND a.estadosSolicitudes.id = " + estado
                + " AND a.tiposSolicitud.id = " + tipoSolicitud + " AND a.codigoMunicipio = '" + codMuncipio + "' ORDER BY direccion");
    }

    public List<Solicitudes> getListSolicitudesPorDepartamento(String codDepartamento, Integer estado, Integer tipoSolicitud) throws Exception {
        return dao.getHQLList("FROM Solicitudes a WHERE a.direccion IS NOT NULL AND a.estadosSolicitudes.id = " + estado
                + " AND a.tiposSolicitud.id = " + tipoSolicitud + " AND substring(a.codigoMunicipio,1,2) = '" + codDepartamento + "' ORDER BY direccion");
    }

}
