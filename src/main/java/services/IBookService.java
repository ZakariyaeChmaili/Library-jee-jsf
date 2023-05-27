/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Book;

import java.util.List;


/**
 *
 * @author ADMIN
 */
public interface IBookService {

    void delete(long code);

    List<Book> findAll();

    void saveOrUpdate(Book book);

    List<Book> findBookByAuteur(String auteur);

    Book findById(long code);

}
