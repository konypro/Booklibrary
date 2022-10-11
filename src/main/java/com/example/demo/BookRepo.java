package com.example.demo;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookRepo {
    private final List<Book> booksList = new ArrayList<>();
    Book book = new Book("Book1", "Smith", "Egal", "HardCover", "42");

    public BookRepo (){
        booksList.add(book);
    }

    public List<Book> getBooksList() {

        return booksList;
    }

    public Book getBookId (String id){
        for (int i = 0; i<booksList.size();i++){
            if (booksList.get(i).isbn().equals(id)){
                return booksList.get(i);
            }
        } throw new RuntimeException();
    }



}
