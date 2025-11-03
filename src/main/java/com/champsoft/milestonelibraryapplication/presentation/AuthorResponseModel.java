package com.champsoft.milestonelibraryapplication.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorResponseModel {
    private Long authorId;
    private String firstName;
    private String lastName;
}