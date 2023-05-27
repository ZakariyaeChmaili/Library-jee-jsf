import dao.IBookDao;
import dao.ImpBookDao;
import entities.Administration;
import entities.Book;
import services.IAdministrationService;
import services.IBookService;
import services.ImpAdministrationService;
import services.ImpBookService;

public class test {

    public static void main(String[] args) {
//        IBookService service = new ImpBookService();
           IAdministrationService service = new ImpAdministrationService();
//        dao.saveOrUpdate(new Book("asdf","asdf",5));
        System.out.println(service.check(new Administration("sdf","sdf")));
//        service.delete(373);
//        System.out.println(service.findAll());

    }
}
