/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import dao.IBookDao;
import dao.ImpBookDao;
import entities.Book;

import java.util.List;


/**
 * @author ADMIN
 */
public class ImpBookService implements IBookService {
    private IBookDao dao = new ImpBookDao();

    @Override
    public void delete(long code) {
        dao.delete(code);

    }

    @Override
    public List<Book> findAll() {
        return dao.findAll();
    }

    @Override
    public void saveOrUpdate(Book book) {
        dao.saveOrUpdate(book);
    }

    @Override
    public List<Book> findBookByAuteur(String auteur) {
        return null;
    }


//    @Override
//    public List<Book> findBookByAuteur(String auteur) {
//        return dao.findBookByAuteur(auteur);
//    }

    @Override
    public Book findById(long code) {
        return dao.findById(code);
    }

}
