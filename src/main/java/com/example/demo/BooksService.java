package com.example.demo;

import java.util.List;

public class BooksService {

    private final BookRepo bookRepo;

    public BooksService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public List<Books> getBooks (){
        return bookRepo.getBooksList();
    }


}
