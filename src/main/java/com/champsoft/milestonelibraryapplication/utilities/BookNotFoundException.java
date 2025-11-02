package com.champsoft.milestonelibraryapplication.utilities;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
