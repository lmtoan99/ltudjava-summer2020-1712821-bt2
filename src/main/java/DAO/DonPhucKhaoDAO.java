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
import pojo.DonPhucKhao;
import until.HibernateUtil;

/**
 *
 * @author toanm
 */
public class DonPhucKhaoDAO {
    public static List<DonPhucKhao> layDanhDonPhucKhao() {
        List<DonPhucKhao> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select donphuckhao from DonPhucKhao donphuckhao";;
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static void capNhatDonPhucKhao(DonPhucKhao don){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(don);
        session.getTransaction().commit();
        session.close();
    }
}
