package io.github.agbaroni.fuse.controller;

import io.github.agbaroni.fuse.model.Author;
import io.github.agbaroni.fuse.model.Book;
import io.github.agbaroni.fuse.service.IAuthorService;
import io.github.agbaroni.fuse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/authors")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @GetMapping("/showAuthors")
    public String findAuthors() {

        var authors = (List<Author>) authorService.findAll();

        StringBuilder builder = new StringBuilder();

        authors.forEach(author -> {
            builder.append(author.toString());
            builder.append(System.lineSeparator());
        });

        return builder.toString();
    }

    @GetMapping("/showAuthor/{id}")
    public String findAuthorById(@PathVariable Long id) {
        var author = authorService.getAuthorById(id).orElseThrow(
                () -> new RuntimeException("Missing Author with the given ID: " + id)
        );

        return author.toString();
    }


    @PostMapping("/insertAuthor")
    public String insertAuthor(@RequestBody Author author) {
        Long authorId = authorService.insertAuthor(author);

        return "Inserted Author with ID: " + authorId;
    }
}
