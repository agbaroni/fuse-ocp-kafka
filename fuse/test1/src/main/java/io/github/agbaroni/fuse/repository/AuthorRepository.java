package io.github.agbaroni.fuse.repository;

import io.github.agbaroni.fuse.model.Author;
import io.github.agbaroni.fuse.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
