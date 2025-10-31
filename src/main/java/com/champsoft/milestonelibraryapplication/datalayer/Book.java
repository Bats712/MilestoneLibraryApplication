package com.champsoft.milestonelibraryapplication.datalayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookTitle;
    private String Author;
    private int releaseYear;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fk_authorid")
    private Author author;

    public Book(String bookTitle, String Author, int releaseYear, Author author) {
        this.bookTitle = bookTitle;
        this.Author = Author;
        this.releaseYear = releaseYear;
        this.author = author;
        
    }
}
