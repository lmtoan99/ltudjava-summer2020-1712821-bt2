/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.DotPhucKhao;
import until.HibernateUtil;

/**
 *
 * @author toanm
 */
public class DotPhucKhaoDAO {
    public static DotPhucKhao layDotPhucKhao(){
        List<DotPhucKhao> phuckhao = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select dotphuckhao from DotPhucKhao dotphuckhao";
            Query query = session.createQuery(hql);
            phuckhao = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (phuckhao.size() == 0){
            return null;
        }
        return phuckhao.get(0);
    }
    
    public static void luuDotPhucKhao(DotPhucKhao dot){
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "delete from DotPhucKhao";
            Query query = session.createQuery(hql);
            query.executeUpdate();
            session.beginTransaction();
            session.save(dot);
            session.getTransaction().commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
    }
}
