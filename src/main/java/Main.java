import DAO.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import pojo.*;
import until.HibernateUtil;
import java.util.List;
import view.LoginFrame;


public class Main {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public static void main(String[] args) {
        (new LoginFrame()).main(args);
    }
}
