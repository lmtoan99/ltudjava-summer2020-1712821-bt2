package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.UserSV;
import until.HibernateUtil;

import java.util.List;

public class UserSVDAO {
    public static UserSV findUserByMSSV(String mssv){
        List<UserSV> sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select user from UserSV user WHERE MSSV=:mssv";
            Query query = session.createQuery(hql);
            query.setParameter("mssv", mssv);
            sv = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        if (sv.isEmpty()){
            return null;
        }else{
            return sv.get(0);
        }
    }
    
    public static void luuUserSV(UserSV sv){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(sv);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void updateUserSV(UserSV sv){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(sv);
        session.getTransaction().commit();
        session.close();
    }
}
