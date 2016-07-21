package com.example.dhkansat.librarymenagement.Model;

/**
 * Created by DH Kansat on 7/20/2016.
 */
public class Book {
    private int idBook;
    private String nameBook;
    private String writerNameBook;

    public Book(int idBook, String nameBook, String writerNameBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.writerNameBook = writerNameBook;
    }
    public Book(String nameBook, String writerNameBook) {
        this.nameBook = nameBook;
        this.writerNameBook = writerNameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getWriterNameBook() {
        return writerNameBook;
    }

    @Override
    public String toString() {
        return nameBook+writerNameBook;
    }
}
