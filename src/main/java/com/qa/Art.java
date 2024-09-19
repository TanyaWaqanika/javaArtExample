package com.qa;

// created Art class
// Art is ABSTRACTED
// therefore, obj CANNOT be instantiated directly from Art
// access methods inside an ABSTRACTED class can only be accessed via SUBCLASS inheritance
abstract class Art {

//   CONSTRUCTORS

    public Art() {
    }

    //    Constructors with params
//    Hasn't been used in Main
    public Art(String creator, String title, int yearMade, String countryMade) {
        this.creator = creator;
        this.title = title;
        this.yearMade = yearMade;
        this.countryMade = countryMade;
    }

    //   Book param specific constructor
    public Art(String author, String title, String language, int yearMade) {
        this.author = author;
        this.title = title;
        this.language = language;
        this.yearMade = yearMade;
    }


//    GET/SET METHODS
// Set/Get methods to set and retrieve attribute data for each object instantiated from this class

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }




//  ABSTRACT METHOD
//  Must be inside abstract class and DOES NOT HAVE A BODY
//  body contents comes fom subclass
//  see Book.java ln 25, eBook.java ln 17 for method use
    public abstract void getSales();

//    ATTRIBUTES
    private String creator;
    private String title;
    private String language;
    private int yearMade;
    private String countryMade;
    private String author;
    private String genre;

}
