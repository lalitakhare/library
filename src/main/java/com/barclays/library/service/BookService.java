package com.barclays.library.service;

import com.barclays.library.Book;
import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookService {

    public List<Book> getBooks() {
        return books;
    }

    private List<Book> books = new ArrayList<>();
    
    private Map<Long,Book> map = new HashMap<>();
    public BookService() {
        
        
    }
    
    public void addBook(Book book) {
        
        books.add(book);
    }
    
    public Book findByName(String name) throws Exception{

        for (Book book:
             books) {
            if(name.equals(book.getName())) {
                return book;
            }

            throw new Exception("Book Not Found");
        }

        return null;
    }


}
