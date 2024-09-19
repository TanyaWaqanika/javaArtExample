package com.qa;

public class Main {
    public static void main(String[] args) {
        visual();
    }

    public static void visual(){
//        instantiate new obj medea from Book class using 0 param constructor
//        Book method 'obj.setMethod' must be called to initialise obj data

        Book medea = new Book();
        medea.setAuthor("Rosie Hewlett");
        medea.setTitle("Medea");
        medea.setLanguage("English");
        medea.setYearMade(2024);
        medea.setPageNo(500);

//      initialised obj values must be called using 'obj.getMethod'
        System.out.println("The book " + medea.getTitle() + " was written by " + medea.getAuthor() + " in " + medea.getYearMade() + " and has " + medea.getPageNo() + " pages.");


//       POLYMORPHISM
//       gives general instructions with specific outputs dependent on subclass' unique attributes
//       allows a method defined in base class and inherited by subclass to return output specific to subclass
//       in this example, Book class has a unique attribute 'pageNo' (see Book.java ln 32)
//       whereas eBook class has 'duration' (see eBook.java ln 22)

//       Polymorphism is done via
//        1. Method Overloading
//          Where there is more than one method with the SAME NAME in the SAME CLASS but DIFF params and/or TYPE of params

//        2. Method Overriding
//        When a method with the SAME NAME is INHERITED by a SUBCLASS but req. an implementation SPECIFIC to the Subclass
//        see Book class ln 9; 30 for examples


//      instantiate new obj clytemnestra from Book class using specific params
//      Book specific param constructor called from Book class
        Book clytemnestra = new Book("Costanza Costati", "Clytemnestra", "English", 2024, 600);

//      display clytemnestra obj with initialised values
//      Override method in Book class used to format initialised values concat. with String
//      see Book class, ln 30 - 33
        System.out.println(clytemnestra);


//      INITIALISE NEW OBJs FROM eBOOK class
        eBook babylonia = new eBook("Costanza Costati","Babylonia","English",2024,"3 hours");
        System.out.println(babylonia);

        eBook bible = new eBook("Christ Himself","the Bible","English",0,"A lifetime");
        System.out.println(bible);

        eBook harrypotter = new eBook("JK Terfling","Harry Potter and the Terrible Tweets of Transphobia","English",2024,"TOO LONG");
        System.out.println(harrypotter);

        eBook percyjackson = new eBook("Rick Riordan","Percy Jackson","English",1500,"7 hours");
        System.out.println(percyjackson);


//      ABSTRACT METHOD USE
        babylonia.getSales();
        clytemnestra.getSales();

//     Instantiate new Radio obj called programme
//     programme can access methods IMPLEMENTED from Music and Podcast Interfaces
        Radio programme = new Radio();
        programme.listenToNarrator();
        programme.playSong();


        //       ARRAYS AND FOR LOOPS

//      objects created from Art class placed into array called books
//      parentClassName[] nameOfArray = {obj1, obj2, obj3};
        Art[] books = {medea, clytemnestra, babylonia, bible, harrypotter, percyjackson};

//      Unpacks each element from books array and separates them with "--------------"
//      'item' refers to each element(object) in books array
        for (Art item: books) {
            System.out.println("*--------------------------------------------------------*");
            System.out.println(item);


            Book newBook = new Book();
            try {
                newBook.writeBook("Harry Potter");
                newBook.writeBook("Percy Jackson");
            } catch (plagiarisedBook e) {
                System.out.println("\nTry again! " + e.getMessage());
            } finally {
                System.out.println("Skibidi");
            }
        }
        }
}