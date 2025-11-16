package com.example.proiectsabloane2.books;

import com.example.proiectsabloane2.observer.AllBooksSubject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BooksService booksService, AllBooksSubject allBooksSubject) {
        this.booksService = booksService;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getAll() {
        return booksService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return booksService.getById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        Book saved = booksService.create(book);
        allBooksSubject.add(saved);
        return saved;
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Integer id, @RequestBody Book book) {
        return booksService.update(id, book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        booksService.delete(id);
    }
}
