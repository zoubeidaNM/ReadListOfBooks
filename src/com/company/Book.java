package com.company;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String description;

    public void initialize(String totitle, String toauthor, String todescription) {
        title = totitle;
        author = toauthor;
        description = todescription;
    }

    public void displayItems() {
        System.out.println("Book Title       : " + title + ".");
        System.out.println("Book author      : " + author + ".");
        System.out.println("Book description : " + description + ".");
    }

}
