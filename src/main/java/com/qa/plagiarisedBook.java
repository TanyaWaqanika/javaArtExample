package com.qa;

//subclass plagiarisedBook inherits from Exception superclass
public class plagiarisedBook extends Exception {

//    Custom exception created for new books that have been plagiarised using Override/Super constructor
    public plagiarisedBook(String message) {
        super(message);
    }
}

