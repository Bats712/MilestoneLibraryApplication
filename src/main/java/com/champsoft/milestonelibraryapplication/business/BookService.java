package com.champsoft.milestonelibraryapplication.business;

import com.champsoft.milestonelibraryapplication.datalayer.AuthorRepository;
import com.champsoft.milestonelibraryapplication.datalayer.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@Service
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
//    private AuthorService authorService;
//    private final BookMapper bookMapper;

public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {}




}
