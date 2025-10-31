package com.champsoft.milestonelibraryapplication.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class AuthorRequestModel {
    private Long AuthorID;
    private String firstName;
    private String lastName;
    private String bookTitle;
}
