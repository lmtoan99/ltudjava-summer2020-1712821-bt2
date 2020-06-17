package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.MonHoc;
import pojo.UserSV;
import until.HibernateUtil;

import java.util.List;

public class MonHocDAO {
    public static List<MonHoc> layDanhSachMonHoc(){
        List<MonHoc> monHocs = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select monhoc from MonHoc monhoc";
            Query query = session.createQuery(hql);
            monHocs = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return monHocs;
    }
    
    public static void luuMonHoc(MonHoc mon){
        if (tonTaiMonHoc(mon)){
            return;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(mon);
        session.getTransaction().commit();
        session.close();
    }
    
    public static boolean tonTaiMonHoc(MonHoc mon){
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select monhoc from MonHoc monhoc where MaMon='" + mon.getMaMon() + "'";
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
    
    public static MonHoc layMonHoc(String MaMon){
        List<MonHoc> monHocs = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select monhoc from MonHoc monhoc where MaMon='" + MaMon + "'";
            Query query = session.createQuery(hql);
            monHocs = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (monHocs.size()==0){
            return null;
        }
        return monHocs.get(0);
    }
}
