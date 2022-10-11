package com.example.demo;

import java.util.List;

public class BookRepo {
    private final List<Books> booksList;

    public BookRepo(List<Books> booksList) {
        this.booksList = booksList;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public Books getBookId (String id){
        for (int i = 0; i<booksList.size();i++){
            if (booksList.get(i).isbn().equals(id)){
                return booksList.get(i);
            }
        } throw new RuntimeException();
    }



}
