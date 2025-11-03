package com.champsoft.milestonelibraryapplication.presentation;

import com.champsoft.milestonelibraryapplication.business.AuthorService;
import com.champsoft.milestonelibraryapplication.business.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookResponseModel>> getAllBooks() {
        List<BookResponseModel> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseModel> getBookById(@PathVariable Long id) {
        BookResponseModel book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<BookResponseModel> addBook(@Validated @RequestBody BookRequestModel bookRequestModel) {
        BookResponseModel createdBook = bookService.addBook(bookRequestModel);
        URI location = URI.create("/api/books/" + createdBook.getBookID());
        return ResponseEntity.created(location).body(createdBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponseModel> updateBook(
            @PathVariable int id,
            @Validated @RequestBody BookRequestModel bookRequestModel) {
        BookResponseModel updatedBook = bookService.updateBook(id, bookRequestModel);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }

}