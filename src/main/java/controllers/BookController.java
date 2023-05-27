package controllers;

import entities.Book;
import services.IBookService;
import services.ImpBookService;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.transaction.Transactional;

/**
 *
 * @author ADMIN
 */
@ManagedBean
@RequestScoped
public class BookController {

    public Book book = new Book();
    public List<Book> books = new ArrayList<>();
    private IBookService service = new ImpBookService();

    public List<Book> getBooks() {
        return service.findAll();
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBook() {
        
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public String saveOrUpdate(){
        this.service.saveOrUpdate(book);
        return "home";
    }

    public String delete(long code){
        this.service.delete(code);
        return "home";
    }

       public String update(long code){
        this.book =  this.service.findById(code);
        return "form";
    }
    
    
}
