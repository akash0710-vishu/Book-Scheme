package SimpleBook.BookSimple;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookReviewExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exception(){
        String message = "This is not right way";
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
