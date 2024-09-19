package com.qa;

//subclass plagiarisedBook inherits from Exception superclass
public class plagiarisedBookException extends Exception {

//    Custom exception created for new books that have been plagiarised using Override/Super constructor
    public plagiarisedBookException(String message) {
        super(message);
    }
}

