package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Book;
import com.example.MappingPractice.Mapping.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepo bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(String id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) {
            existingBook.setBookTitle(updatedBook.getBookTitle());
            existingBook.setBookAuthor(updatedBook.getBookAuthor());

            return bookRepository.save(existingBook);
        }
        return null;
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}

