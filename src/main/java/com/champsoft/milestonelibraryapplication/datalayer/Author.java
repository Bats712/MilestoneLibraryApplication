package com.champsoft.milestonelibraryapplication.datalayer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AuthorID;

    private String firstName,lastName, bookTitle;

    public Author(String firstName, String lastName, String bookTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
       
    }
}
