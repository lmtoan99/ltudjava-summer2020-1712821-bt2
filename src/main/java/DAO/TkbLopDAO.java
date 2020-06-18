package DAO;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.MonHoc;
import pojo.TkbLop;
import until.HibernateUtil;

import java.util.List;
import model.LopMon;

public class TkbLopDAO {
    public static List<TkbLop> layDanhSachTkbLop(){
        List<TkbLop> tkb = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select tkb from TkbLop tkb";
            Query query = session.createQuery(hql);
            tkb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tkb;
    }
    
    public static List<TkbLop> layDanhSachTkbLopTheoLop(String lop){
        List<TkbLop> tkb = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select tkb from TkbLop tkb where MaLop='" + lop + "'";
            Query query = session.createQuery(hql);
            tkb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tkb;
    }
    
    public static void luuTkbLop(TkbLop tkb){
        if (tonTaiTkbLop(tkb)){
            return;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(tkb);
        session.getTransaction().commit();
        session.close();
    }
    
    public static boolean tonTaiTkbLop(TkbLop tkb){
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select tkbLop from TkbLop tkbLop where MaMon='" 
                    + tkb.getMaMon() + "' and MaLop='"
                    + tkb.getMaLop() + "'";
            Query query = session.createQuery(hql);
            List monhocs = query.list();
            if (monhocs.isEmpty()){
                return false;
            }else{
                return true;
            }
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static List<TkbLop> layDanhSachMonHocLop(){
        List<TkbLop> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select distinct new TkbLop(tkb.MaLop,tkb.MaMon) from TkbLop tkb";
            Query query = session.createQuery(hql);
            ds = query.list();
            System.out.println(ds);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
}
