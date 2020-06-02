package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.UserGiaoVu;
import pojo.UserSV;
import until.HibernateUtil;

import java.util.List;

public class UserGiaoVuDAO {
    public static UserGiaoVu findUserByUsername(String username){
        List<UserGiaoVu> gv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select user from UserGiaoVu user WHERE Username=\'"+username+"\'";
            Query query = session.createQuery(hql);
            System.out.println(query.getQueryString());
            gv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return gv.get(0);
    }
}
