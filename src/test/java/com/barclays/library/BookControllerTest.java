package com.barclays.library;

import com.barclays.library.controller.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private BookController bookController;

    public void addBook() {

        Book book = new Book(1L,"Roman Empire","ABC");

       
    }

}
