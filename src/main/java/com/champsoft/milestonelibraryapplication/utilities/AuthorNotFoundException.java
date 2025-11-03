package com.champsoft.milestonelibraryapplication.utilities;

public class AuthorNotFoundException extends RuntimeException {
    public AuthorNotFoundException(String message) {
        super(message);
    }
}
