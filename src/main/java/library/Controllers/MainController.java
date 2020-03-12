package library.Controllers;

import library.Entity.Book;
import library.Services.BookServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {


    @Inject
    BookServices bookServices;


    @GetMapping(value = {"/", "/all"})
    ResponseEntity getAll(){
        return new ResponseEntity<>(bookServices.bookList, HttpStatus.OK);
    }

    @GetMapping("/get/{idToShow}")
    ResponseEntity getOneBook(@PathVariable int idToShow){
        return bookServices.findOneBook(idToShow);
    }

    @PostMapping("/modify/{id}")
    ResponseEntity updateBook(@RequestBody Book updatedBook, @PathVariable int id){
        return bookServices.modifyBook(id, updatedBook);
    }

    @PutMapping("/upload")
    ResponseEntity insertBook(@RequestBody Book insertedBook){
        bookServices.addBook(insertedBook);
        return new ResponseEntity<>("Book successfully uploaded", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idToDelete}")
    ResponseEntity deleteBook(@PathVariable int idToDelete){
        return bookServices.deleteBook(idToDelete);
    }
}
