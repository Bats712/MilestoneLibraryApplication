package com.champsoft.milestonelibraryapplication.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookRequestModel {
    private Long BookID;
    private String BookTitle;
    private String BookAuthor;
    private String BookISBN;
}
