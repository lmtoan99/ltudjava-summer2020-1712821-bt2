package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.TkbSV;
import pojo.UserGiaoVu;
import until.HibernateUtil;

import java.util.List;

public class TkbSVDAO {
    public static List<TkbSV> layDanhSachTkbSV(){
        List<TkbSV> tkb = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select tkb from TkbSV tkb";
            Query query = session.createQuery(hql);
            System.out.println(query.getQueryString());
            tkb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tkb;
    }
    
    public static void luuTkbSv(TkbSV tkb){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(tkb);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void capNhapDiem(TkbSV tkb){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(tkb);
        session.getTransaction().commit();
        session.close();
    }
    
    public static List<TkbSV> layDanhSachTkbSVTheoLop(String malop,String mamon){
        List<TkbSV> tkb = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select tkb from TkbSV tkb where MaLop=:malop and MaMon=:mamon";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            query.setParameter("mamon", mamon);
            System.out.println(query.getQueryString());
            tkb = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tkb;
    }
}
