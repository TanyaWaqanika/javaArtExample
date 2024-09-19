package com.qa;

public class plagiarisedBook extends Exception {

//    Custom exception created for new books that have been plagiarised
    public plagiarisedBook(String message) {
        super(message);
    }
}
