package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //create an array list of type Books
        //when you specify the type like you have below (in the <>'s)you are using Generics
        ArrayList<Book> books = new ArrayList<Book>();


        Scanner keyboard = new Scanner(System.in);

        //Answer Yes [y,Y] or no [n,N] to continue or stop entering book records
        String answer = "";

        // print header
        System.out.println("*--------------------------------------------------*");
        System.out.println("*-----------Book list entry------------------------*");
        System.out.println("*--------------------------------------------------*");

        do {

            // create a new Book object

            Book book = new Book();

            // ask the user to enter the book information and scan his entries
            System.out.println("Enter a book title ");
            String title = keyboard.nextLine();
            System.out.println("Enter the author ");
            String author = keyboard.nextLine();
            System.out.println("Enter the book description ");
            String description = keyboard.nextLine();

            //initialize book
            book.initialize(title, author, description);
            // add book to the booklist
            books.add(book);

            // ask the user if he want to continue
            System.out.println("Do you want to continue (Y/N)");

            // make sure that the user answer is valid
            do {
                // get the answer from the user
                answer = keyboard.next();
                keyboard.nextLine();
            } while (!checkIfAnswerValid(answer));


        } while (answer.equalsIgnoreCase("y"));

        // print to the console what the user entered.
        System.out.println("*--------------------------------------------------*");
        for (Book book : books) {
            book.displayItems();
             System.out.println("*--------------------------------------------------*");
        }


    }

    // check if the answer is Yes [y,Y] or no [n,N]
    public static boolean checkIfAnswerValid(String answer) {

        if ((answer.equalsIgnoreCase("y")) || (answer.equalsIgnoreCase("n"))) {
            return true;
        } else {
            // ask the user to enter a valid answer
            System.out.println("Please, answer [y]or[Y] for Yes or [n]or[N] for No.\n");
            return false;
        }
    }


}

