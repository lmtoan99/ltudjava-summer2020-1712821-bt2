package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.MonHoc;
import pojo.TkbLop;
import until.HibernateUtil;

import java.util.List;

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
}
