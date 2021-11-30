package io.github.agbaroni.fuse.controller;

import io.github.agbaroni.fuse.model.Book;
import io.github.agbaroni.fuse.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private IBookService service;

    @GetMapping("/showBooks")
    public String findBooks(Model model) {

        var books = (List<Book>) service.findAll();

        model.addAttribute("books", books);

        return "showBooks";
    }
}
