package com.barclays.library.controller;

import com.barclays.library.Book;
import com.barclays.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService booksevice;

    @PostMapping("book")
    public void addBook(@RequestBody Book book,@RequestParam String name) {


        booksevice.addBook(book);

    }

    @GetMapping("book")
    public Object allBooks(@RequestParam String name) {

        if (name!=null) {
            try {
                Book b = booksevice.findByName(name);
                return b;
            }
            catch (Exception e) {

            }
        }
        return booksevice.getBooks();
    }


}
