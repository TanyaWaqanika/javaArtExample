package com.qa;

public class eBook extends Art {

    public eBook(String author, String title, String language, int yearMade, String duration){
        super(author,title,language,yearMade);
        this.setDuration(duration);
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void getSales(){
        System.out.println("Buy more ebooks!");
    }

    @Override
    public String toString(){
        return "The book " + this.getTitle() + " was written by " + this.getAuthor() + " in " + this.getYearMade() + " and has a runtime of " + this.getDuration() + ".";
    }

    private String duration;
}
