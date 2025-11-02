package com.champsoft.milestonelibraryapplication.datalayer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long BookID;

    @Column(name="book")
    private String bookTitle;
    private String authorName;
    private int releaseYear;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_authorid")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Author author;


    public Book(String bookTitle, String Author, int releaseYear) {
        this.bookTitle = bookTitle;
        this.authorName = Author;
        this.releaseYear = releaseYear;

        
    }

    public void setAuthor(String bookAuthor) {

    }
}
