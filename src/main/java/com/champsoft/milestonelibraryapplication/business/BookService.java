package com.champsoft.milestonelibraryapplication.business;

import com.champsoft.milestonelibraryapplication.datalayer.AuthorRepository;
import com.champsoft.milestonelibraryapplication.datalayer.Book;
import com.champsoft.milestonelibraryapplication.datalayer.BookRepository;
import com.champsoft.milestonelibraryapplication.mapper.AuthorMapper;
import com.champsoft.milestonelibraryapplication.mapper.BookMapper;
import com.champsoft.milestonelibraryapplication.presentation.BookRequestModel;
import com.champsoft.milestonelibraryapplication.presentation.BookResponseModel;
import com.champsoft.milestonelibraryapplication.utilities.BookNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final BookMapper bookMapper;
    private final AuthorMapper authorMapper;


public BookService(BookRepository bookRepository, AuthorRepository authorRepository,
                   BookMapper bookMapper,  AuthorMapper authorMapper) {
    this.bookRepository = bookRepository;
    this.authorRepository = authorRepository;
    this.bookMapper = bookMapper;
    this.authorMapper = authorMapper;
}
public List<Book> getAllBooks() {
    List<Book> books = bookRepository.findAll();
    List<BookResponseModel> bookResponseModels = new ArrayList<>();
    for (Book book : books) {
        bookResponseModels.add(bookMapper.toResponse(book));
    }
    return bookResponseModels;
}

public BookResponseModel getBookById(Long id) {
    Optional<Book> book = bookRepository.findById(id);
    if (book.isPresent()) {
        return bookMapper.toResponse(book.get());
    }
    else{
        return null;
    }
}

public BookResponseModel addBook(BookRequestModel bookData) {
    Book book = bookMapper.fromRequestModelToEntity(bookData);
    return bookMapper.toResponse(bookRepository.save(book));
}
public BookResponseModel updateBook( int BookID, BookRequestModel bookData) {
    Book knownBook = bookRepository.findById((long) BookID)
            .orElseThrow(() -> new RuntimeException("Movie not found"));
    knownBook.setBookTitle(bookData.getBookTitle());
    knownBook.setAuthor(bookData.getBookAuthor());
    knownBook.setReleaseYear(bookData.getReleaseYear());
    Book updatedBook = bookRepository.save(knownBook);
    return bookMapper.toResponse(updatedBook);
}

public void deleteBookById(int BookID) throws BookNotFoundException {
    Book book = bookRepository.findById((long) BookID)
            .orElseThrow(() -> new BookNotFoundException("Book not found"));
    bookRepository.delete(book);
}

public List<BookResponseModel> getBooksByAuthor(String author) {
    Book book = bookRepository.findById(author).orElseThrow(() -> new RuntimeException("Books not found"));

    List<Book> books = bookRepository.findAll();
    List<BookResponseModel> bookResponseModels = new ArrayList<>();

    for (Book book1 : books) {
        if (book1.getAuthor().equals(author)) {
            bookResponseModels.add(bookMapper.toResponse(book1));

        }

    }
    return bookResponseModels;
}




}
