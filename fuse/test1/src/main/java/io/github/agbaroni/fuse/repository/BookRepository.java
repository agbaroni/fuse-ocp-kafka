package io.github.agbaroni.fuse.repository;

import io.github.agbaroni.fuse.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
}
