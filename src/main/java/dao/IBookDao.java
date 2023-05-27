package dao;

import entities.Book;

import java.util.List;

public interface IBookDao {
    void saveOrUpdate(Book book);
    void delete(long code);
    Book findById(long code);
    List<Book> findAll();
}
