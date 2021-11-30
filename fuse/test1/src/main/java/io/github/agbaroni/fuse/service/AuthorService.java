package io.github.agbaroni.fuse.service;

import io.github.agbaroni.fuse.model.Author;
import io.github.agbaroni.fuse.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService {

    @Autowired
    private AuthorRepository repository;

    @Override
    public List<Author> findAll() {
        var authors = (List<Author>) repository.findAll();
        return authors;
    }

    @Override
    public Long insertAuthor(Author author) {
        Author saved = repository.save(author);
        return saved.getId();
    }

    @Override
    public Optional<Author> getAuthorById(Long id) {
        return repository.findById(id);
    }


}