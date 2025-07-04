package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook() {
        System.out.println("BookService: Adding a book...");
        bookRepository.save();
    }
}
