package com.example.proiectsabloane2.books;

import com.example.proiectsabloane2.persistence.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAll() {
        return booksRepository.findAll();
    }

    public Book getById(Integer id) {
        return booksRepository.findById(id).orElse(null);
    }

    public Book create(Book book) {
        return booksRepository.save(book);
    }

    public Book update(Integer id, Book updated) {
        Book existing = booksRepository.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }

        existing.setTitle(updated.getTitle());
        existing.setAuthors(updated.getAuthors());
        return booksRepository.save(existing);
    }

    public void delete(Integer id) {
        booksRepository.deleteById(id);
    }
}
