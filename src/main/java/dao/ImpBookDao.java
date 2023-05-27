package dao;

import entities.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ImpBookDao implements IBookDao{
    @Override
    public void saveOrUpdate(Book book) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.saveOrUpdate(book);
        ts.commit();
        session.close();

    }

    @Override
    public void delete(long code) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
    Transaction ts = session.beginTransaction();
    session.delete((Book) session.load(Book.class,code));
    ts.commit();
    session.close();
    }

    @Override
    public Book findById(long code) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        Book book = (Book) session.load(Book.class,code);
                System.out.println(book); //this one 

        ts.commit();
        session.close();
        return book;
    }

    @Override
    public List<Book> findAll() {
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();

        Transaction ts = session.beginTransaction();
        List<Book> books = session.createQuery("from Book").list();
        ts.commit();
//        session.close();
        return books;
    }
}
