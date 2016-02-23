/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacticlogistics.crm.model.bo;

import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateOrderEnum;
import com.tacticlogistics.crm.model.criteria.hibernate.enums.HibernateRestrictionEnum;
import com.tacticlogistics.crm.model.dao.ICustomHibernateDao;
import com.tacticlogistics.crm.model.entities.app.Menus;
import com.tacticlogistics.crm.model.entities.app.Roles;
import com.tacticlogistics.crm.model.entities.app.RolesMenus;
import com.tacticlogistics.crm.model.entities.app.Usuarios;
import com.tacticlogistics.crm.model.entities.app.UsuariosRoles;
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
public class SeguridadBO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ICustomHibernateDao dao;

    public List<RolesMenus> getListMenusPorUsuarios(List<UsuariosRoles> listUsuariosRoles) throws Exception {
        Roles[] roles = new Roles[listUsuariosRoles.size()];
        for (int index = 0; index < listUsuariosRoles.size(); index++) {
            roles[index] = listUsuariosRoles.get(index).getRoles();
        }

        List<HibernateOrder> conditionOrderList = new LinkedList<>();

        List<HibernateRestriction> restrictionOrderList = new LinkedList<>();
        HibernateRestriction hibernateRestriction = new HibernateRestriction();
        hibernateRestriction.setExpression(HibernateRestrictionEnum.IN);
        hibernateRestriction.setLogicalOperator(HibernateRestriction.AND);
        hibernateRestriction.setField("roles");
        hibernateRestriction.setValue(roles);
        restrictionOrderList.add(hibernateRestriction);

        RolesMenus object = new RolesMenus();
        List<RolesMenus> list = dao.getRQLList(object, restrictionOrderList, conditionOrderList);
        return list;
    }

    public Usuarios getUsuariosPorEmail(String email) throws Exception {
        Usuarios object = new Usuarios();
        object.setEmail(email);
        Usuarios result = dao.getRQLObject(object);
        return result;
    }

    public List<UsuariosRoles> getListUsuariosRolesPorUsuarios(Usuarios usuarios) throws Exception {
        UsuariosRoles object = new UsuariosRoles();
        object.setUsuarios(usuarios);
        List<UsuariosRoles> result = dao.getRQLList(object);
        return result;
    }

    public void save(Object entity) throws RuntimeException, Exception {
        dao.saveOrUpdate(entity);
    }

    public void execute(String hql) throws Exception {
        dao.execute(hql);
    }

    public List<Roles> getListRoles() throws Exception {
        Roles object = new Roles();
        List<Roles> result = dao.getRQLList(object);
        return result;
    }

    public List<Roles> getListRolesActivos() throws Exception {
        Roles object = new Roles();
        object.setActivo(Boolean.TRUE);
        List<Roles> result = dao.getRQLList(object);
        return result;
    }

    public List<Usuarios> getListUsuarios() throws Exception {
        Usuarios object = new Usuarios();
        List<Usuarios> result = dao.getRQLList(object);
        return result;
    }

    public List<Menus> getListMenusActivos() throws Exception {
        Menus object = new Menus();
        List<Menus> result = dao.getRQLList(object);
        return result;
    }

    public List<Menus> getListMenusPorRoles(Roles roles) throws Exception {
        List<Menus> result = dao.getHQLList("SELECT b from RolesMenus o JOIN o.menus b WHERE o.roles.id = "
                + roles.getId() + " AND b IS NOT NULL ORDER BY o.menus.nombre");
        return result;
    }

    public List<Roles> getListRolesPorUsuarios(Usuarios usuarios) throws Exception {
        List<Roles> result = dao.getHQLList("SELECT o.roles from UsuariosRoles o WHERE o.usuarios.id = "
                + usuarios.getId() + " ORDER BY o.roles.rol");
        return result;
    }

}
