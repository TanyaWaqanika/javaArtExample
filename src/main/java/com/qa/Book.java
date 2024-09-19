package com.qa;

// Book class inherits from Art class
public class Book extends Art {

//  Book constructor with 0 params
    public Book(){}

//  (METHOD OVERRIDE EXAMPLE 1) super constructor to modify method inherited from parent class
//   super invokes method from parent (Art) class and allows child (Book) class to add pageNo param and method (ln 13)
    public Book(String author, String title, String language, int yearMade, int pageNo){
        super(author,title,language,yearMade);
        this.setPageNo(pageNo);
    }


//   GETTER/SETTER for pageNo attribute
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }



// Method to check if a book called Harry Potter has already been written
    public String writeBook(String title) throws plagiarisedBook {
        if (title.equals("Harry Potter")) {

//          Throws a custom plagiarisedBook exception if Harry Potter is used
            throw new plagiarisedBook("It's already been done");
        } else {
//          Prints message to user if newBook is successful
            return "Nice, you wrote a brand new book called " + title;
        }
    }


//    Abstract method w/ body
    public void getSales(){
        System.out.println("Buy more books!");
    }

//  (METHOD OVERRIDE EXAMPLE 2)
    @Override
    public String toString(){
        return "The book " + this.getTitle() + " was written by " + this.getAuthor() + " in " + this.getYearMade() + " and has " + this.getPageNo() + " pages.";
    }

//    attribute specific to Book class
    private int pageNo;
}
