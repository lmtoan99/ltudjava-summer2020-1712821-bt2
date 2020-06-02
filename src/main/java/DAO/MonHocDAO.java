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
}
