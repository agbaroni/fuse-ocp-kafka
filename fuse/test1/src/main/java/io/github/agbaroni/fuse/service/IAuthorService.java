package io.github.agbaroni.fuse.service;

import io.github.agbaroni.fuse.model.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {
    List<Author> findAll();
    Long insertAuthor(Author author);
    Optional<Author> getAuthorById(Long id);
}