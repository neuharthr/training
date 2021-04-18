package com.test;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }
   
    // Marks the book as rented
    public void rented() {
        this.borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Lord of the Rings");
        System.out.println("Title (should be The Lord of the Rings): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 