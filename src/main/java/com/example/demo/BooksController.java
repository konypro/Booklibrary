package com.example.demo;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksService booksService;
    @GetMapping
    public List<Book> getBooks (){

        return booksService.getBooks();
    }


}
