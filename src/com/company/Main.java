package com.company;

//commit test
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> ourbooks = new ArrayList<>();
        ArrayList<Book> borrowBooks = new ArrayList<>();
        boolean discontinue = false;
        Book aBook;
        aBook = new Book();

        String bookAnswer;



        String theTitle="";
        int option;

        do {
            System.out.println("1. List books?");
            System.out.println("2. Add books");
            System.out.println("3. Borrow books");
            System.out.println("4. Return books");

            System.out.println("Select one 1 to 4");
            option = keyboard.nextInt();
            keyboard.nextLine();

            if (option == 1) {
//To list
                for (Book mybook: ourbooks) {
                    System.out.println("Title: " + mybook.getTitle());
                    System.out.println("Author: " + mybook.getAuthor());
                    System.out.println("Year of publications: " + mybook.getYear());
                    System.out.println("ISBN: " + mybook.getIsbn());
                    System.out.println("Availability: " + mybook.getAvail());
                }
            }


//To add
            else if (option == 2) {
                aBook = new Book();
                System.out.println("Enter the book ID");
                aBook.setId(keyboard.nextLong());
                keyboard.nextLine();

                System.out.println("Enter the book title");
                aBook.setTitle(keyboard.nextLine());
                System.out.println("Enter the name of the author");
                aBook.setAuthor(keyboard.nextLine());
                System.out.println("Enter the publication year");
                aBook.setYear(keyboard.nextLine());
                System.out.println("Enter ISBN");
                aBook.setIsbn(keyboard.nextLine());
                ourbooks.add(aBook);
//available books
            }


            else if (option == 3) {
                System.out.println("Available books...");
                for(Book eachBook:ourbooks){
                    System.out.println(eachBook.getTitle());
                    System.out.println(eachBook.getAvail());
                    System.out.println();
                }


 //to borrow

                System.out.println("Enter the title of the book or ID to borrow");
                bookAnswer = keyboard.nextLine();


                for(Book eachBook:ourbooks){
                    if(eachBook.getTitle().equalsIgnoreCase(bookAnswer) || String.valueOf(eachBook.getId()).equalsIgnoreCase(bookAnswer)) {
                        eachBook.setAvail(eachBook.getTitle() + " has been borrowed");
                        borrowBooks.add(eachBook);

                    }

               }

                for(Book eachBook:ourbooks){
                    System.out.println(eachBook.getTitle());
                    System.out.println(eachBook.getAvail());
                    System.out.println();
                }

}

//To return
             else if(option == 4)
             {
                 System.out.println("Return book");
                 Book toReturn = new Book();


                 System.out.println("Enter the book to return");
                 theTitle = keyboard.nextLine();


                 for(Book eachBook: ourbooks)
                {
                    if(theTitle.equalsIgnoreCase(eachBook.getTitle()))
                    {
                    toReturn = eachBook;
                }
                }
                 if(toReturn.getAvail().equalsIgnoreCase("Available"))
                 {
                     System.out.println("This book is already available");
                 }
                 else
                 {
                     toReturn.setAvail("Available");
                     System.out.println(toReturn.getTitle()+ " has been returned");
                 }
                    //Make sure the library's records are updated

                    ourbooks.set(ourbooks.indexOf(toReturn), toReturn);
             }

            else if(option==5)
            {
                discontinue = true;
            }

        } while (!discontinue);
    }
}