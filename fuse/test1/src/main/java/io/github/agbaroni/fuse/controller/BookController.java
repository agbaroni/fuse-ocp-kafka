package io.github.agbaroni.fuse.controller;

import io.github.agbaroni.fuse.model.Book;
import io.github.agbaroni.fuse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/showBooks")
    public String findBooks(Model model) {

        var books = (List<Book>) bookService.findAll();

        model.addAttribute("books", books);

        StringBuilder builder = new StringBuilder();

        books.forEach(book -> {
            builder.append(book.toString());
            builder.append(System.lineSeparator());
        });

        return builder.toString();
    }


}
