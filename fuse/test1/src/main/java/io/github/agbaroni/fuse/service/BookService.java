package io.github.agbaroni.fuse.service;

import io.github.agbaroni.fuse.model.Book;
import io.github.agbaroni.fuse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService implements IBookService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> findAll() {
        var books = (List<Book>) repository.findAll();
        return books;
    }
}
