package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.SinhVien;
import until.HibernateUtil;
import java.util.List;

public class SinhVienDAO {
    public static List<SinhVien> layDanhSachSinhVien() {
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv";;
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static void luuSinhVien(SinhVien sv){
       Session session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(sv);
       session.getTransaction().commit();
       session.close();
    }
    
    public static List<String> layDanhSachLop(){
        List<String> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select distinct sv.MaLop from SinhVien sv";;
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static List<SinhVien> layDanhSachSinhVienTheoLop(String Lop){
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv where MaLop='" + Lop + "'";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static SinhVien layThongTinSinhVien(String mssv){
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv where MSSV=:mssv";
            Query query = session.createQuery(hql);
            query.setParameter("mssv", mssv);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (ds.size()==0){
            return null;
        }
        return ds.get(0);
    }
}
