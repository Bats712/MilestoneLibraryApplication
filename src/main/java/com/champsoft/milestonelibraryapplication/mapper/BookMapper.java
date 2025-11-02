package com.champsoft.milestonelibraryapplication.mapper;
import com.champsoft.milestonelibraryapplication.datalayer.Book;
import com.champsoft.milestonelibraryapplication.presentation.BookRequestModel;
import com.champsoft.milestonelibraryapplication.presentation.BookResponseModel;
import org.springframework.stereotype.Component;


    @Component
    public class BookMapper {

        public BookResponseModel toResponse(Book book){
            return new BookResponseModel(
                    book.getId(),
                    book.getBookTitle(),
                    book.getAuthorName(),
                    book.getReleaseYear()
            );
        }

        public Book fromRequestModelToEntity(BookRequestModel bookRequestModel){
            Book book = new Book();
            book.setBookTitle(bookRequestModel.getBookTitle());
            book.setAuthorName(bookRequestModel.getBookAuthor());
            book.setReleaseYear(bookRequestModel.getReleaseYear());
            return book;
        }


    }


