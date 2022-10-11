package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksService {

    private final BookRepo bookRepo;

    public BooksService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public List<Book> getBooks (){
        return bookRepo.getBooksList();
    }


}
