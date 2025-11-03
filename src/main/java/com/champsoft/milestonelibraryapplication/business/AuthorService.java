package com.champsoft.milestonelibraryapplication.business;

import com.champsoft.milestonelibraryapplication.datalayer.Author;
import com.champsoft.milestonelibraryapplication.datalayer.AuthorRepository;
import com.champsoft.milestonelibraryapplication.datalayer.Book;
import com.champsoft.milestonelibraryapplication.datalayer.BookRepository;
import com.champsoft.milestonelibraryapplication.mapper.AuthorMapper;
import com.champsoft.milestonelibraryapplication.presentation.AuthorRequestModel;
import com.champsoft.milestonelibraryapplication.presentation.AuthorResponseModel;
import com.champsoft.milestonelibraryapplication.utilities.AuthorNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AuthorMapper authorMapper;

    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.authorMapper = authorMapper;
    }

    public List<AuthorResponseModel> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(authorMapper::toResponse)
                .collect(Collectors.toList());
    }

    public AuthorResponseModel getAuthorById(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found with id: " + id));
        return authorMapper.toResponse(author);
    }

    @Transactional
    public AuthorResponseModel addAuthor(AuthorRequestModel authorRequestModel) {
        Author author = authorMapper.toEntity(authorRequestModel);
        Author savedAuthor = authorRepository.save(author);
        return authorMapper.toResponse(savedAuthor);
    }

    @Transactional
    public AuthorResponseModel updateAuthor(Long id, AuthorRequestModel authorRequestModel) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found with id: " + id));

        author.setFirstName(authorRequestModel.getFirstName());
        author.setLastName(authorRequestModel.getLastName());

        Author updatedAuthor = authorRepository.save(author);
        return authorMapper.toResponse(updatedAuthor);
    }

    @Transactional
    public void deleteAuthor(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new AuthorNotFoundException("Author not found with id: " + id));
        authorRepository.delete(author);
    }
}
