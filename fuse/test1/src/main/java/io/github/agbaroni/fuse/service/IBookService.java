package io.github.agbaroni.fuse.service;

import io.github.agbaroni.fuse.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
}