package SimpleBook.BookSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookReviewController {
    @Autowired
    BookReviewRepository repository;



    @GetMapping("/books")
    public Iterable<bookentity> getAllBooks(){
        return repository.findAll();
    }



    @PostMapping("/books")
    public bookentity createReview(@RequestBody bookentity book){
        return repository.save(book);
    }



    @GetMapping("/books/{id}")
    public Optional<bookentity> getAllBooksId(@PathVariable int id){
        return repository.findById(id);
    }



    @PostMapping("/books/{id}")
    public bookentity createReviewId(@RequestBody bookentity book, @PathVariable int id){
        repository.findById(id).get();
        return repository.save(book);
    }

}
