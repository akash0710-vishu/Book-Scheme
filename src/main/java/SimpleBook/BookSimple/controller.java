package SimpleBook.BookSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class controller {
    @Autowired
    BookRepository bookstore;
    @GetMapping("/books")
    public Iterable<Book> getAllBooks(){
        return bookstore.findAll();
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return bookstore.save(book);
    }
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id){
        bookstore.deleteById(id);
        return "DELETE BOOK";
    }
    @PutMapping("/books/{id}")
    public Book updateBOOK(@PathVariable int id,@RequestBody Book book){
        bookstore.findById(id).get();
        return bookstore.save(book);
    }
}
