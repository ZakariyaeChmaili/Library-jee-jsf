package dao;

import entities.Administration;
import entities.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ImpAdministrationDao implements IAdministrationDao {

    @Override
    public void save(Administration admin) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(admin);
        ts.commit();
        session.close();
    }

    @Override
    public Administration find(String login) {
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        Administration admin;
        try {
            admin = (Administration) session.load(Administration.class, login);
            System.out.println(admin);//apparently when you add sout after loading the class it fix the session error

        } catch (Exception e) {
            admin=null;
        }
//        System.out.println(admin);
        ts.commit();
        session.close();
        return admin;
    }

    @Override
    public boolean check(Administration admin) {

        Administration administration = this.find(admin.getLogin());
        if (administration != null) {
//            System.out.println(administration);
            return admin.getPassword().equals(administration.getPassword());
        }
        return false;
    }
}
