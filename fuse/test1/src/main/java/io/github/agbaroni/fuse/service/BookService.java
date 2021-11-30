package io.github.agbaroni.fuse.service;

import io.github.agbaroni.fuse.model.Book;
import io.github.agbaroni.fuse.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> findAll() {
        var books = (List<Book>) repository.findAll();
        return books;
    }
}