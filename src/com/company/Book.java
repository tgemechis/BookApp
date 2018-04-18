package com.company;

public class Book {
    private long id;
    private String Title;
    private String Author;
    private String Year;
    private String Avail;
    private String Isbn;

    public Book(long id, String title, String author, String year, String avail, String isbn) {
        this.id = id;
        Title = title;
        Author = author;
        Year = year;
        Avail = avail;
        Isbn = isbn;
    }

    public Book() {
        Avail="Available";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getAvail() {
        return Avail;
    }

    public void setAvail(String avail) {
        Avail = avail;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
}
