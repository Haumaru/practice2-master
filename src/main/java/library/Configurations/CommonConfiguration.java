package library.Configurations;

import library.Entity.Book;
import library.Services.BookServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CommonConfiguration {

    @Inject
    BookServices bookService;

    @Bean
    void fillDatabase() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("fantasy", "agata", 1300));
        bookList.add(new Book("fantasy", "agata", 1300));
        bookList.add(new Book("fantasy", "agata", 1300));
        bookService.bookList = bookList;
    }
}
