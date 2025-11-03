package com.champsoft.milestonelibraryapplication.mapper;

import com.champsoft.milestonelibraryapplication.datalayer.Author;
import com.champsoft.milestonelibraryapplication.datalayer.Book;
import com.champsoft.milestonelibraryapplication.presentation.AuthorRequestModel;
import com.champsoft.milestonelibraryapplication.presentation.AuthorResponseModel;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AuthorMapper {

    public AuthorResponseModel toResponse(Author author) {
        if (author == null) return null;

        return new AuthorResponseModel(
                author.getAuthorID(),
                author.getFirstName(),
                author.getLastName()
        );
    }

    public Author toEntity(AuthorRequestModel authorRequestModel) {
        if (authorRequestModel == null) return null;

        Author author = new Author();
        author.setFirstName(authorRequestModel.getFirstName());
        author.setLastName(authorRequestModel.getLastName());

        return author;
    }


}