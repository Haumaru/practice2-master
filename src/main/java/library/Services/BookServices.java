package library.Services;

import library.Entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServices {

    public List<Book> bookList = new ArrayList<>();

    public void addBook(Book input){
        bookList.add(input);
    }
    public ResponseEntity findOneBook(int idToFind){
        for(Book b: bookList){
            if(b.getId() == idToFind){
                return new ResponseEntity<>(b, HttpStatus.OK);
            }
        } return ResponseEntity.status(200)
                .body("Book with id " +idToFind + "not found");
    }

    public ResponseEntity modifyBook(int idToUpdate, Book updatedBook){
        for(int i=0; i<bookList.size(); i++){
            Book b = bookList.get(i);
            if(b.getId() == idToUpdate){
                b.setAuthor(updatedBook.getAuthor());
                b.setName(updatedBook.getName());
                b.setPrice(updatedBook.getPrice());
                return new ResponseEntity<>("Book with id " +idToUpdate +" is modify", HttpStatus.OK);
            }
        }return ResponseEntity.ok("Book with id " +idToUpdate +" is not found");
    }

    public ResponseEntity deleteBook(int idToDelete){
        for(int i=0; i<bookList.size(); i++){
            Book b = bookList.get(i);
            if(b.getId() == idToDelete){
                bookList.remove(idToDelete);
                return new ResponseEntity<>("Book with id " +idToDelete +" is deleted", HttpStatus.OK);
            }
        } return ResponseEntity.status(200)
                .body("Book with id " +idToDelete + "not found");
    }
}
